package com.kmboot.jvm.runtime;

import com.kmboot.jvm.classpath.ClassPath;

public class ClassLoader {
	private ClassPath classPath;
	private static ClassLoader classLoader;

	private ClassLoader() {
		//
	}

	public ClassLoader bootLoader(ClassPath clazzPath, boolean verbose) {
		this.classPath = clazzPath;
		return classLoader;
	}
}
