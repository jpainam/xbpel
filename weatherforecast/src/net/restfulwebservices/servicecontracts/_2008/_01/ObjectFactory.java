
package net.restfulwebservices.servicecontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import net.restfulwebservices.datacontracts._2008._01.Weather;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.restfulwebservices.servicecontracts._2008._01 package. 
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

    private final static QName _GetForecastByCityResponseGetForecastByCityResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetForecastByCityResult");
    private final static QName _GetForecastByCityCountry_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "Country");
    private final static QName _GetForecastByCityCity_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "City");
    private final static QName _GetCitiesByCountryResponseGetCitiesByCountryResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetCitiesByCountryResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.restfulwebservices.servicecontracts._2008._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetForecastByCityResponse }
     * 
     */
    public GetForecastByCityResponse createGetForecastByCityResponse() {
        return new GetForecastByCityResponse();
    }

    /**
     * Create an instance of {@link GetForecastByCity }
     * 
     */
    public GetForecastByCity createGetForecastByCity() {
        return new GetForecastByCity();
    }

    /**
     * Create an instance of {@link GetCitiesByCountry }
     * 
     */
    public GetCitiesByCountry createGetCitiesByCountry() {
        return new GetCitiesByCountry();
    }

    /**
     * Create an instance of {@link GetCitiesByCountryResponse }
     * 
     */
    public GetCitiesByCountryResponse createGetCitiesByCountryResponse() {
        return new GetCitiesByCountryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetForecastByCityResult", scope = GetForecastByCityResponse.class)
    public JAXBElement<Weather> createGetForecastByCityResponseGetForecastByCityResult(Weather value) {
        return new JAXBElement<Weather>(_GetForecastByCityResponseGetForecastByCityResult_QNAME, Weather.class, GetForecastByCityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "Country", scope = GetForecastByCity.class)
    public JAXBElement<String> createGetForecastByCityCountry(String value) {
        return new JAXBElement<String>(_GetForecastByCityCountry_QNAME, String.class, GetForecastByCity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "City", scope = GetForecastByCity.class)
    public JAXBElement<String> createGetForecastByCityCity(String value) {
        return new JAXBElement<String>(_GetForecastByCityCity_QNAME, String.class, GetForecastByCity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetCitiesByCountryResult", scope = GetCitiesByCountryResponse.class)
    public JAXBElement<ArrayOfstring> createGetCitiesByCountryResponseGetCitiesByCountryResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCitiesByCountryResponseGetCitiesByCountryResult_QNAME, ArrayOfstring.class, GetCitiesByCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "Country", scope = GetCitiesByCountry.class)
    public JAXBElement<String> createGetCitiesByCountryCountry(String value) {
        return new JAXBElement<String>(_GetForecastByCityCountry_QNAME, String.class, GetCitiesByCountry.class, value);
    }

}
