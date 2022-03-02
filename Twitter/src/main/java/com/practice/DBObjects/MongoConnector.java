package main.java.com.practice.DBObjects;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MongoConnector {

    static MongoClient mongoClient;
 //   private static String dbName = "city";
 //    private static String hostName = "localhost";


    void MongoDB(String hostName, int port) throws UnknownHostException {
        mongoClient = new MongoClient(hostName,port);
    }

    static void insertData(String DB, String table, List<Map<String,Object>> documentValues){
        DBObject dbObject= new BasicDBObject();
        // objectMap.forEach((key,value)-> dbObject.append(key,valye));
        documentValues.forEach(objectMap -> dbObject.putAll(objectMap));
        mongoClient.getDB(DB).getCollection(table).insert(dbObject);

    }

    static List<Map<String,Object > > readData(String DB,String table,String key){
        DBCollection collection = mongoClient.getDB(DB).getCollection(table);
        List<Map<String,Object> > objectList = new ArrayList<>();
        Iterator<DBObject> cursor= collection.find();
        while (cursor.hasNext()) {
            objectList.add(cursor.next().toMap());
        }
        return objectList;
    }

}
