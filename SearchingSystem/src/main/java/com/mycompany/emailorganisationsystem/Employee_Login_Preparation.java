/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;
import java.util.Scanner;

public class Employee_Login_Preparation extends User_Login_System {

    public static void Bespoke_Login_Variables(Scanner Imported_User_Input){
        //Employee Specific Required Details.
        Correct_Employee_Login Employee_Correct_Details = new Correct_Employee_Login();
        String DbUsername_Setup = Employee_Correct_Details.getUsername();
        String DbPassword_Setup = Employee_Correct_Details.getPassword();
        String Login_Type = "Employee";
        User_Login_System.Login(Imported_User_Input, DbUsername_Setup,DbPassword_Setup, Login_Type);
    
    }       
}
