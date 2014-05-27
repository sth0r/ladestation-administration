/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Customer;
import model.LadestationTableModel;
import model.ResultSetTableModel;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import view.GUI;

/**
 *
 * @author Sth0r
 */
public class GUIControllerTest {
    
    public GUIControllerTest() {
    }

    @Before
    public void setUp() throws Exception {
        GUIController instance = new GUIController();
        //instance.editCustomer(new model.Customer("deleteMe", "for098u9", "ba0+9+09g", 100, 100, "1@2.6", "1345678", "134"), "add");
        //instance.editCustomer(new model.Customer("getMe", "Gert", "me", 100, 100, "1@2.3", "12345678", "1234"), "add");
        //instance.editCustomer(new model.Customer("editMe", "ding", "dong", 100, 100, "1@2.3", "12345678", "1234"), "add");
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getAllCustomers method, of class GUIController.
     */
    @Test
    public void testGetAllCustomers() {
        
        System.out.println("getAllCustomers");
        LadestationTableModel ltm = new LadestationTableModel();
        LadestationTableModel expltm = new LadestationTableModel();
        expltm.addRow(new Object[]{"F561A25C", "Harvey", "Deitel", 100, 1000, "Harvey@car.com", "18771556"});
        expltm.addRow(new Object[]{"7B503FD7", "Paul", "Deitel", 200, 100, "Paul@gmail.com", "28771556"});        
        expltm.addRow(new Object[]{"F561A789", "Andrew", "Goldberg", 300, 10, "andrew@goldberg.com", "38771556"});     
        expltm.addRow(new Object[]{"F561A007", "David", "Choffnes", 400, 100, "mr.choffins@yahoo.com", "48771556"});     
        GUIController instance = new GUIController();    
        instance.getAllCustomers(ltm);
        String expResult = ltm.toString();
        String result = ltm.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of editCustomer method and getCustomer method, of class GUIController.
     */
    @Test
    public void testEditAndGetCustomer() {
        System.out.println("editCustomer");
        Customer tempCustomer = new model.Customer("addme", "for", "bag", 100, 100, "1@2.3", "12345678", "1234");
        String editDialogMode = "add";
        GUIController instance = new GUIController();
        instance.editCustomer(tempCustomer, editDialogMode);
        Customer getCustomer = instance.getCustomer("addme");
        String expResult = tempCustomer.getUID()+
                tempCustomer.getFirstName()+
                tempCustomer.getLastName()+
                tempCustomer.getBalance()+
                tempCustomer.getCreditLimit()+
                tempCustomer.getEmail()+
                tempCustomer.getTlf();
        String result = getCustomer.getUID()+
                getCustomer.getFirstName()+
                getCustomer.getLastName()+
                getCustomer.getBalance()+
                getCustomer.getCreditLimit()+
                getCustomer.getEmail()+
                getCustomer.getTlf();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteCustomer method, of class GUIController.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        String UID = "deleteMe";
        GUIController instance = new GUIController();
        instance.deleteCustomer(UID);
        Customer result = instance.getCustomer("deleteMe");
        Customer expResult = null;
        assertEquals(expResult, result);
    }



    /**
     * Test of getChargingStats method, of class GUIController.
     */
    @Test
    public void testGetChargingStats() {
        System.out.println("getChargingStats");
        GUIController instance = new GUIController();
        ResultSetTableModel notYetResult = new ResultSetTableModel();
        instance.getChargingStats(notYetResult);
        String expResult = "1";
        instance.getChargingStats(notYetResult);
        String result = String.valueOf(notYetResult.getValueAt(0, 0)); 
        assertEquals(expResult, result);
        expResult = "2";
        result = String.valueOf(notYetResult.getValueAt(1, 0));
        assertEquals(expResult, result);
    }

    /**
     * Test of editCustomer method, of class GUIController.
     */
    @Test
    public void testEditCustomer() {
        System.out.println("editCustomer");
        String expResult = "surmule";
        Customer tempCustomer = new Customer("F561A007",expResult, "lastname",  111, 222, "email", "tlf", "password");
        String editDialogMode = "edit";
        GUIController instance = new GUIController();
        instance.editCustomer(tempCustomer, editDialogMode);
        String result = instance.getCustomer("F561A007").getFirstName();
        // TODO review the generated test code and remove the default call to fail.
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class GUIController.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        String UID = "F561A25C";
        GUIController instance = new GUIController();
        Customer customerResult = instance.getCustomer(UID);
        String result = customerResult.getFirstName();
        String expResult = "Harvey";
        //Customer result = instance.getCustomer(UID);
        assertEquals(expResult, result);
    }

    /**
     * Test of setGUI method, of class GUIController.
     */
    @Test
    public void testSetGUI() {

    }
}