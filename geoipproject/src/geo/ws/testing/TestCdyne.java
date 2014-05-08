package geo.ws.testing;

import com.cdyne.ws.IP2Geo;
import com.cdyne.ws.IP2GeoSoap;
import com.cdyne.ws.IPInformation;

public class TestCdyne {

	public static void main(String[] args) {
		IP2Geo geo = new IP2Geo();
		IP2GeoSoap geosoap = geo.getIP2GeoSoap();
		IPInformation infosip = geosoap.resolveIP("189.12.15.78", "0");
		System.out.println("Country is " + infosip.getCountry());

	}

}
