/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;

import java.util.Scanner;
//import java.util.ArrayList;

interface Prepare_SearchAndSortInterface{
    public void Prepare_SearchEmailDatabase(Scanner Imported_User_Input, Users User);
    public void User_Data(Scanner Imported_User_Input, Users User);
    public Boolean Keyword_Check(String Temp_Keyword);
}

public class Prepare_Searching_System implements Prepare_SearchAndSortInterface {
    
    @Override
    public void Prepare_SearchEmailDatabase(Scanner Imported_User_Input, Users User){     
        Boolean Loop = true;
        String Temp_Keyword = "";
        
        while(Loop = true){  
            System.out.println(InterfaceDesigns.Spaces);
            System.out.println(InterfaceDesigns.Lines + "Welcome To The Searching System" + InterfaceDesigns.Lines + "\n");
            
            //outputs user info
            System.out.println("User = " + User.getName());
            System.out.println("Type Of User = " + User.getType_Of_User());
            System.out.println("Department = " + User.getDepartment());
        
            System.out.println("\n");
            System.out.println("");
            System.out.println("Enter A Keyword (if 60% of keyword matches it will pick up) \n");
            Temp_Keyword = Imported_User_Input.nextLine();
            Keyword_Check(Temp_Keyword);         
        }      
    }
    @Override
    public Boolean Keyword_Check(String Temp_Keyword){
        //passes the keyword to the command pattern if meets validation rules
        //validation rules = !(' ', '.', ',' or ';'\n) 
        if(!(Temp_Keyword.equals("") || Temp_Keyword.equals(" ") || Temp_Keyword.equals(",") || Temp_Keyword.equals(";") || Temp_Keyword.equals("."))) {
                Client.EntryPoint(Temp_Keyword);
                return true;
            }else{
                System.out.println("Please Do Not Use Chars like ' ', '.', ',' or ';'\n ");
                return false;//re-loops
            }
    }
    
    @Override
    public void User_Data(Scanner Imported_User_Input, Users User){
        String Chosen_Department;
        System.out.println(InterfaceDesigns.Spaces);
        System.out.println(InterfaceDesigns.Lines + "Welcome To The Searching System" + InterfaceDesigns.Lines + "\n");
        boolean loop = true; 
        
        while (loop == true){//while no valid option done
            System.out.println("What Department are you in ('Sales', 'Computing' or 'Human Resources'?");
            Chosen_Department = Imported_User_Input.nextLine();
            
            switch (Chosen_Department){                
                case "Sales"://if depeartment = sales. set Customer/Employee department.
                    User.setDepartment("Sales"); 
                    loop = false;
                    break;    
                case "Computing"://if depeartment = Computing. set Customer/Employee department.
                    User.setDepartment("Computing");
                    loop = false;//breaks loop
                    break;    
                case "Human Resources"://if depeartment = Human Resources. set Customer/Employee department.
                    User.setDepartment("Human Resources");
                    loop = false;
                    break;    
                default:
                    System.out.println("Unknown Department");//loops
                }
        }
        //get user data
        Prepare_SearchEmailDatabase(Imported_User_Input, User);
    }
}
