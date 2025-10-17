package ca.stevin1.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class keeps track of a list of City objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     * @param city The city to add.
     * @throws IllegalArgumentException if the city already exists.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks if a city exists in the list.
     * @param city The city to check.
     * @return true if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists.
     * @param city The city to delete.
     * @throws IllegalArgumentException if the city does not exist.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Counts how many cities are in the list.
     * @return The number of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns a sorted list of the cities.
     * @return The sorted list of cities.
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }
}
