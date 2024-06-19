package Unit2;
import java.util.Scanner;
public class J206GetUserInfo
{
public static void main(String[] args)
 {
 String name;
 int age = 32;
 Scanner input = new Scanner(System.in);

 System.out.print("Enter your name: ");
 name = input.nextLine();

 System.out.print("Enter your age: ");
 age = input.nextInt();

 System.out.print("Your Name is: " + name + " and you are " +
age + " years old.");

 }
} 
