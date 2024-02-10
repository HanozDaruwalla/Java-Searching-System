/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;
import java.util.Scanner;


public class User_Login_System{
    
    public void Bespoke_Login_Variables(){
        String DbUsername = "Undeclared";
        String DbPassword = "Undeclared";
        String Login_Type = "Undeclared";
    }
    
    public static void Login(Scanner Imported_User_Input, String DbUsername,String DbPassword, String Login_Type) {
        
        int i = 3;
        String First_Password, First_Username = "Undeclared";
        
        Users User_Login_Attempt = new Users();
        
        System.out.println(InterfaceDesigns.Stars +  " Welcome To "+ Login_Type +" Login! " + InterfaceDesigns.Stars +" \n");
        while(i >=1){//while user hasnt had 3 attempts
            System.out.println("Please enter your Username.....");
            First_Username = Imported_User_Input.nextLine();
            System.out.println("\n");
            System.out.println("Please enter your Password.....");
            First_Password = Imported_User_Input.nextLine();
            System.out.println("\n");
            
            //if username @ pw correct
            if(First_Username.equals(DbUsername) && First_Password.equals(DbPassword)){
                SuccessfulLogin(Imported_User_Input, Login_Type);
                break;
            //                   !!!!!!!!!!!!! OCL IMPLEMENTED HERE !!!!!!!!!!    
            }else if(First_Username.equals("") || First_Password.equals("") ){    
                System.out.println(InterfaceDesigns.Exclamation_Marks + "Please Don't Leave Blank" + InterfaceDesigns.Exclamation_Marks + "\n");
            }else{
                i=i-1;//loops and takes away attempt
                System.out.println(InterfaceDesigns.Exclamation_Marks + i + " Attempts Left " + InterfaceDesigns.Exclamation_Marks);
            }
        }
        if (i==0){//if 3 tries then outputs msgs and closes
            User_Login_Attempt.setLogin(false);
            UnsuccessfulLogin(User_Login_Attempt);        
        }
    }
    
    private static void SuccessfulLogin(Scanner Imported_User_Input, String Login_Type){
    //runs if the login by user is successful 
        
    //calls THIS non static class function from static function (object is a object of class its going to.
    Prepare_Searching_System System = new Prepare_Searching_System();
    
    //                   !!!!!!!!!!!!! OCL IMPLEMENTED HERE !!!!!!!!!!     
    Users User;
    if(Login_Type.equals("Customer")){
        User = new Customer();       
    }else{
        User = new Employee(); 
    }
    //creates suitable instance of object and passes it to Prepare_Searching_System
    System.User_Data(Imported_User_Input,User);    
    }    
    
    private static void UnsuccessfulLogin(Users User){//runs if non-successful login
        
        if(User.getLogin() == false){
            System.out.println(InterfaceDesigns.Spaces);
            System.out.println("Login Details Incorrect! \n");
            System.out.println(InterfaceDesigns.Exclamation_Marks + "Shutting Down" + InterfaceDesigns.Exclamation_Marks);        
        }else{
            System.out.println("Error Incorrect Login Result Found!");
        }
    }
}
