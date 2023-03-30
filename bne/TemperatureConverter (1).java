package TemperatureConverter;
import java.util.*;


public class TemperatureConverter {
	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    TempCalculator calculator = new TempCalculator();

	    System.out.print("Shkruani temperaturën: ");
	    double temp = scanner.nextDouble();

	    System.out.print("Shkruani shkallën e temperaturës (Celsius, Fahrenheit, or Kelvin): ");
	    String scale = scanner.next();

	    System.out.print("Shkruani shkallën në të cilën doni ta konvertoni: ");
	    String targetScale = scanner.next();

	    double result = 0;
	    if (scale.equalsIgnoreCase("Celsius")) {
	      if (targetScale.equalsIgnoreCase("Fahrenheit")) {
	        result = calculator.celsiusIntoFahrenheit(temp);
	      } else if (targetScale.equalsIgnoreCase("Kelvin")) {
	        result = calculator.celsiusIntoKelvin(temp);
	      }
	    } else if (scale.equalsIgnoreCase("Fahrenheit")) {
	      if (targetScale.equalsIgnoreCase("Celsius")) {
	        result = calculator.fahrenheitIntoCelsius(temp);
	      } else if (targetScale.equalsIgnoreCase("Kelvin")) {
	        result = calculator.fahrenheitIntoKelvin(temp);
	      }
	    } else if (scale.equalsIgnoreCase("Kelvin")) {
	      if (targetScale.equalsIgnoreCase("Celsius")) {
	        result = calculator.kelvinIntoCelsius(temp);
	      } else if (targetScale.equalsIgnoreCase("Fahrenheit")) {
	        result = calculator.kelvinIntoFahrenheit(temp);
	      }
	    }

	    System.out.println(temp + " " + scale + " është " + result + " " + targetScale);
	  }
	}



