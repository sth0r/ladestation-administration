package controller;

import command.Command;
import command.Invoker;
import command.SelectCommand;
import command.UnknownCommand;
import command.UpdateCommand;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import model.ResultSetTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ibr
 */
public class DatabaseController implements Invoker{

    private final Map commands;
    private final  ResultSetTableModel resultSetTableModel;

    public DatabaseController(ResultSetTableModel resultSetTableModel) {
        this.resultSetTableModel = resultSetTableModel;
        commands = new HashMap<String, Command>();
        commands.put("select", new SelectCommand());
        commands.put("update", new UpdateCommand());
        commands.put("insert", new UpdateCommand());
        commands.put("delete", new UpdateCommand());
        commands.put("unknownCommand", new UnknownCommand());
    }

    public void processRequest(String request) throws SQLException {
        Command cmd = resolveCommand(request);
        cmd.execute(request, resultSetTableModel);
    }

    private Command resolveCommand(String request) {
        String[] requestTokens = request.split(" ");
        Command cmd = (Command) commands.get(requestTokens[0].toLowerCase()); //obtain first word
        if (cmd == null) {
            cmd = (Command) commands.get("unknownCommand");
        }
        return cmd;
    }

}
