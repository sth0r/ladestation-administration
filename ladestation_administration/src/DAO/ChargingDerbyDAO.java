/*carcharger
 * 
 * Billing system for charging electric cars.
 * 
 * 2014 DTU
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Customer;
import model.ResultSetTableModel;
import model.*;
import com.sun.rowset.CachedRowSetImpl;


/**
 *
 * @author Thim & Thor
 */
public class ChargingDerbyDAO implements ChargingDAO
{

    /**
     *
     * @param uID
     * @return The customer found by UID
     */
    @Override
    public Customer findByUID(String uID)
    {
        String titlesQuery = "select distinct \"UID\", \"FIRSTNAME\",  "
                + "\"LASTNAME\", \"BALANCE\", \"CREDITLIMIT\", \"EMAIL\", \"TLF\", \"PASSWORD\""
                + "from \"CUSTOMERS\" "
                + "where \"UID\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, uID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                Customer user = createCostumerModel(resultSet);
                return user;
            }
        } catch (SQLException e)
        {
            System.out.println("SQLException: " + e.getMessage());
        }
        return null;
    }

    /**
     *
     * @param taID
     * @return The customer found by (transaction) taID
     */
    @Override
    public ChargingStat findByTAID(String taID)
    {
        String titlesQuery = "select distinct \"TAID\", \"started\", \"stopped\", \"daration\""
                + "from \"CHARGINGSTATS\" "
                + "where \"TAID\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, taID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                ChargingStat stats = createChargingStatsModel(resultSet);
                return stats;
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    /**
     *
     * @param firstName
     * @return The customer found by first name
     */
    @Override
    public Customer findByFirstName(String firstName)
    {
        String titlesQuery = "select distinct \"UID\", \"FIRSTNAME\",  "
                + "\"LASTNAME\", \"BALANCE\", \"CREDITLIMIT\", \"EMAIL\", \"TLF\""
                + "from \"CUSTOMERS\" "
                + "where \"FIRSTNAME\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, firstName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                Customer user = createCostumerModel(resultSet);
                return user;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Finds all the users with the first name applied.
     * @param firstName
     * @param receiver
     */
    @Override
    public void findByFirstNameTEST(String firstName, ResultSetTableModel receiver)
    {
        String titlesQuery = "select *"
                + "from \"CUSTOMERS\" "
                + "where \"FIRSTNAME\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, firstName);
            ResultSet resultSet = preparedStatement.executeQuery();
            CachedRowSetImpl cachedRowSet = new CachedRowSetImpl();
            cachedRowSet.populate(resultSet);
            con.close();
            receiver.setRowSet(cachedRowSet);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param lastName
     * @return The customer found by last name
     */
    @Override
    public Customer findByLastName(String lastName)
    {
        String titlesQuery = "select distinct \"UID\", \"FIRSTNAME\",  "
                + "\"LASTNAME\", \"BALANCE\", \"CREDITLIMIT\", \"EMAIL\", \"TLF\""
                + "from \"CUSTOMERS\" "
                + "where \"LASTNAME\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, lastName);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                Customer user = createCostumerModel(resultSet);
                return user;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param balance
     * @return The customer found by balance
     */
    @Override
    public Customer findByBalance(String balance)
    {
        String titlesQuery = "select distinct \"UID\", \"FIRSTNAME\",  "
                + "\"LASTNAME\", \"BALANCE\", \"CREDITLIMIT\", \"EMAIL\", \"TLF\""
                + "from \"CUSTOMERS\" "
                + "where \"BALANCE\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, balance);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                Customer user = createCostumerModel(resultSet);
                return user;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param creditLimit
     * @return The customer found by credit limit
     */
    @Override
    public Customer findByCreditLimit(String creditLimit)
    {
        String titlesQuery = "select distinct \"UID\", \"FIRSTNAME\",  "
                + "\"LASTNAME\", \"BALANCE\", \"CREDITLIMIT\", \"EMAIL\", \"TLF\""
                + "from \"CUSTOMERS\" "
                + "where \"CREDITLIMIT\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, creditLimit);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                Customer user = createCostumerModel(resultSet);
                return user;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param email
     * @return The customer found by email
     */
    @Override
    public Customer findByEmail(String email)
    {
        String titlesQuery = "select distinct \"UID\", \"FIRSTNAME\",  "
                + "\"LASTNAME\", \"BALANCE\", \"CREDITLIMIT\", \"EMAIL\", \"TLF\""
                + "from \"CUSTOMERS\" "
                + "where \"EMAIL\" = ?";

        try (Connection con = DerbyDAOFactory.createConnection();
                PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                Customer user = createCostumerModel(resultSet);
                return user;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param tlf
     * @return The customer found by telephone number
     */
    @Override
    public Customer findByTlf(String tlf)
    {
        String titlesQuery = "select distinct \"UID\", \"FIRSTNAME\",  "
                + "\"LASTNAME\", \"BALANCE\", \"CREDITLIMIT\", \"EMAIL\", \"TLF\""
                + "from \"CUSTOMERS\" "
                + "where \"TLF\" = ?";
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement preparedStatement = con.prepareStatement(titlesQuery);)
        {
            preparedStatement.setString(1, tlf);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                Customer user = createCostumerModel(resultSet);
                return user;
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Gets all customers from database
     * @param receiver
     * @throws SQLException
     */
    @Override
    public void getCustomersTableFromDB(ResultSetTableModel receiver) throws SQLException
    {    
        String sQLCommand = "SELECT UID,firstName,lastName,balance,creditLimit,email,tlf FROM CUSTOMERS"; // Avoid getting password colum
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            ResultSet resultSet = stmt.executeQuery();
            CachedRowSetImpl cachedRowSet = new CachedRowSetImpl();
            cachedRowSet.populate(resultSet);
            con.close();
            receiver.setRowSet(cachedRowSet);
        }
    }
    /**
     * Gets all charging statistics from database
     * @param receiver
     * @throws SQLException
     */
    @Override
    public void getChargingstatsTableFromDB(ResultSetTableModel receiver) throws SQLException
    {
        String sQLCommand = "SELECT * FROM CHARGINGSTATS";
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            ResultSet resultSet = stmt.executeQuery();
            CachedRowSetImpl cachedRowSet = new CachedRowSetImpl();
            cachedRowSet.populate(resultSet);
            con.close();
            receiver.setRowSet(cachedRowSet);
        }
    }

    /**
     *
     * @param costumerID
     * @return The password from the customer ID supplied
     */
    @Override
    public String login(String costumerID) // Find the password that matches the costumerID and return it
    {
        return findByUID(costumerID).getPassword();
    }

    /**
     * Updates the database with the charging information supplied
     * @param taID
     * @param costumerID
     * @param secondsCharged
     * @param price
     */
    @Override
    public void chargeEvent(String taID, String costumerID, String secondsCharged, double price)
    {
        String sQLCommand = "UPDATE CHARGINGSTATS SET SECONDSCHARGED = '"+secondsCharged+"', UID = '"+costumerID+"', PRICE = "+price+" WHERE TAID = '"+taID+"'";

        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            stmt.executeUpdate();
            con.close();
        }
        catch (SQLException e){
            System.out.print("SQL Fail! At chargeEvent" + e.getMessage());
        }
        
        double newprice = balanceRequest(costumerID) - price; //Udregning burde måske ikke foregå i DAO-klassen
        sQLCommand = "UPDATE CUSTOMERS SET BALANCE = "+newprice+" WHERE UID = '"+costumerID+"'";
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.print("SQL Fail! At chargeEvent UPDATE BALANCE" + e.getMessage());
        }
    }

    /**
     *
     * @return A Price object from the database
     */
    @Override
    public Price priceRequestDB()
    {
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT PRICE FROM PRICESES", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            ResultSet resultSet = stmt.executeQuery();
            Price price = createPriceModel(resultSet);
            return price;
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     *
     * @return The price from the database
     */
    @Override
    public double priceRequest()
    {
        return priceRequestDB().getPrice();
    }
    /**
     *
     * @param costumerID
     * @return The supplied customers balance
     */
    @Override
    public double balanceRequest(String costumerID)
    {
        return findByUID(costumerID).getBalance();
    }

    /**
     * Inserts the supplied transaction ID and start time into database
     * @param taID
     * @param startTimeStamp
     */
    @Override
    public void newTAID(String taID, String startTimeStamp)
    {
        String sQLCommand = "INSERT INTO CHARGINGSTATS (TAID, STARTED) VALUES ('"+ taID +"','" +startTimeStamp+"')";
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            stmt.executeUpdate();
            con.close();
        }
        catch (SQLException e)
        {
            System.out.print("SQL Fail! At newTAID" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private Customer createCostumerModel(ResultSet resultSet) throws SQLException
    {
        String uID = resultSet.getString("UID");
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        double balance = resultSet.getDouble("balance");
        double creditLimit = resultSet.getDouble("creditLimit");
        String email = resultSet.getString("email");
        String tlf = resultSet.getString("tlf");
        String password = resultSet.getString("password");
        return new Customer(uID, firstName, lastName, balance, creditLimit, email, tlf, password);
    }
    
    private ChargingStat createChargingStatsModel(ResultSet resultSet) throws SQLException
    {
        String taID = resultSet.getString("TAID");
        String started = resultSet.getString("started");
        String stopped = resultSet.getString("stopped");
        String duration = resultSet.getString("duration");
        String uID = resultSet.getString("UID");
        return new ChargingStat(taID, started, stopped, duration, uID);
    }
    
    private Price createPriceModel(ResultSet resultSet) throws SQLException
    {
        double price = resultSet.getDouble("PRICE");
        return new Price(price);
    }

    /**
     * Inserts the supplied customer into database
     * @param customer
     * @throws SQLException
     */
    @Override
    public void addCustomerToDB(Customer customer) throws SQLException {
        String sQLCommand = "INSERT INTO CUSTOMERS (UID,FIRSTNAME,LASTNAME,BALANCE,CREDITLIMIT,EMAIL,TLF,PASSWORD)"
                + "VALUES ('"+customer.getUID()+"','"+customer.getFirstName()+"','"+customer.getLastName()+
                "',"+customer.getBalance()+","+customer.getCreditLimit()+",'"+customer.getEmail()+"','"+customer.getTlf()+"','"+"123"+"')";
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            stmt.executeUpdate();
            con.close();
        }
    }

    /**
     * Updates the customer supplied into the database
     * @param editCustomer
     * @throws SQLException
     */
    @Override
    public void editCustomerFromDB(Customer editCustomer) throws SQLException {
        String sQLCommand = "UPDATE CUSTOMERS SET FIRSTNAME = '"+editCustomer.getFirstName()+"',LASTNAME = '"+editCustomer.getLastName()+
                "',BALANCE = "+editCustomer.getBalance()+",CREDITLIMIT = "+editCustomer.getCreditLimit()+",EMAIL = '"+editCustomer.getEmail()+
                "',TLF = '"+editCustomer.getTlf()+"' WHERE UID = '"+editCustomer.getUID()+"'";
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            stmt.executeUpdate();
            con.close();
        }
    }

    /**
     * Deletes the customer whos uID supplied
     * @param uID
     * @throws SQLException
     */
    @Override
    public void deleteCustomerFromDB(String uID) throws SQLException 
    {
        String sQLCommand = "DELETE FROM CUSTOMERS WHERE UID = '"+uID+"'";
        try (Connection con = DerbyDAOFactory.createConnection();
            PreparedStatement stmt = con.prepareStatement(sQLCommand, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);)
        {
            stmt.executeUpdate();
            con.close();
        }
    }
}