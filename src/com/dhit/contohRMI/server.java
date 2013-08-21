/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhit.contohRMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Radhitee
 */
public class server {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.createRegistry(2527);
        Data data = new Data();
        registry.rebind("data", data);
        System.out.println("Server berhasil berjalan");
    }
}
