//Implementation of object (RemoteObjectImplemetation.java)

package rmi.oop.dk;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author andc
 */
public class RemoteObjectImplemetation extends UnicastRemoteObject
        implements RemoteHelloInterface {

    public RemoteObjectImplemetation() throws RemoteException {
    }

    @Override
    public String hello(String msg) throws RemoteException {
        return "Hello " + msg + " from " + this.getClass().getCanonicalName();
    }

    @Override
    public int sum(int a, int b) throws RemoteException {
        return a + b;
    }

}
