/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;

/**
 *
 * @author Hanoz
 */
public class Client{
    public static void EntryPoint(String Imported_Keywords){
        
        //creates instances of the classes used in the control pattern and runs them.
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.executeCommand(Imported_Keywords);
    
    }
    
}
