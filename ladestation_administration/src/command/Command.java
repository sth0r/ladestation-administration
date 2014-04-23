/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import model.ResultSetTableModel;



/**
 *
 * @author ibr
 */
public interface Command {

    public void execute(String request, ResultSetTableModel receiver) throws java.sql.SQLException;
}
