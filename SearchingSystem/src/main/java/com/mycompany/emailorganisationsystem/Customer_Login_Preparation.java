/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;
import java.util.Scanner;

public class Customer_Login_Preparation {
    public static void Bespoke_Login_Variables(Scanner Imported_User_Input){
        
        //Customer Specific required Details
        Correct_Customer_Login Customer_Correct_Details = new Correct_Customer_Login();
        String DbUsername_Setup = Customer_Correct_Details.getUsername();
        String DbPassword_Setup = Customer_Correct_Details.getPassword();
        String Login_Type = "Customer";
        User_Login_System.Login(Imported_User_Input, DbUsername_Setup,DbPassword_Setup, Login_Type);
    
    }
}
