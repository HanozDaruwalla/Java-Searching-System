/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;

import java.util.ArrayList;
import java.util.Scanner;

interface ListOutput_Interface{//interface
    public void GetData_For_Output(ArrayList<Integer> Imported_Found_Emails);
    public void Output(ArrayList<String> Found_Emails);
    
}
    
public class ListOutput implements ListOutput_Interface {
    int Email_Number = 0;
    Scanner User_Input = new Scanner(System.in);
    
    
    @Override
    public void Output(ArrayList<String> Temp_Email){//each email in the arraylist is passed through this function in an arraylist and is outputted.
        System.out.println(InterfaceDesigns.Lines + InterfaceDesigns.Lines + InterfaceDesigns.Lines + "\n");
        System.out.println("Email Number " + (Email_Number) + ": \n");
        System.out.println("Subject: " + Temp_Email.get(0));
        System.out.println("Related Topic: " + Temp_Email.get(1));
        System.out.println("Text: " + Temp_Email.get(2));
        System.out.println("Date: " + Temp_Email.get(3)+"\n");
        Email_Number += 1;
    }

    @Override
    public void GetData_For_Output(ArrayList<Integer> Imported_Found_Emails){
        EmailSamples Email_Gatherer = new EmailSamples();
        
        
        System.out.println(InterfaceDesigns.Spaces);
        System.out.println(InterfaceDesigns.Stars + InterfaceDesigns.Stars + InterfaceDesigns.Stars + InterfaceDesigns.Stars + InterfaceDesigns.Stars + " Matching Emails " + InterfaceDesigns.Stars + InterfaceDesigns.Stars + InterfaceDesigns.Stars + InterfaceDesigns.Stars + InterfaceDesigns.Stars + "\n\n\n" );
        
        //initualises each Email
        Email_Gatherer.Stored_Email_1 = new Emails();
        Email_Gatherer.Stored_Email_2 = new Emails();
        Email_Gatherer.Stored_Email_3 = new Emails();
        Email_Gatherer.Stored_Email_4 = new Emails();
        Email_Gatherer.Stored_Email_5 = new Emails();
        Email_Gatherer.Stored_Email_6 = new Emails();
        Email_Gatherer.Stored_Email_7 = new Emails();
        Email_Gatherer.Stored_Email_8 = new Emails();
        Email_Gatherer.Stored_Email_9 = new Emails();
        Email_Gatherer.Stored_Email_10 = new Emails();
        Email_Gatherer.Example_Email_Generator();//set email samples 
        
        for(int i = 0; i<Imported_Found_Emails.size(); i++){ //goes through every email in Validated arraylist
            int Email_Index = Imported_Found_Emails.get(i);
            ArrayList Stored_Emails = new ArrayList();
            
            switch(Email_Index){//gets the email data from EmailSamples class depending on what emails contain keywords. Adds each value from the getters to an arraylist and outputs it.
                case 0:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_1.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_1.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_1.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_1.getDate());
                    Output(Stored_Emails);
                    break;
                case 1:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_2.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_2.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_2.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_2.getDate());
                    Output(Stored_Emails);
                    break;
                case 2:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_3.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_3.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_3.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_3.getDate());
                    Output(Stored_Emails);
                    break;
                case 3:
                    System.out.println(Email_Index);
                    Stored_Emails.add(Email_Gatherer.Stored_Email_4.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_4.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_4.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_4.getDate());
                    Output(Stored_Emails);
                    break;
                case 4:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_5.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_5.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_5.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_5.getDate());
                    Output(Stored_Emails);
                    break;
                case 5: //gets the email data from EmailSamples class depending on what emails contain keywords. Adds each value from the getters to an arraylist and outputs it.
                    Stored_Emails.add(Email_Gatherer.Stored_Email_6.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_6.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_6.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_6.getDate());
                    Output(Stored_Emails);
                    break;
                case 6:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_7.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_7.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_7.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_7.getDate());
                    Output(Stored_Emails);
                    break;
                case 7:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_8.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_8.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_8.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_8.getDate());
                    Output(Stored_Emails);
                    break;
                case 8:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_9.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_9.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_9.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_9.getDate());
                    Output(Stored_Emails);
                    break;
                case 9:
                    Stored_Emails.add(Email_Gatherer.Stored_Email_10.getSubject());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_10.getRelatedTopic());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_10.getMessage());
                    Stored_Emails.add(Email_Gatherer.Stored_Email_10.getDate());
                    Output(Stored_Emails);
                    break;
                default:
                    System.out.println("Email receiever out of range");
            }    
        }
        
        if(Email_Number == 0){//if no emails in array. output error
            System.out.println("Error: No Emails Found! \n");
        }
    }
}
