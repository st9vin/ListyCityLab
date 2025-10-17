package ca.stevin1.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a City object with the given name and province.
     * @param city the name of the city
     * @param province the name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     * @return the city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     * @return the province name
     */
    public String getProvinceName() {
        return this.province;
    }

    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        City cityObj = (City) obj;
        return city.equals(cityObj.city) && province.equals(cityObj.province);
    }

    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}
