package main.java.com.practice.DBObjects;

public abstract class DBConnector {

    private String hostName;
    private Integer port;
    public abstract String[] readData(String DBname, String table);






}
