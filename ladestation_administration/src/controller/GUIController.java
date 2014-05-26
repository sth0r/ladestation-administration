/*carcharger
 * 
 * Billing system for charging electric cars.
 * 
 * 2014 DTU
 */
package controller;

import DAO.ChargingDerbyDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.LadestationTableModel;
import model.ResultSetTableModel;
import view.GUI;



/**
 *
 * @author Thor Heldager Strange
 */
public class GUIController {
ChargingDerbyDAO DAO = new ChargingDerbyDAO();
ResultSetTableModel rstm = new ResultSetTableModel();
view.GUI GUI;

    
    /**
     * funktionen sletter først alle kunderne i tabellen og spøger så databasen om alle kunderne så den får den nyeste version af kunderne.
     * @param ltm er en ladestationTabelModel og det er den som indeholder alle informationener til tabelen i guiens customer info tab.
     */
    public void getAllCustomers(LadestationTableModel ltm)
    {
        ltm.deleteAllRows();// sletter alle rækkerne i ltm.
       try {
                // TODO add your handling code here:
                DAO.getCustomersTableFromDB(rstm);// får alle kunderne tilbage i rstm            
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                GUI.customerErrorMsg("Did not get the information wanted from the database");
            }
       
        int ROW = rstm.getRowCount(); //spøger hvormange rækker (kunder) der er i tabelen
            int ROWindex = 0; //hvormange rækker der er blevet tilføjet.
            while (ROW != ROWindex) //tilføjer en række mere sålænge ROW og ROWindex ikke er lig hianden
            {
                ltm.addRow(new Object[]{rstm.getValueAt(ROWindex, 0), rstm.getValueAt(ROWindex, 1), rstm.getValueAt(ROWindex, 2), rstm.getValueAt(ROWindex, 3), rstm.getValueAt(ROWindex, 4), rstm.getValueAt(ROWindex, 5), rstm.getValueAt(ROWindex, 6)}); // tilføjer en kunde til ltm
                ROWindex++; //incrementere ROWindex hvergang while løkken køre igennem her.
            }
        
    }

    /**
     *
     * @param tempCustomer den midlertidige kunden der skal sendes til databasen
     * @param editDialogMode kan enten være "add" eller "edit" og bestæmmer om tempCustomer skal oprettes som en ny kunden eller skal overskrive en eksisterende kunde (updatere)
     */
    public void editCustomer(Customer tempCustomer, String editDialogMode) 
    {
        if (editDialogMode.equals("add")) //hvis editDialogMode equals "add" så udføres den neden stående try catch
        {
            try {
                this.DAO.addCustomerToDB(tempCustomer); //tilføjer kunden til databasen
            } catch (SQLException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("fail when trying to add a customer to database.");
            }
        }
        if (editDialogMode.equals("edit")) //hvis editDialogMode equals "edit" så udføres den neden stående try catch
        {
            try {
                this.DAO.editCustomerFromDB(tempCustomer);//opdatere kunden i databasen
            } catch (SQLException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("fail when trying to edit a customer to database.");
            } 
        }
    }

    /**
     *
     * @param UID er det unike id rfid kortet kunden har, dette id bliver brugt til at identifisere kunden.
     */
    public void deleteCustomer(String UID) {
        try {
            this.DAO.deleteCustomerFromDB(UID); // sletter den kunde der kommer har det UID der sendes med som parameter.
        } catch (SQLException ex) {
            Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * retunere et kunde objekt til den som kalder metoden.
     * @param UID er det unike id rfid kortet kunden har, dette id bliver brugt til at identifisere kunden.
     * @return
     */
    public Customer getCustomer(String UID) {
        return this.DAO.findByUID(UID);
    }

    /**
     * opdatere rstmForChargingStats men de nyeste stats
     * @param rstmForChargingStats er den objekt af resultSetTabelModel
     */
    public void getChargingStats(ResultSetTableModel rstmForChargingStats) 
    {
        try {        
            DAO.getChargingstatsTableFromDB(rstmForChargingStats); //får dataen fra databasen og opdatere den i rstmForChargingStats
        } catch (SQLException ex) {
            Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * er en set metode der får GUIControlleren til at gemmen en refarangse til view.gui
     * @param GUI 
     */
    public void setGUI(GUI GUI) {
        this.GUI = GUI;
    }
    
}
