/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhit.contohRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Radhitee
 */
public class Data extends UnicastRemoteObject implements DataInterface {

    public Data() throws RemoteException {
    }

    @Override
    public void metode1() throws RemoteException {
        System.out.println("Metode satu dijalankan");
    }

    @Override
    public void metode2() throws RemoteException {
        System.out.println("Metode dua dijalankan");
    }
}
