/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package command;

import java.sql.SQLException;

/**
 *
 * @author iabr
 */
public interface Invoker {
    public void processRequest(String request) throws SQLException;
}
