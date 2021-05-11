package com.kmboot.jvm.classpath;

import lombok.Data;

@Data
public class EntryDir {
	private String path;

	public EntryDir(String dirPath) {
		this.path = dirPath;
	}
	
}
