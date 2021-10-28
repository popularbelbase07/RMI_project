// Server Side Programmingfor RMI (Server.java)
package rmi.oop.dk;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Popular
 */
public class Server {

    private int port = 1099;    // rmi default port on the server
    private String host = "localhost"; // the server's host

    public static void main (String[] args) {
        try {

            RemoteObjectImplemetation remoteObj = new RemoteObjectImplemetation();
            //starts the rmiregistry
            LocateRegistry.createRegistry(1099);
            //bind the object to the registry
            Naming.bind("rmi://localhost:1099/RMIServer", remoteObj);
            System.out.println ("RMI Server is Running.");

        } catch (RemoteException | MalformedURLException | AlreadyBoundException ex) {
            ex.printStackTrace();
        }
    }

}