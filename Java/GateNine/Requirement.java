import java.util.Scanner;
public class Requirement {

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    String phoneMenu = ("""

        1. Add Contact
                    
        2. Remove Contact

        3. Find Contact by Phone Number 
                            
        4. Find Contact by First Name

        5. Find Contact by Last Name
    
        6. Edit Contact

        7. Exit
                
                    """);

        
System.out.println(phoneMenu);

System.out.println("You have options 1 - 7 only: ");
    int options = input.nextInt();

Switch(phoneOption);
        
            Case -> 1
        System.out.println("Enter your Name: ");
        String name = input.nextLine();

        System.out.println("Enter your lastName: ");
        String lastName = input.nextLine();

        System.out.println("Enter phone Number: ");
        String phoneNumber = input.next();


        }
}          
    

    




