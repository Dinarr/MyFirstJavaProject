package tasksalways;

import java.util.Scanner;

public class CampusHours {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time;
		boolean campusOpen;
		System.out.println("Please enter time to check campus hours:");
	    time = input.nextInt();
    //time > 8 || time > 24 ==> 
		if (time >= 0 && time < 24 ) {
		if (time >= 8 && time < 24) {
			campusOpen = true;
		} 
		else {	
			campusOpen = false;
			}
			System.out.println("Campus open: " + campusOpen);
		}
		else {
			System.out.println("Invalid time. Try again!!!");
		}
		}
	}

