
package com.ipr.db;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipr.db package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateAccount_QNAME = new QName("http://db.ipr.com/", "updateAccount");
    private final static QName _UpdateAccountResponse_QNAME = new QName("http://db.ipr.com/", "updateAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipr.db
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateAccount }
     * 
     */
    public UpdateAccount createUpdateAccount() {
        return new UpdateAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://db.ipr.com/", name = "updateAccount")
    public JAXBElement<UpdateAccount> createUpdateAccount(UpdateAccount value) {
        return new JAXBElement<UpdateAccount>(_UpdateAccount_QNAME, UpdateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://db.ipr.com/", name = "updateAccountResponse")
    public JAXBElement<UpdateAccountResponse> createUpdateAccountResponse(UpdateAccountResponse value) {
        return new JAXBElement<UpdateAccountResponse>(_UpdateAccountResponse_QNAME, UpdateAccountResponse.class, null, value);
    }

}
