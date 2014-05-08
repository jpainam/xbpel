package net.restfulwebservices.servicecontracts._2008._01;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

public class WeatherTesting {
	static{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		WeatherForecastService weather = new WeatherForecastService();
		IWeatherForecastService weatherservice = weather.getBasicHttpBindingIWeatherForecastService();
		try {
			String country = JOptionPane.showInputDialog("Input the name of a Country : ");
			ArrayOfstring returnval = weatherservice.getCitiesByCountry(country);
			System.out.println(returnval.toString());
		} catch (IWeatherForecastServiceGetCitiesByCountryDefaultFaultContractFaultFaultMessage e) {
			e.printStackTrace();
		}
		
	}

}
