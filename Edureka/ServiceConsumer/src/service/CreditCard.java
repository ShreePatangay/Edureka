/**
 * CreditCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface CreditCard extends java.rmi.Remote {
    public float approveAmount(java.lang.String cc, float balance, float amt) throws java.rmi.RemoteException;
}
