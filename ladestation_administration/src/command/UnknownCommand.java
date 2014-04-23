/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.sql.SQLException;
import model.ResultSetTableModel;

/**
 *
 * @author ibr
 */
public class UnknownCommand implements Command {

    public void execute(String request, ResultSetTableModel receiver) throws java.sql.SQLException {
        throw new SQLException("Unkown command");
    }
}
