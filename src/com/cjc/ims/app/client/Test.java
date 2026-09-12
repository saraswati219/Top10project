package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.Karvenagar;
import com.cjc.ims.app.servicei.Cjc;

public class Test {
	public static void main(String[] args) {
		Cjc c = new Karvenagar();
		while (true) {
			System.out.println("1 for addCourse() \n 2 for viewCourse() \n 3 for addFaculty() \n 4 for viewFaculty() \n 5 for addBatch() \n 6 for viewBatch() \n 7 for addStudent() \n 8 for viewStudent() \n 9 for exist");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				c.addCourse();
				break;
				
			case 2:
				c.viewCourse();
				break;
				
			case 3:
				c.addfaculty();
				break;
				
			case 4:
				c.viewFaculty();
				break;
				
			case 5:
				c.addBatch();
				break;
				
			case 6:
				c.viewBatch();
				break;
				
			case 7:
				c.addStudent();
				break;
				
			case 8:
				c.viewStudent();
				break;
				
			case 9:
				System.out.println("exit");
				System.exit(0);

			default:
				System.out.println("invalid choice");
			}
		}
	}
		

}
	
