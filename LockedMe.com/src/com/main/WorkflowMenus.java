package com.main;

import java.util.Scanner;

public class WorkflowMenus {

	private Scanner sc = new Scanner(System.in);

	public int mainMenuOptions() {

		int choice1 = -1;
		while (true) {
			System.out.println("Main Menu:");
			System.out.println("  1. Display all files in the Directory");
			System.out.println("  2. File Manager (Add / Delete / Search)");
			System.out.println("  3. Exit the Application");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your choice (1-3):");

			try {
				choice1 = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Please enter a valid choice "+e);
				System.out.println("--------------------------------------------------");
				sc.nextLine();
			}
		}

		return choice1;
	}
	
	
	public int subMenuOptions() {
		
		int choice2 = -1;
		while (true) {
			System.out.println("File Manager:");
			System.out.println("  1. Add a File");
			System.out.println("  2. Delete a File");
			System.out.println("  3. Search a file");
			System.out.println("  4. Return to Main Menu");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your choice (1-4):");
			
			try {
				choice2 = sc.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("Please enter a valid choice "+e);
				System.out.println("--------------------------------------------------");
				sc.nextLine();
			}
		}
		
		return choice2;
	}
}
