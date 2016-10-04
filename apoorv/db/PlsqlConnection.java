package apoorv.db;

import org.json.JSONException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by unbxd on 03/10/16.
 */
public class PlsqlConnection implements ConnectionImpl
{
    private static Logger LOGGER = Logger.getLogger(PlsqlConnection.class.getName());
    Connection connection;

    @Override
    public void connect()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/apoorv", "root", "root");
        }
        catch (SQLException e)
        {
            LOGGER.log(Level.SEVERE, "Connection failed, setting null", e);
            connection = null;
        }
        catch (ClassNotFoundException e)
        {
            LOGGER.log(Level.SEVERE, "Connection failed, class not found", e);
            connection = null;
        }
    }

    @Override
    public void close()
    {
        try
        {
            if (connection != null)
            {
                connection.close();
            }
        }
        catch (Exception e)
        {
            LOGGER.log(Level.SEVERE, "Unable to close connection", e);
        }
    }

    @Override
    public String execute(String query) throws SQLException, JSONException
    {
        return null;
    }

    @Override
    public String add(String query)
    {
        return null;
    }

    @Override
    public String update(String id, String name, String salary) throws SQLException, JSONException
    {
        return null;
    }

    @Override
    public String delete(String query)
    {
        return null;
    }
}
