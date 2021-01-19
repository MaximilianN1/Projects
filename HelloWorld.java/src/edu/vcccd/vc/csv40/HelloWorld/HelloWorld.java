package edu.vcccd.vc.csv40.HelloWorld;


/**
 * CS V40 Beginning Java
 * Assignment: HelloWorld
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author [Maximilian Nielsen, maximilian_nielsen1@my.vcccd.edu]
 */
import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Enter some number");
		 int user_input_number = scan.nextInt();

		 System.out.println("Hello, World!");
	}
}