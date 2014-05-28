/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ChargingStatTest {
    
    public ChargingStatTest() {
    }

    /**
     * Test of getTaID method, of class ChargingStat.
     */
    @Test
    public void testSetGetTaID() {
        System.out.println("setGetTaID");
        String taID = "12345678", started = "2003",  stopped = "2008", duration = "5",  uID = "12345678";
        ChargingStat instance = new ChargingStat( taID, started, stopped, duration, uID);
        String expResult = "09876543";
        instance.setTAID(expResult);
        String result = instance.getTaID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStarted method, of class ChargingStat.
     */
    @Test
    public void testSetGetStarted() {
        System.out.println("setGetStarted");
        String taID = "12345678", started = "2003",  stopped = "2008", duration = "5",  uID = "12345678";
        ChargingStat instance = new ChargingStat( taID, started, stopped, duration, uID);
        String expResult = "igår";
        instance.setStarted(expResult);
        String result = instance.getStarted();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStopped method, of class ChargingStat.
     */
    @Test
    public void testSetGetStopped() {
        System.out.println("getStopped");
        String taID = "12345678", started = "2003",  stopped = "2008", duration = "5",  uID = "12345678";
        ChargingStat instance = new ChargingStat( taID, started, stopped, duration, uID);
        String expResult = "imorgen";
        instance.setStopped(expResult);
        String result = instance.getStopped();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class ChargingStat.
     */
    @Test
    public void testSetGetDuration() {
        System.out.println("getDuration");
        String taID = "12345678", started = "2003",  stopped = "2008", duration = "5",  uID = "12345678";
        ChargingStat instance = new ChargingStat( taID, started, stopped, duration, uID);
        String expResult = "500";
        instance.setDuration(expResult);
        String result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUID method, of class ChargingStat.
     */
    @Test
    public void testGetUID() {
        System.out.println("getUID");
        String taID = "12345678", started = "2003",  stopped = "2008", duration = "5",  uID = "12345678";
        ChargingStat instance = new ChargingStat( taID, started, stopped, duration, uID);
        String expResult = "Jørgen";
        instance.setUID(expResult);
        String result = instance.getUID();
        assertEquals(expResult, result);
    }
}