package com.operations;

import java.io.File;

public class RootDirectory {
	
	public static String findRootDirectory() {
		String directory = System.getProperty("user.dir");
		
		File rootDirectory = new File(directory, "root");
		if (!rootDirectory.exists()) {
			rootDirectory.mkdir();
		}
		return rootDirectory.getAbsolutePath();
	}	
}
