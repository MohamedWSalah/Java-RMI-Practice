/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainServer;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Moon
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        MainServerF server = new MainServerF();
        Registry X = LocateRegistry.createRegistry(1234);
        X.bind("MainServer", server);
        System.out.println ("Branches Registeration started");
    }
    
}
