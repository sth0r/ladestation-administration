package model;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.sql.RowSetListener;
import javax.sql.rowset.CachedRowSet;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class AccountTableModel implements TableModel {

    CachedRowSet accountRowSet; 
    ResultSetMetaData metadata; 
    int numcols;
    int numrows; 

    public CachedRowSet getCustomerRowSet() {
        return accountRowSet;
    }

    public AccountTableModel(CachedRowSet rowSetArg) throws SQLException {

        this.accountRowSet = rowSetArg;
        this.metadata = this.accountRowSet.getMetaData();
        numcols = metadata.getColumnCount();

        // Retrieve the number of rows.
        this.accountRowSet.beforeFirst();
        this.numrows = 0;
        while (this.accountRowSet.next()) {
            this.numrows++;
        }
        this.accountRowSet.beforeFirst();
    }

    public void addEventHandlersToRowSet(RowSetListener listener) {
        this.accountRowSet.addRowSetListener(listener);
    }

    public void insertRow(String ID, String firstName, String lastName, String balance, String creditLimit, String email, String phone) throws SQLException {

        try {
            this.accountRowSet.moveToInsertRow();
            this.accountRowSet.updateString("ID", ID);
            this.accountRowSet.updateString("firstName", firstName);
            this.accountRowSet.updateString("lastName", lastName);
            this.accountRowSet.updateString("balance", balance);
            this.accountRowSet.updateString("creditLimit", creditLimit);
            this.accountRowSet.updateString("email", email);
            this.accountRowSet.updateString("phone", phone);
            this.accountRowSet.insertRow();
            this.accountRowSet.moveToCurrentRow();
        } catch (SQLException e) {
        }
    }

    public void close() {
        try {
            accountRowSet.getStatement().close();
        } catch (SQLException e) {
        }
    }

    /**
     * Automatically close when we're garbage collected
     */
    protected void finalize() {
        close();
    }

    /**
     * Method from interface TableModel; returns the number of columns
     */
    public int getColumnCount() {
        return numcols;
    }

    /**
     * Method from interface TableModel; returns the number of rows
     */
    public int getRowCount() {
        return numrows;
    }

    /**
     * Method from interface TableModel; returns the column name at columnIndex
     * based on information from ResultSetMetaData
     */
    @Override
    public String getColumnName(int column) {
        try {
            return this.metadata.getColumnLabel(column + 1);
        } catch (SQLException e) {
            return e.toString();
        }
    }

    /**
     * Method from interface TableModel; returns the most specific superclass
     * for all cell values in the specified column. To keep things simple, all
     * data in the table are converted to String objects; hence, this method
     * returns the String class.
     */
    public Class getColumnClass(int column) {
        return String.class;
    }

    /**
     * Method from interface TableModel; returns the value for the cell
     * specified by columnIndex and rowIndex. TableModel uses this method to
     * populate itself with data from the row set. SQL starts numbering its rows
     * and columns at 1, but TableModel starts at 0.
     */
    public Object getValueAt(int rowIndex, int columnIndex) {

        try {
            this.accountRowSet.absolute(rowIndex + 1);
            Object o = this.accountRowSet.getObject(columnIndex + 1);
            if (o == null) {
                return null;
            } else {
                return o.toString();
            }
        } catch (SQLException e) {
            return e.toString();
        }
    }

    /**
     * Method from interface TableModel; returns true if the specified cell is
     * editable. This sample does not allow users to edit any cells from the
     * TableModel (rows are added by another window control). Thus, this method
     * returns false.
     */
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

  // Because the sample does not allow users to edit any cells from the
    // TableModel, the following methods, setValueAt, addTableModelListener,
    // and removeTableModelListener, do not need to be implemented.
    public void setValueAt(Object value, int row, int column) {
        System.out.println("Calling setValueAt row " + row + ", column " + column);
    }

    public void addTableModelListener(TableModelListener l) {
    }

    public void removeTableModelListener(TableModelListener l) {
    }

}
