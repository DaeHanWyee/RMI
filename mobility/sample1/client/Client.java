/* -*- indent-tabs-mode: nil; -*- */

package client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import server.ServerIntf;

public class Client
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("java.security.policy", "client.policy");
        System.setSecurityManager(new SecurityManager());
        ServerIntf server = (ServerIntf) Naming.lookup("server");
        Runnable o = server.get();
        o.run();
    }
}
