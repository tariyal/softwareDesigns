package org.selfmade;

import com.mongodb.*;


import javax.swing.text.Document;
import java.net.UnknownHostException;
import java.util.*;

public class MONGODB  {

    static MongoClient mongoClient;
    private static String dbName = "city";
    private static String hostName = "localhost";


    void MongoDB(String hostName, int port) throws UnknownHostException {
        mongoClient = new MongoClient(hostName,port);
    }

     static void insertData(String DB, String table, List<Map<String,Object> >  documentValues){
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


    public static void main(String[] args) throws UnknownHostException {
            MongoClient mongoClient = new MongoClient(hostName);
            DB database = mongoClient.getDB(dbName);


        List<Integer> books = Arrays.asList(27464, 747854);
        DBObject person = new BasicDBObject("_id", "jot")
                .append("name", "Jo Bloggs")
                .append("address", new BasicDBObject("street", "123 Fake St")
                        .append("city", "Faketon")
                        .append("state", "MA")
                        .append("zip", 12345))
                .append("books", books);
        String collectionName = "people";
        MongoCollection<Document> collection = database.getCollection(collectionName);
        collection.insert(person);

        List<Map<String,Object > > data = readData(dbName,collectionName,"jo");
        System.out.println(data.size());



    }

}
