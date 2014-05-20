package model;

import javax.swing.table.DefaultTableModel;

public class LadestationTableModel extends  DefaultTableModel {

    public void deleteAllRows(){
        int rowMax = this.getRowCount();
        int deleteRowIndex = 0;
        while(rowMax!=deleteRowIndex){
          this.removeRow(0);
          deleteRowIndex++;
    }
    }

    
}
