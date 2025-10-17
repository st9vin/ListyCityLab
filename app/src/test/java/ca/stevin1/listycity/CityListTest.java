package ca.stevin1.listycity;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for CityList class.
 */
public class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.hasCity(city));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddException() {
        CityList cityList = mockCityList();
        City city = mockCity();
        cityList.add(city); // should throw exception
    }

    @Test
    public void testHasCity() {
        CityList cityList = mockCityList();
        assertTrue(cityList.hasCity(mockCity()));
        assertFalse(cityList.hasCity(new City("Calgary", "Alberta")));
    }

    @Test
    public void testDelete() {
        CityList cityList = mockCityList();
        City city = mockCity();
        cityList.delete(city);
        assertEquals(0, cityList.countCities());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteException() {
        CityList cityList = mockCityList();
        City city = new City("Vancouver", "BC");
        cityList.delete(city);
    }

    @Test
    public void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        cityList.add(new City("Calgary", "Alberta"));
        assertEquals(2, cityList.countCities());
    }
}
