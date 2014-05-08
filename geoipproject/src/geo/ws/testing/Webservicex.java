package geo.ws.testing;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class Webservicex implements Runnable{
	private String result = null;
	public boolean hasAnswered = false;
	private GeoIPServiceSoap geo = null;
	private String destination;
	
	public Webservicex(String dest){
		GeoIPService geoservice = new GeoIPService();
		geo =  geoservice.getGeoIPServiceSoap();
		destination = dest;
	}
	public String getResult(){
		return result;
	}
	@Override
	public void run() {
		while(!hasAnswered){
			GeoIP ip = geo.getGeoIP(destination);
			result = ip.getCountryName();
			if(!result.isEmpty())
				hasAnswered = true;
			else
				continue;
		}
		
	}
}
