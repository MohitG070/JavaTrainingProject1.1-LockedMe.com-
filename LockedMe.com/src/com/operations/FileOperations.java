package com.operations;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperations {
	
	private final String directory = RootDirectory.findRootDirectory();
	private Scanner sc = new Scanner(System.in);
	
	
	public void listAllFiles() {
		
		File rootDirectory = new File(directory);
		File[] allFiles = rootDirectory.listFiles();
		
		if (allFiles == null || allFiles.length == 0) {
			System.out.println("No Files Found: Directory is Empty");
			return;
		}
		
		File temp = allFiles[0];
		allFiles[0] = allFiles[4];
		allFiles[4] = temp;

		Arrays.sort(allFiles);
		
		for (File file : allFiles) {
			System.out.println(file.getName());
		}
		
	}
	
	
	public String addFile() {
		
		System.out.println("Please enter the File Name:");
		String fileName = sc.next();
		
		File newFile = new File(directory+"/"+fileName);
		
		try {
			if (newFile.createNewFile()) {
				return fileName + " created successfully";
			}
			else {
				return fileName +" already exists";
			}
		}catch(Exception e) {
			return "Error Occured: " + e;
		}
	}
	
	
	public String deleteFile() {
		
		System.out.println("Please enter the File Name:");
		String fileName = sc.next();
		Path deleteFile = Paths.get(directory, fileName);
		
		File rootDirectory = new File(directory);
		File[] allFiles = rootDirectory.listFiles();
		
		boolean found = false;
		for (File file : allFiles) {
			if (file.getName().equals(fileName)) {
				found = true;
				break;
			}
		}
		
		if (!found) {
			return "File Not Found";
		}
		
		try {
			Files.delete(deleteFile);
			return fileName +" deleted successfully";
		}catch (Exception e) {
			System.out.println(e);
			return "Error Occured: "+e;
		}		
	}

	
	public String searchFile() {
		System.out.println("Please enter the File Name:");
		String fileName = sc.next();
		
		File rootDirectory = new File(directory);
		File[] allFiles = rootDirectory.listFiles();
		
		for (File file : allFiles) {
			if (file.getName().equals(fileName)) {
				return "Found "+fileName+" successfully";
			}
		}
		
		return fileName+" doesn't exists";
	}
}
