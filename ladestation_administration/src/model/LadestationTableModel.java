package model;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sth0r
 */
public class LadestationTableModel extends  DefaultTableModel {

    /**
     * sletter alle rækker i denne model. 
     */
    public void deleteAllRows(){
        int rowMax = this.getRowCount();
        int deleteRowIndex = 0;
        while(rowMax!=deleteRowIndex){
          this.removeRow(0);
          deleteRowIndex++;
    }
    }

    
}
