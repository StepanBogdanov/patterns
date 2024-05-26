package com.bogstepan.patterns;

import com.bogstepan.patterns.adapter.Computer;
import com.bogstepan.patterns.adapter.SDFlash;
import com.bogstepan.patterns.adapter.UsbAdapter;
import com.bogstepan.patterns.factory.Coffee;
import com.bogstepan.patterns.factory.CoffeeFactory;
import com.bogstepan.patterns.factory.CoffeeType;
import com.bogstepan.patterns.proxy.ConnectorDB;
import com.bogstepan.patterns.proxy.ProxyConnectorDB;
import com.bogstepan.patterns.singleton.Logger;


public class App 
{
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.classLog("SomeText", "It must be String");

        System.out.println("-----------------");

        Coffee coffee = new CoffeeFactory().getCoffee(CoffeeType.AMERICANO);
        logger.classLog(coffee, "It must be Americano");

        System.out.println("-----------------");

        Computer pc = new Computer();
        SDFlash memoryCard = new SDFlash();
        UsbAdapter adapter = new UsbAdapter(memoryCard);
        pc.read(adapter);

        System.out.println("-----------------");

        ConnectorDB connectorDB = new ConnectorDB("dbName");
        ProxyConnectorDB proxy = new ProxyConnectorDB(connectorDB, "localhost", "1433");
        proxy.connect();
    }
}
