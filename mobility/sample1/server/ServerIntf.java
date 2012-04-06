/* -*- indent-tabs-mode: nil; -*- */

package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerIntf extends Remote
{
    Runnable get() throws RemoteException;
}
