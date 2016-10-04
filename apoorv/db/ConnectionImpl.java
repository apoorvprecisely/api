/**
 * Created by unbxd on 03/10/16.
 */
package apoorv.db;

import org.json.JSONException;

import java.sql.SQLException;

public interface ConnectionImpl
{
    public void connect();

    public void close();

    public String execute(String query) throws Exception;

    public String add(String query) throws Exception;

    public String update(String id, String name, String salary) throws Exception;

    public String delete(String query) throws Exception;
}
