/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;
import java.util.ArrayList;

public class EmailSamples {
    
    //Declaration
    ArrayList <Emails> List_Of_Emails = new ArrayList();
    Emails Stored_Email_1;
    Emails Stored_Email_2;
    Emails Stored_Email_3;
    Emails Stored_Email_4;
    Emails Stored_Email_5;
    Emails Stored_Email_6;
    Emails Stored_Email_7;
    Emails Stored_Email_8;
    Emails Stored_Email_9;
    Emails Stored_Email_10;
    
    public void Example_Email_Generator(){
    
    Stored_Email_1.setSubject("Sales Campaign Recap");
    Stored_Email_1.setRelatedTopic("Sales");
    Stored_Email_1.setMessage("I wanted to provide you with an update on the recent sales campaign. Our team has successfully executed the plan, resulting in a significant increase in sales and positive feedback from clients. Please review the attached report for more detailed information.");
    Stored_Email_1.setDate("15/1/21");
    
    Stored_Email_2.setSubject("Database Error");
    Stored_Email_2.setRelatedTopic("Computing");
    Stored_Email_2.setMessage("The database is not saving any new data which is entered, it has emails from 23/3/23 and back however, newer emails are missing which are posing challenges.");
    Stored_Email_2.setDate("21/1/22");

    Stored_Email_3.setSubject("Employee Training Update");
    Stored_Email_3.setRelatedTopic("Human Resources");
    Stored_Email_3.setMessage("This is to inform you about the progress of the ongoing employee training program. Participants are responding positively and the training is Successfully being delivered.");
    Stored_Email_3.setDate("12/1/21");
    
    Stored_Email_4.setSubject("Project Milestone Achieved");
    Stored_Email_4.setRelatedTopic("Computing");
    Stored_Email_4.setMessage("I am pleased to share that we have reached a crucial milestone in our latest computing project. The team has worked diligently and Successfully to meet deadlines and deliver exceptional results. Attached is a summary of the achievements and next steps for your reference.");
    Stored_Email_4.setDate("05/2/22");
    
    Stored_Email_5.setSubject("Sales Performance Analysis");
    Stored_Email_5.setRelatedTopic("Sales");
    Stored_Email_5.setMessage("Our sales team has conducted a thorough analysis of the recent quarter's performance. The attached report outlines key metrics, challenges, and proposed strategies for improvement. Your insights and feedback on the findings would be valuable as we plan our next steps.");
    Stored_Email_5.setDate("04/10/23");
    
    Stored_Email_6.setSubject("Project Milestone Achieved");
    Stored_Email_6.setRelatedTopic("Computing");
    Stored_Email_6.setMessage("As we onboard new team members, it's essential to revisit the highlights of our recent computing project. The attached document summarizes project goals, challenges, and achievements. Please take a moment to review and share your thoughts of the drawbacks and succesfulness during our upcoming meeting on 4/2/24.");
    Stored_Email_6.setDate("24/6/23");
    
    Stored_Email_7.setSubject("Salary Adjustment Notification");
    Stored_Email_7.setRelatedTopic("Human Resources");
    Stored_Email_7.setMessage("I am pleased to share that we have reached a crucial milestone in our latest computing project. The team has worked diligently to meet deadlines and deliver exceptional results. Attached is a summary of the achievements and next steps for your reference.");
    Stored_Email_7.setDate("05/2/24");
    
    Stored_Email_8.setSubject("Sales Forecast and Strategy");
    Stored_Email_8.setRelatedTopic("Sales");
    Stored_Email_8.setMessage("As we navigate this challenging upcoming quarter, it's crucial to align our efforts with our sales forecast and strategy. Enclosed is a document summarizing projected sales figures, market trends, and the proposed strategy for achieving targets. Your insights and suggestions on how we can optimize our approach would be highly valuable. Let's schedule a meeting on 8/2/24 to discuss further.");
    Stored_Email_8.setDate("23/12/23");
        
    Stored_Email_9.setSubject("Salary Adjustment Notification");
    Stored_Email_9.setRelatedTopic("Computing");
    Stored_Email_9.setMessage("In light of the increasing importance of cybersecurity, we are initiating a comprehensive IT security awareness training program for all team members. The attached schedule provides details on training modules, key topics, and practical tips to enhance our computing security practices. Your active participation and commitment to implementing these measures are crucial in safeguarding our digital assets. Let's ensure a secure computing environment for everyone.");
    Stored_Email_9.setDate("15/8/21");    
    
    Stored_Email_10.setSubject("Employee Engagement Survey Results");
    Stored_Email_10.setRelatedTopic("Human Resources");
    Stored_Email_10.setMessage("I am excited to share the results of our recent Employee Engagement Survey. The attached report outlines key findings, employee feedback, and areas identified for improvement. Your participation and input have been invaluable in shaping our workplace culture. Let's schedule a team meeting on 9/5/24 to discuss actionable steps and initiatives based on the survey insights.");
    Stored_Email_10.setDate("28/10/22");
    
    //Add all emauls to Arraylist
    List_Of_Emails.add(Stored_Email_1);
    List_Of_Emails.add(Stored_Email_2);
    List_Of_Emails.add(Stored_Email_3);
    List_Of_Emails.add(Stored_Email_4);
    List_Of_Emails.add(Stored_Email_5);
    List_Of_Emails.add(Stored_Email_6);
    List_Of_Emails.add(Stored_Email_7);
    List_Of_Emails.add(Stored_Email_8);
    List_Of_Emails.add(Stored_Email_9);
    List_Of_Emails.add(Stored_Email_10);
    }
    
}
