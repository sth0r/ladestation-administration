/*carcharger
 * 
 * Billing system for charging electric cars.
 * 
 * 2014 DTU
 */
package DAO;

import model.*;
/**
 *
 * @author Thim
 */
public interface ChargingDAO
{
    // From GUI
    public Customer findByUID(String uID);
    public ChargingStat findByTAID(String taID);
    public Customer findByFirstName(String firstName);
    public void findByFirstNameTEST(String firstName, ResultSetTableModel receiver) throws java.sql.SQLException;
    public Customer findByLastName(String lastName);
    public Customer findByBalance(String balance);
    public Customer findByCreditLimit(String creditLimit);
    public Customer findByEmail(String email);
    public Customer findByTlf(String tlf);
    public void addCustomerToDB(Customer customer) throws java.sql.SQLException;
    public void editCustomerFromDB(Customer customer) throws java.sql.SQLException;
    public void deleteCustomerFromDB(String uID) throws java.sql.SQLException;
    public void getCustomersTableFromDB(ResultSetTableModel receiver) throws java.sql.SQLException;
    public void getChargingstatsTableFromDB(ResultSetTableModel receiver) throws java.sql.SQLException;
    public Price priceRequestDB(); // Returns a priceModel from database
            
    // From Charger to Server
    public String login(String costumerID); // Return password
    public void chargeEvent(String taID, String costumerID, String stopTimeStamp, double price);
    public double priceRequest(); // Return price
    public double balanceRequest(String costumerID); // Return balance
    // From Server to database
    public void newTAID(String taID, String startTimeStamp); // Save taID and startTime
}