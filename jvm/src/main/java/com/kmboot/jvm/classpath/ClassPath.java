package com.kmboot.jvm.classpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import com.kmboot.jvm.cmd.JVMOption;
import com.kmboot.jvm.cmd.StandardArgs;

import lombok.Data;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ClassPath {
	
	@Setter(lombok.AccessLevel.PACKAGE)
	private Map<String, Boolean> entries = new HashMap<>();

	public ClassPath(StandardArgs args, JVMOption option) {
		this.parseClassPath(args.getClasspath());
	}

	private void parseClassPath(String classPath) {
		try (Stream<Path> stream = Files.list(Paths.get(classPath))) {
			stream.forEach(path -> {
				this.entries.put(path.toString(), false);
			});
		} catch (IOException e) {
			log.error("Unable to parse classpath: {}", classPath);
		}
	}
}
