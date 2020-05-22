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
public class ElShorokServer {
    static ElShorok GUI = new ElShorok();
    public static void main(String[] args) throws Exception {
        
        BranchF server2 = new BranchF();
        Registry X = LocateRegistry.createRegistry(1241);
        X.bind("ElShorok", server2);
        System.out.println ("ElShorok Server Started");
        
        X = LocateRegistry.getRegistry("localhost" , 1234);
        MainServerInter MainS =(MainServerInter) X.lookup("MainServer");
        MainS.RegisterBranch(server2);
        System.out.println ("Server Connected!");
        GUI.setVisible(true);
    }
}
