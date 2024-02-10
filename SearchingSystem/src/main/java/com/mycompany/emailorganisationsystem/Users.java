/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailorganisationsystem;

public class Users {//superclass for Employee and Customer
    private String Name = "Unclassified";
    private String Username = "Unclassified";
    private String Password = "Unclassified";
    private String Type_Of_User = "Unclassified";
    public String Department = "Unclassified";
    public Boolean Login = false;

    public Boolean getLogin() {
        return Login;
    }

    public void setLogin(Boolean Login) {
        this.Login = Login;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getType_Of_User() {
        return Type_Of_User;
    }

    public void setType_Of_User(String Type_Of_User) {
        this.Type_Of_User = Type_Of_User;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
}

class Employee extends Users{//child class to Users
    private String Name;
    private String Type_Of_User;
    
    //constructor (must be same name as the class
    public Employee(){
        this.Name = "Steve Michael";
        this.Type_Of_User = "Employee";
    }
    
    public Boolean getLogin() {
        return Login;
    }

    public void setLogin(Boolean Login) {
        this.Login = Login;
    }    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String Department) {
        this.Department = Department;
    }
    public String getType_Of_User() {
        return Type_Of_User;
    }
    public void setType_Of_User(String Type_Of_User) {
        this.Type_Of_User = Type_Of_User;
    }
}

class Customer extends Users{//child class to Users
    
    private static String Name;
    private String Type_Of_User;
    
    public Customer(){
        this.Name = "Alex Carter";
        this.Type_Of_User = "Customer";
    }

    public Boolean getLogin() {
        return Login;
    }

    public void setLogin(Boolean Login) {
        this.Login = Login;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        Customer.Name = Name;
    }
    
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getType_Of_User() {
        return Type_Of_User;
    }
    public void setType_Of_User(String Type_Of_User) {
        this.Type_Of_User = Type_Of_User;
    }
   
}

class Correct_Employee_Login extends Employee{ // Username  @ Password determined here 
    private String Name = "Steve Michael";
    private String Username = "Steve.M";
    private String Password = "Password";
    private String Department = "Unclassified";

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String Department) {
        this.Department = Department;
    }
}

class Correct_Customer_Login extends Customer{ // Username  @ Password determined here
    private static String Name = "Alex Carter";
    private static String Username = "Alex.C";
    private static String Password = "Password";

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
   
}