package com.bogstepan.patterns.proxy;

public class ProxyConnectorDB implements IConnectorDB {

    private ConnectorDB connectorDB;
    private String ipAddress;
    private String port;

    public ProxyConnectorDB(ConnectorDB connectorDB, String ipAddress, String port) {
        this.connectorDB = connectorDB;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    @Override
    public void connect() {
        String proxyUrl = String.format("http://%s:%s/%s", ipAddress, port, connectorDB.getDbName());
        connectorDB.setDbName(proxyUrl);
        connectorDB.connect();
    }
}
