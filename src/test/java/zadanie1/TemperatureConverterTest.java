package zadanie1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;

    public TemperatureConverterTest() {
        this.temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void testShouldConvertCelsiusToFahrenheit() {
        double result = this.temperatureConverter.convertCelsiusToFahrenheit(0);

        Assertions.assertEquals(32.0, result);
    }

    @Test
    public void testShouldConvertMinusCelsiusToFahrenheit() {
        double result = this.temperatureConverter.convertCelsiusToFahrenheit(-32);
        Assertions.assertEquals(-25.6, result);
    }
}