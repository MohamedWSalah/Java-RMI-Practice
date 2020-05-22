/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainServer;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 *
 * @author Moon
 */
public class PriceList implements Serializable{
    int ToFrance;
    int ToUSA;
    int ToUK;

    public PriceList(int ToFrance, int ToUSA, int ToUK) throws RemoteException{
        this.ToFrance = ToFrance;
        this.ToUSA = ToUSA;
        this.ToUK = ToUK;
    }

    public PriceList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getToFrance() {
        return ToFrance;
    }

    public void setToFrance(int ToFrance) {
        this.ToFrance = ToFrance;
    }

    public int getToUSA() {
        return ToUSA;
    }

    public void setToUSA(int ToUSA) {
        this.ToUSA = ToUSA;
    }

    public int getToUK() {
        return ToUK;
    }

    public void setToUK(int ToUK) {
        this.ToUK = ToUK;
    }
    
    
}
