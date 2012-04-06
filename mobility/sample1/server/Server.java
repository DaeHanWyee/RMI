/* -*- indent-tabs-mode: nil; -*- */

package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server
    extends UnicastRemoteObject
    implements ServerIntf
{
    public Server() throws RemoteException
    {
    }

    public OurClass get()
    {
        return new OurClass();
    }

    public static void main(String[] args) throws Exception
    {
        ServerIntf server = new Server();
        Naming.rebind("server", server);
    }
}
