package com.kmboot.jvm.cmd;

import lombok.Data;

@Data
public class JVMOption {
	private String javaHome;
	private String jreHome;
	private int threadStackSize;
	private String xss;
	private boolean verbosJNI;

}
