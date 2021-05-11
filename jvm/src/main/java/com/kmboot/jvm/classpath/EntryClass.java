package com.kmboot.jvm.classpath;

import lombok.Data;

/**
 * 
 * @author meadlai
 *
 */
@Data
public class EntryClass {

	public static final int CLASS_BYTECODE_FILE_MAX = 63325;
	private String path;

	public EntryClass(String clzPath) {
		this.path = clzPath;
	}
}
