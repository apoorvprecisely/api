import apoorv.db.ConnectionImpl;
import apoorv.db.ConnectionUtility;
import apoorv.db.MysqlConnection;
import com.mongodb.*;

import java.util.logging.Logger;

/**
 * Created by unbxd on 03/10/16.
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        // Now connect to your databases
        DB db = mongoClient.getDB("apoorv");
        DBCollection coll = db.getCollection("employee");
//        DBCursor cursor = coll.find();
//        while (cursor.hasNext())
//        {
//            System.out.println("Inserted Document: ");
//            System.out.println(cursor.next());
//        }

        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("id", "67");
//        fields.put("id", 1);

        DBCursor cursor = coll.find(whereQuery);
        while (cursor.hasNext())
        {
            DBObject cur = cursor.next();
            System.out.println(cur.get("name"));
        }
        String test = "1 ,'Tyler Durden' ,2000000";
        String[] testPart = test.split(" ,");
        String id = testPart[0];
        String salary = testPart[2];
        String name = testPart[1].substring(1, testPart[1].length() - 1);
        System.out.println(name);
//        ConnectionImpl connection = ConnectionUtility.getConnection("mysql");
//        connection.connect();
//        String result = connection.execute("67");
//        connection.close();
//        System.out.println(result);

//        ConnectionImpl connection2 = ConnectionUtility.getConnection("mysql");
//        connection2.connect();
//        String result2 = connection2.add("1 ,'Tyler Durden' ,2000000");
//        connection2.close();
//        System.out.printf(result2);

//        ConnectionImpl connection3 = ConnectionUtility.getConnection("mysql");
//        connection3.connect();
//        String result3 = connection3.delete("67");
//        connection3.close();
//        System.out.printf(result3);
    }
}
