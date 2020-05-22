/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers1Branches;

import MainServer.PriceList;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Moon
 */
public interface BranchInter extends Remote{
    public void Update(int x, int y, int z) throws RemoteException;
    public PriceList Refresh() throws RemoteException;
    public void SetPL(PriceList PLx) throws RemoteException;
    
}
