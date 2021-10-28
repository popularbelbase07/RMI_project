//Client side programming(Client.java)
package rmi.oop.dk;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
/**
 *
 * @author Popular
 */
public class Client {
    private int port = 1099;    // the port on the server; default for rmi is 1099
    private String host = "localhost"; // the server's host
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, int port, String host) {
        this(name);
        this.port = port;
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main (String[] argv) {
        try {
            Client c = new Client("SomeHelloMessgaeToPrintOut");
            String serverName = "rmi://" + c.getHost() + ":" + c.getPort() + "/RMIServer";
            // notice that this JVM has no knowledge of the actual object type being
            // looked up!
            RemoteHelloInterface remoteObjRef = (RemoteHelloInterface) Naming.lookup(serverName);

            System.out.println(remoteObjRef.hello(c.getName()));
            int a = 140,
                    b = 160;
            System.out.print(a + " + " + b + " = ");
            int result = remoteObjRef.sum(a,b);
            System.out.println(result);

        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            ex.printStackTrace();
        }
    }

}
