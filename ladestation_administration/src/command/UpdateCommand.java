/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.DerbyConnectionFactory;
import model.ResultSetTableModel;

/**
 *
 * @author ibr
 */
public class UpdateCommand implements Command {

    public void execute(String request, ResultSetTableModel receiver) throws SQLException {
        Connection con = DerbyConnectionFactory.createConnection();
        PreparedStatement stmt = con.prepareStatement(request, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        int rowCount = stmt.executeUpdate();
        CachedRowSetImpl cachedRowSet = new CachedRowSetImpl();
        con.close();
        receiver.setRowSet(cachedRowSet);
    }
}
