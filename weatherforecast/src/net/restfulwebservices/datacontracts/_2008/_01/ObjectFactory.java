
package net.restfulwebservices.datacontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.restfulwebservices.datacontracts._2008._01 package. 
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

    private final static QName _Weather_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Weather");
    private final static QName _WeatherTemperature_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Temperature");
    private final static QName _WeatherDewPoint_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "DewPoint");
    private final static QName _WeatherSkyConditions_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "SkyConditions");
    private final static QName _WeatherLocation_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Location");
    private final static QName _WeatherVisibility_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Visibility");
    private final static QName _WeatherPressure_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Pressure");
    private final static QName _WeatherWind_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Wind");
    private final static QName _WeatherTime_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Time");
    private final static QName _WeatherRelativeHumidity_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "RelativeHumidity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.restfulwebservices.datacontracts._2008._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Weather")
    public JAXBElement<Weather> createWeather(Weather value) {
        return new JAXBElement<Weather>(_Weather_QNAME, Weather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Temperature", scope = Weather.class)
    public JAXBElement<String> createWeatherTemperature(String value) {
        return new JAXBElement<String>(_WeatherTemperature_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "DewPoint", scope = Weather.class)
    public JAXBElement<String> createWeatherDewPoint(String value) {
        return new JAXBElement<String>(_WeatherDewPoint_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "SkyConditions", scope = Weather.class)
    public JAXBElement<String> createWeatherSkyConditions(String value) {
        return new JAXBElement<String>(_WeatherSkyConditions_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Location", scope = Weather.class)
    public JAXBElement<String> createWeatherLocation(String value) {
        return new JAXBElement<String>(_WeatherLocation_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Visibility", scope = Weather.class)
    public JAXBElement<String> createWeatherVisibility(String value) {
        return new JAXBElement<String>(_WeatherVisibility_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Pressure", scope = Weather.class)
    public JAXBElement<String> createWeatherPressure(String value) {
        return new JAXBElement<String>(_WeatherPressure_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Wind", scope = Weather.class)
    public JAXBElement<String> createWeatherWind(String value) {
        return new JAXBElement<String>(_WeatherWind_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Time", scope = Weather.class)
    public JAXBElement<String> createWeatherTime(String value) {
        return new JAXBElement<String>(_WeatherTime_QNAME, String.class, Weather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "RelativeHumidity", scope = Weather.class)
    public JAXBElement<String> createWeatherRelativeHumidity(String value) {
        return new JAXBElement<String>(_WeatherRelativeHumidity_QNAME, String.class, Weather.class, value);
    }

}
