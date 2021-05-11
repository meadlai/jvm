package com.kmboot.jvm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore.Entry;

import com.beust.jcommander.JCommander;
import com.kmboot.jvm.classpath.ClassPath;
import com.kmboot.jvm.classpath.EntryClass;
import com.kmboot.jvm.cmd.StandardArgs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {
		StandardArgs standArg = new StandardArgs();
		JCommander mainCMD = JCommander.newBuilder().addObject(standArg).build();
		mainCMD.parse(args);
		standArg.setMain(standArg.getMain().replace(".", "" + File.separatorChar) + ".class");
		log.info("Main Class is {}", standArg.getMain());
		log.info("Class Path is {}", standArg.getClasspath());
		ClassPath cp = new ClassPath(standArg, null);
		cp.getEntries().forEach(log::warn);

		String pathFile = standArg.getClasspath() + File.separatorChar + standArg.getMain();
		try {
			byte[] bytes = Files.readAllBytes(Paths.get(pathFile));
			if(bytes.length>EntryClass.CLASS_BYTECODE_FILE_MAX) {
				//TODO: throw exception
			}
		} catch (IOException e) {
			log.error("Unable to load main class: {}", pathFile);
		}

	}

}
