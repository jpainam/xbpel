
package com.cdyne.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cdyne.ws package. 
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

    private final static QName _IPInformation_QNAME = new QName("http://ws.cdyne.com/", "IPInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cdyne.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IPInformation }
     * 
     */
    public IPInformation createIPInformation() {
        return new IPInformation();
    }

    /**
     * Create an instance of {@link ResolveIP }
     * 
     */
    public ResolveIP createResolveIP() {
        return new ResolveIP();
    }

    /**
     * Create an instance of {@link ResolveIPResponse }
     * 
     */
    public ResolveIPResponse createResolveIPResponse() {
        return new ResolveIPResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/", name = "IPInformation")
    public JAXBElement<IPInformation> createIPInformation(IPInformation value) {
        return new JAXBElement<IPInformation>(_IPInformation_QNAME, IPInformation.class, null, value);
    }

}
