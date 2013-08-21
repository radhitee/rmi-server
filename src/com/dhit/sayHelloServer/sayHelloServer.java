/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhit.sayHelloServer;

import com.dhit.sayHello.hello;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Radhitee
 */
public class sayHelloServer extends UnicastRemoteObject implements hello{

    public sayHelloServer()throws RemoteException {
    }

    @Override
    public String hello(String h) throws RemoteException {
        System.out.println("Client dengan nama "+h+" melakukan request");
        return "Hello "+h;
    }
    
}
