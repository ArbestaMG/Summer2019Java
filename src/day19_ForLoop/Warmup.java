package day19_ForLoop;
import java.util.Scanner;
public class Warmup {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 /*
    Given: username: cybertek.batch12@gmail.com
           password: Javengers
   write a program for the login functionality of the gmail account. (user input is required)
       - username can be entered either in upper or lower case
       - password MUST be entered as it is
       - if the username does not end with "@gmail.com":
                   print "it's not a valid email address"
       - if username ends with gmail but :
                   username and password did not match:
                       print "Invalid username and password"
                   username did not match:
                       print "Invalid username"
                   password did not match:
                       print "Invalid password"
       - if the username and passwords are correct:
                   print "loged in successfully"
    
    */
   
           System.out.println("Enter your user name");
           String user = scan.nextLine().toLowerCase();
           System.out.println("Enter your password");
           String pass = scan.nextLine();
           
           String username ="cybertek.BatCH12@gmail.com";
           String password ="Javengers";
           
           if(user.endsWith("@gmail.com") ) {
               
               if(user.equalsIgnoreCase(username) && pass.equals(password) ) {
                   System.out.println("Loged in successfully");
               } else {
                   
                   if(!user.equalsIgnoreCase(username) && !pass.equals(password)) {
                       System.out.println("both username and password are incorrect");
                   } else if(!user.equalsIgnoreCase(username)){
                       System.out.println("Invalid username");
                   }else {
                       System.out.println("Invalid password");
                   }
                   
               }
               
           } else {
               System.out.println("it's not a valid email address");
           }
           
           
           
           
       }
   
   
   
   
}
