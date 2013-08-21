/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhit.contohRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Radhitee
 */
public interface DataInterface extends Remote{
    public void metode1()throws RemoteException;
    public void metode2()throws RemoteException;
}
