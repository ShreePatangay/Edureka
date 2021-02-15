/**
 * CreditCardServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class CreditCardServiceLocator extends org.apache.axis.client.Service implements service.CreditCardService {

    public CreditCardServiceLocator() {
    }


    public CreditCardServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreditCardServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreditCard
    private java.lang.String CreditCard_address = "http://localhost:8080/ServiceProvider/services/CreditCard";

    public java.lang.String getCreditCardAddress() {
        return CreditCard_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreditCardWSDDServiceName = "CreditCard";

    public java.lang.String getCreditCardWSDDServiceName() {
        return CreditCardWSDDServiceName;
    }

    public void setCreditCardWSDDServiceName(java.lang.String name) {
        CreditCardWSDDServiceName = name;
    }

    public service.CreditCard getCreditCard() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreditCard_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreditCard(endpoint);
    }

    public service.CreditCard getCreditCard(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.CreditCardSoapBindingStub _stub = new service.CreditCardSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreditCardWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreditCardEndpointAddress(java.lang.String address) {
        CreditCard_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.CreditCard.class.isAssignableFrom(serviceEndpointInterface)) {
                service.CreditCardSoapBindingStub _stub = new service.CreditCardSoapBindingStub(new java.net.URL(CreditCard_address), this);
                _stub.setPortName(getCreditCardWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CreditCard".equals(inputPortName)) {
            return getCreditCard();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service", "CreditCardService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service", "CreditCard"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreditCard".equals(portName)) {
            setCreditCardEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
