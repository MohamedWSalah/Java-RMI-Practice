/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainServer;

import Servers1Branches.BranchF;
import Servers1Branches.BranchInter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Moon
 */
public class MainServerF extends UnicastRemoteObject implements MainServerInter{

    PriceList NL;
    int counter;
    ArrayList<BranchInter> Branches;
    public MainServerF() throws RemoteException {
        Branches = new ArrayList<>();
        counter =0;
    }
    
    @Override
    public void RegisterBranch(BranchInter NBranch) throws RemoteException {
        NBranch.SetPL(NL); //Set pricelist in the new lunched server
        Branches.add(NBranch);
        counter++;
        System.out.println("Number of Clients " + counter);
    }
    
    public ArrayList CounterNo() throws RemoteException
    {
        return Branches;
    }

    @Override
    public void ListRefresh(PriceList NL) throws RemoteException {
        this.NL = NL;
        
        System.out.println(NL.getToFrance()+" "+NL.getToUSA()+" "+NL.getToUK());
    }
         
    }
    
    
