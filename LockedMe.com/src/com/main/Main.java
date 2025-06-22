package com.main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("================================");
		System.out.println("|    Welcome to LockedMe.com   |");
		System.out.println("| Developed By - Mohit Gangwar |");
		System.out.println("================================");
		
		int choice1;
		int choice2;
		WorkflowMenus menu = new WorkflowMenus();
		
		do {
			choice1 = menu.mainMenuOptions();
			
			switch(choice1) {
			case 1:
				System.out.println("<<List All Files>>");
				break;
			
			case 2:
				do {
					choice2 = menu.subMenuOptions();
					
					switch(choice2) {
					case 1:
						System.out.println("<<Add the file>>");
						break;
						
					case 2:
						System.out.println("<<Delete the file>>");
						break;
						
					case 3:
						System.out.println("<<Search the file>>");
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
