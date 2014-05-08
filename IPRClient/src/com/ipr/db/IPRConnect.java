
package com.ipr.db;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IPRConnect", targetNamespace = "http://db.ipr.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IPRConnect {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateAccount", targetNamespace = "http://db.ipr.com/", className = "com.ipr.db.UpdateAccount")
    @ResponseWrapper(localName = "updateAccountResponse", targetNamespace = "http://db.ipr.com/", className = "com.ipr.db.UpdateAccountResponse")
    @Action(input = "http://db.ipr.com/IPRConnect/updateAccountRequest", output = "http://db.ipr.com/IPRConnect/updateAccountResponse")
    public boolean updateAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
