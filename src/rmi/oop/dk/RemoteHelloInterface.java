//Remote RemoteHelloInterface.java



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.oop.dk;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Andrea
 */
public interface RemoteHelloInterface extends Remote {

    /**
     * Remotely invocable method.
     * @param msg some text to be displayed
     * @return the message of the remote object
     * @exception RemoteException if the remote invocation fails.
     */
    public String hello(String msg) throws RemoteException;

    /**
     * Remotely invocable method.
     * @param a an integer value
     * @param b an integer value
     * @return the sum of a and b
     * @exception RemoteException if the remote invocation fails.
     */
    public int sum(int a, int b) throws RemoteException;

}