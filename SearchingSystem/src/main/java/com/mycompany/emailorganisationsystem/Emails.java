/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;

public class Emails {
    
    //initualisation to default
    private String Subject = "Undeclared";
    private String RelatedTopic = "Undeclared";
    private String Message = "Undeclared";
    private String Date = "Undeclared";

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getRelatedTopic() {
        return RelatedTopic;
    }

    public void setRelatedTopic(String RelatedTopic) {
        this.RelatedTopic = RelatedTopic;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

}

