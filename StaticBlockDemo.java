package Javabean;

import java.util.Scanner;
//declare class StaticBlockDemo
public class StaticBlockDemo {
//declare two static variable
//the static block is used to initialize these variables by taking input from the user
  private static String name;
  private static int id;

  static {
//we create a Scanner object to read user input 
  	
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter your name: ");
//the user to enter their name and store it in the name variable
      name = scanner.nextLine();

      System.out.print("Enter your ID: ");
//the user to enter their name and store it in the id variable        
      id = scanner.nextInt();

      scanner.close();
  }

  public static void main(String[] args) {
//print the values of the name and id variables.
      System.out.println("Name: " + name);
      System.out.println("ID: " + id);
  }
}
