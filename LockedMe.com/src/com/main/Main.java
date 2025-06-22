package com.main;

import com.operations.FileOperations;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("================================");
		System.out.println("|    Welcome to LockedMe.com   |");
		System.out.println("| Developed By - Mohit Gangwar |");
		System.out.println("================================");
		
		int choice1;
		int choice2;
		String returnMessage;
		WorkflowMenus menu = new WorkflowMenus();
		FileOperations operations = new FileOperations();
		
		do {
			choice1 = menu.mainMenuOptions();
			
			switch(choice1) {
			case 1:
				operations.listAllFiles();
				break;
			
			case 2:
				do {
					choice2 = menu.subMenuOptions();
					
					switch(choice2) {
					case 1:
						returnMessage = operations.addFile();
						System.out.println(returnMessage);
						break;
						
					case 2:
						returnMessage = operations.deleteFile();
						System.out.println(returnMessage);
						break;
						
					case 3:
						returnMessage = operations.searchFile();
						System.out.println(returnMessage);
						break;
					
					case 4:
						System.out.println("Back to Main Menu");
						break;
						
					default:
						System.out.println("Please enter a valid choice");						
					}
					
					System.out.println("--------------------------------------------------");	
				}while(choice2 != 4);
				break;
				
			case 3:
				System.out.println("Exited Successfully");
				System.out.println("Thank you!!");
				break;
			
			default:
				System.out.println("Please enter a valid choice");
			}
			
			System.out.println("--------------------------------------------------");	
		}while(choice1 != 3);
	}
}
