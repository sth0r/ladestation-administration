/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testSetGetEmail() {
        System.out.println("setGetEmail");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        String expResult = "snabel@elefant.dk";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUID method, of class Customer.
     */
    @Test
    public void testGetUID() {
        System.out.println("setGetUID");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        String expResult = "UIUIUI";
        instance.setUID(expResult);
        String result = instance.getUID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testSetGetLastName() {
        System.out.println("setGetLastName");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        String expResult = "Nyborg";
        instance.setLastName(expResult);
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testSetGetFirstName() {
        System.out.println("setGetFirstName");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        String expResult = "Karl";
        instance.setFirstName(expResult);
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBalance method, of class Customer.
     */
    @Test
    public void testSetGetBalance() {
        System.out.println("setGetBalance");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        double expResult = 99.99;
        instance.setBalance(expResult);
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getCreditLimit method, of class Customer.
     */
    @Test
    public void testSetGetCreditLimit() {
        System.out.println("setGetCreditLimit");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        double expResult = 85000;
        instance.setCreditLimit(expResult);
        double result = instance.getCreditLimit();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTlf method, of class Customer.
     */
    @Test
    public void testSetGetTlf() {
        System.out.println("setGetTlf");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        String expResult = "87654321";
        instance.setTlf(expResult);
        String result = instance.getTlf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Customer.
     */
    @Test
    public void testSetGetPassword() {
        System.out.println("setGetPassword");
        String uID = "123455678", firstName = "Hansen", lastName = "Jens", email = "Jensen@Cmail.com", tlf = "12345678", password = "kickflip";
        double balance = 200.57, creditLimit = 100.09;
        Customer instance = new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
        String expResult = "qwerty";
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Customer.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");;
        Customer instance = new Customer("678","gle","ble",99.56,100,"email@email.email","12345678","1234");
        Customer instance2;
        
        instance2 = new Customer("67K","gle","ble",99.56,100,"email@email.email","12345678","1234");
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","glK","ble",99.56,100,"email@email.email","12345678","1234");
        expResult = false;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","gle","blK",99.56,100,"email@email.email","12345678","1234");
        expResult = false;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","gle","ble",88.88,100,"email@email.email","12345678","1234");
        expResult = false;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","gle","ble",99.56,888,"email@email.email","12345678","1234");
        expResult = false;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","gle","ble",99.56,100,"emailKemKilKemail","12345678","1234");
        expResult = false;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","gle","ble",99.56,100,"email@email.email","1234567K","1234");
        expResult = false;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","gle","ble",99.56,100,"email@email.email","12345678","123K");
        expResult = false;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
        
        instance2 = new Customer("678","gle","ble",99.56,100,"email@email.email","12345678","1234");
        expResult = true;
        result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
}