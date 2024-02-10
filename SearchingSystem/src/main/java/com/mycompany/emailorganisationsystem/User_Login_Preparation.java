/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.emailorganisationsystem;
import java.util.Scanner;

public class User_Login_Preparation{

    public static void main(String[] args) {
        Scanner User_Input = new Scanner(System.in); 
        Boolean Valid_Option = false;
        //Outputs for top of Listing Emails
      
        System.out.println(InterfaceDesigns.Spaces);
        System.out.println(InterfaceDesigns.Lines+ " Welcome To The Email Organisation System " +InterfaceDesigns.Lines +"\n");
        
        //keeps looping till user states if Customer or Employee
        while (Valid_Option == false){//loops if invalid option
            System.out.println("Are You A 'Customer' Or 'Employee/ Tester'?\n");
            String Login_Type = User_Input.nextLine();
            System.out.println("\n");
            
            switch (Login_Type) {//cases for customer or employee. passes user to correct class to collect required login data.
                case "Customer":
                    Valid_Option = true;
                    Customer Customer_Obj = new Customer();
                    Login_Type = Customer_Obj.getType_Of_User();
                    Customer_Login_Preparation.Bespoke_Login_Variables(User_Input);
                    break;
                case "Employee":
                    Valid_Option = true;
                    Employee Employee_Obj = new Employee();
                    Login_Type = Employee_Obj.getType_Of_User();
                    Employee_Login_Preparation.Bespoke_Login_Variables(User_Input);
                    break;  
                case "Tester":
                    Valid_Option = true;
                    break;
                default:
                    System.out.println("Incorrect Type Of User!\n");
                    break;      
            }
        }//end of while   
    }
    
    
}

