/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainServer;

import Servers1Branches.BranchInter;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Moon
 */
public interface MainServerInter extends Remote{
    public void RegisterBranch(BranchInter NBranch) throws RemoteException;
    public void ListRefresh(PriceList NL) throws RemoteException;
    public ArrayList CounterNo() throws RemoteException;
}
