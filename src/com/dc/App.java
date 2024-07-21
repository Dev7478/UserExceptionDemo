package com.dc;

import java.util.Scanner;

import com.dc.except.StudentRollException;
import com.dc.models.*;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll of the student:: ");
		long roll = sc.nextLong();
		sc.nextLine();		
		System.out.println("Enter name of the student:: ");
		String sname = sc.nextLine();	
		System.out.println("Enter Marks % of the student:: ");
		double mp = sc.nextDouble();
		Student st = null;
		try {
			if(roll<=0) {
				throw new StudentRollException(roll);
			}
			 st = new Student(roll,sname,mp);
		}catch(StudentRollException ex) {
			System.out.println(ex);
			roll = 1;
			st = new Student(roll,sname, mp);
		} finally {
			System.out.println(st);
		}
		
	}

}
