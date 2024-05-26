package com.bogstepan.patterns.proxy;

public class ConnectorDB implements IConnectorDB {

    private String dbName;

    public ConnectorDB(String dbName) {
        this.dbName = dbName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        System.out.println("Connected to " + dbName);
    }
}
