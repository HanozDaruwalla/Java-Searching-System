/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;

/* NO LONGER IN USE. CODE MOVED TO RECIEVER CLASS
import java.util.ArrayList;

interface Database_Interface{
    public void SearchEmailKeywords(String Imported_Temp_Keyword);
}
public class Database implements Database_Interface {
    
    @Override
    public void SearchEmailKeywords(String Imported_Keyword){
        ArrayList<Integer> Matching_Email_Number = new ArrayList();
        int Char_Matching = 0;
        int Char_iteration = 0;

        //Generate Sample Emails
        EmailSamples Stored_Email_Class = new EmailSamples();
        
        Stored_Email_Class.Stored_Email_1 = new Emails();
        Stored_Email_Class.Stored_Email_2 = new Emails();
        Stored_Email_Class.Stored_Email_3 = new Emails();
        Stored_Email_Class.Stored_Email_4 = new Emails();
        Stored_Email_Class.Stored_Email_5 = new Emails();
        Stored_Email_Class.Stored_Email_6 = new Emails();
        Stored_Email_Class.Stored_Email_7 = new Emails();
        Stored_Email_Class.Stored_Email_8 = new Emails();
        Stored_Email_Class.Stored_Email_9 = new Emails();
        Stored_Email_Class.Stored_Email_10 = new Emails();
        Stored_Email_Class.Example_Email_Generator();
        
        for(int i = 0 ; i<Stored_Email_Class.List_Of_Emails.size(); i++){//iterates through list of 10 emails
            Char_Matching = 0;
            String Email_Message;
            Emails Current_Email = Stored_Email_Class.List_Of_Emails.get(i);
            //make messages not case sensative
            Email_Message = Current_Email.getMessage().toLowerCase();
            Imported_Keyword = Imported_Keyword.toLowerCase();
            
            for(int j=0; j<Email_Message.length(); j++){//looping through email msg
                //if keyword is in message add index to arraylist
                if (Email_Message.contains(Imported_Keyword) && Email_Message.charAt(j) != ' ') {
                    Matching_Email_Number.add(i);
                    System.out.println("Email" + i + " Contains Keywords");
                    break;                   
                }else {
                   continue;
                }    
            }
        }
        ListOutput OutputClass = new ListOutput(); 
        OutputClass.GetData_For_Output(Matching_Email_Number);
    }           
}
*/