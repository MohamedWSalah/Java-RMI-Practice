/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers1Branches;

import MainServer.MainServerF;
import MainServer.MainServerInter;
import MainServer.PriceList;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Moon
 */
public class BranchF extends UnicastRemoteObject implements BranchInter {
    PriceList PL;
    public BranchF() throws RemoteException
    {
        super();
    }
    
    @Override
    public void Update(int x, int y, int z) throws RemoteException {
        PL = new PriceList(x,y,z);
        
        
        try
        {
        Registry X = LocateRegistry.getRegistry("localhost" , 1234);
        MainServerInter MainS =(MainServerInter) X.lookup("MainServer");
        MainS.ListRefresh(PL);//refresh Main Server List
        
        ArrayList<BranchInter> Clients = MainS.CounterNo(); // retreving number of clients from the main server
        
        for (int i=0; i<Clients.size();i++)
        { 
            Clients.get(i).SetPL(PL);
        }
        }
        catch(Exception e)
        {
            System.out.println("O0o0o0o0o0");
        }
    }
    
    @Override
    public void SetPL(PriceList PLx) throws RemoteException {
        PL = PLx;
    }

    @Override
    public PriceList Refresh() throws RemoteException {
        return PL;
    }

    
    
    
}
