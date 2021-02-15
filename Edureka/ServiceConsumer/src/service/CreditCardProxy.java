package service;

public class CreditCardProxy implements service.CreditCard {
  private String _endpoint = null;
  private service.CreditCard creditCard = null;
  
  public CreditCardProxy() {
    _initCreditCardProxy();
  }
  
  public CreditCardProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreditCardProxy();
  }
  
  private void _initCreditCardProxy() {
    try {
      creditCard = (new service.CreditCardServiceLocator()).getCreditCard();
      if (creditCard != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creditCard)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creditCard)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creditCard != null)
      ((javax.xml.rpc.Stub)creditCard)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.CreditCard getCreditCard() {
    if (creditCard == null)
      _initCreditCardProxy();
    return creditCard;
  }
  
  public float approveAmount(java.lang.String cc, float balance, float amt) throws java.rmi.RemoteException{
    if (creditCard == null)
      _initCreditCardProxy();
    return creditCard.approveAmount(cc, balance, amt);
  }
  
  
}