/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;

// Command interface


interface Command {
    void execute(String Imported_Keywords);
}

// ConcreteCommand
public class ConcreteCommand implements Command {
    private Receiver receiver;

    // Constructor to initialize the receiver
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    // Implementing the execute method
    @Override
    public void execute(String Imported_Keywords) {
        // Call a method on the receiver     
        receiver.performAction(Imported_Keywords);
    }
    
}



