package TemperatureConverter;
class TempCalculator {
  public double celsiusIntoFahrenheit(double c) {
    return c * 9 / 5 + 32;
  }

  public double fahrenheitIntoCelsius(double f) {
    return (f - 32) * 5 / 9;
  }

  public double celsiusIntoKelvin(double c) {
    return c + 273.15;
  }

  public double kelvinIntoCelsius(double k) {
    return k - 273.15;
  }

  public double fahrenheitIntoKelvin(double f) {
    return (f + 459.67) * 5 / 9;
  }

  public double kelvinIntoFahrenheit(double k) {
    return k * 9 / 5 - 459.67;
  }
}
