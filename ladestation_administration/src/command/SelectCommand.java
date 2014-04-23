/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DerbyConnectionFactory;
import model.ResultSetTableModel;

/**
 *
 * @author ibr
 */
public class SelectCommand implements Command {

    public void execute(String request, ResultSetTableModel receiver) throws java.sql.SQLException {
        Connection con = DerbyConnectionFactory.createConnection();
        PreparedStatement stmt = con.prepareStatement(request, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = stmt.executeQuery();
        CachedRowSetImpl cachedRowSet = new CachedRowSetImpl();
        cachedRowSet.populate(resultSet);
        con.close();
        receiver.setRowSet(cachedRowSet);
    }
}
