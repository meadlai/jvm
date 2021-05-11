package com.kmboot.jvm.cmd;

import com.beust.jcommander.Parameter;

import lombok.Data;

@Data
public class StandardArgs {
	@Parameter(names = { "--classpath", "-cp" }, description = "Classpath", required = false)
	private String classpath;

	@Parameter(names = { "--mainclass", "-mc" }, description = "Main Class", required = false)
	private String main;
}
