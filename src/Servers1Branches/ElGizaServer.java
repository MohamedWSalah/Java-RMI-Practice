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
public class ElGizaServer {
    static ElGiza GUI = new ElGiza();
    public static void main(String[] args) throws Exception {
        BranchF server = new BranchF();
        Registry X = LocateRegistry.createRegistry(1240);
        X.bind("ElGiza", server);
        System.out.println ("ElGiza Server Started");
        
        X = LocateRegistry.getRegistry("localhost" , 1234);
        MainServerInter MainS =(MainServerInter) X.lookup("MainServer");
        MainS.RegisterBranch(server);
        System.out.println ("Server Connected?");
        GUI.setVisible(true);
    }
}
