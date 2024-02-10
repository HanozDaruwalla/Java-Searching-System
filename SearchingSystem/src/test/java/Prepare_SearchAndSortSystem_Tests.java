/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.emailorganisationsystem.Prepare_Searching_System;
import com.mycompany.emailorganisationsystem.Users;//may need to remove!!!!
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

/**
 *
 * @author Hanoz
 */
public class Prepare_SearchAndSortSystem_Tests {
    
    Users user;
    Scanner User_Input;
    
    public Prepare_SearchAndSortSystem_Tests() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        user = new Users();
        User_Input = new Scanner(System.in);
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    public void Run_Tests(){
        Keyword_Check_Customers();
        Keyword_Check_Success();
        Keyword_Check_FullStop();
        Keyword_Check_Null();
        Keyword_Check_Comma();
        Keyword_Check_Semi_Colon();
        Keyword_Check_Space();
    }
    //In Tests True = Keyword Accepted.  False = Keyword Not Accepted
    @Test
    void Keyword_Check_Customers(){//checks if keyword 'Customer' is accepted
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertEquals(true, system.Keyword_Check("Customer"));
    } 
    @Test
    void Keyword_Check_Success(){//checks if keyword 'Success' is accepted
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertEquals(true, system.Keyword_Check("Success"));
    } 
    @Test
    void Keyword_Check_FullStop(){//checks if keyword '' is declined
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertNotEquals(true, system.Keyword_Check("."));
    }
    @Test
    void Keyword_Check_Null(){//checks if keyword 'NULL' is declined
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertNotEquals(true, system.Keyword_Check(""));
    } 
    @Test
    void Keyword_Check_Comma(){//checks if keyword ',' is declined
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertNotEquals(true, system.Keyword_Check(","));
    }    
    @Test
    void Keyword_Check_Semi_Colon(){//checks if keyword ';' is declined
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertNotEquals(true, system.Keyword_Check(";"));
    }
    @Test
    void Keyword_Check_Space(){//checks if keyword ' ' is declined
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertNotEquals(true, system.Keyword_Check(" "));
    }
    @Test
    void Keyword_Check_SpaceAndData(){//checks if keyword ' Email' is declined
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertEquals(true, system.Keyword_Check(" email"));
    }
    
    @Test
    void Keyword_Check_Spacex2(){//checks if keyword '  ' is declined
        Prepare_Searching_System system = new Prepare_Searching_System();
        assertEquals(false, system.Keyword_Check("  "));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
