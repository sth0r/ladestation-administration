/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Sth0r
 */
public class GUIController {
ChargingDerbyDAO DAO = new ChargingDerbyDAO();
ResultSetTableModel rstm = new ResultSetTableModel();
    public void deleteCustomerFromDB()
    {
        
    }
    
    public void getAllCustomers(LadestationTableModel ltm)
    {
        ltm.deleteAllRows();
       try {
                // TODO add your handling code here:
                DAO.getCustomersTableFromDB(rstm);            
            } catch (SQLException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        int ROW = rstm.getRowCount();
            int ROWindex = 0;
            while (ROW != ROWindex)
            {
                ltm.addRow(new Object[]{rstm.getValueAt(ROWindex, 0), rstm.getValueAt(ROWindex, 1), rstm.getValueAt(ROWindex, 2), rstm.getValueAt(ROWindex, 3), rstm.getValueAt(ROWindex, 4), rstm.getValueAt(ROWindex, 5), rstm.getValueAt(ROWindex, 6)});
                ROWindex++;
            }
        
    }

    public void editCustomer(Customer tempCustomer, String editDialogMode) 
    {
        if (editDialogMode.equals("add"))
        {
            try {
                this.DAO.addCustomerToDB(tempCustomer);
            } catch (SQLException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("fail when trying to add a customer to database.");
            }
        }
        if (editDialogMode.equals("edit"))
        {
            try {
                this.DAO.editCustomerFromDB(tempCustomer);
            } catch (SQLException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("fail when trying to edit a customer to database.");
            } 
        }
    }

    public void deleteCustomer(String UID) {
        try {
            this.DAO.deleteCustomerFromDB(UID);
        } catch (SQLException ex) {
            Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Customer getCustomer(String UID) {
        return this.DAO.findByUID(UID);
    }
    
}
