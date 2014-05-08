package geo.ws.testing;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class TestServicex {

	public static void main(String[] args) {
		GeoIPService geoservice = new GeoIPService();
	
		GeoIPServiceSoap geo =  geoservice.getGeoIPServiceSoap();
		GeoIP ip = geo.getGeoIP("15.15.15.15");
		String result = ip.getCountryName();
		System.out.println("THe result is " + result);
	}

}
