/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers1Branches;

import MainServer.MainServerInter;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Moon
 */
public class MadinitNasrServer {
    static MadinitNasr GUI = new MadinitNasr();
    public static void main(String[] args) throws Exception {
        BranchF server3 = new BranchF();
        Registry X = LocateRegistry.createRegistry(1242);
        X.bind("MadinitNasr", server3);
        System.out.println ("ElGizaServerStarted");
        
        X = LocateRegistry.getRegistry("localhost" , 1234);
        MainServerInter MainS =(MainServerInter) X.lookup("MainServer");
        MainS.RegisterBranch(server3);
        System.out.println ("Server Connected!");
        GUI.setVisible(true);
    }
}
