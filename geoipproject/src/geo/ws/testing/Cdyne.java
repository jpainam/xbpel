package geo.ws.testing;


import com.cdyne.ws.IP2Geo;
import com.cdyne.ws.IP2GeoSoap;
import com.cdyne.ws.IPInformation;


public class Cdyne implements Runnable{
	private String result = null;
	public boolean hasAnswered = false;
	private IP2GeoSoap geosoap = null;
	private String destination;
	
	public Cdyne(String dest){
		IP2Geo geoservice = new IP2Geo();
		geosoap = geoservice.getIP2GeoSoap();
		destination = dest;
	}
	public String getResult(){
		return result;
	}
	@Override
	public void run() {
		while(!hasAnswered){
			IPInformation infosip = geosoap.resolveIP(destination, "0");
			result = infosip.getCountry();
			if(!result.isEmpty())
				hasAnswered = true;
			else
				continue;
		}
		
	}
}
