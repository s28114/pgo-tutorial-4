public class Address {

    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city) {
        return String.format("Country: %s; City: %s", country, city);
    }

    public String createAddress(String country, String city, int zipCode) {
        return String.format("Country: %s; City: %s; Zip-code: %d", country, city, zipCode);
    }

    public String createAddress(String country, String city, int zipCode, String street) {
        return String.format("Country: %s; City: %s; Zip-code: %d; Street name: %s", country, city, zipCode, street);
    }

    public String createAddress(String country, String city, int zipCode, String street, int apartmentNumber) {
        return String.format("Country: %s; City: %s; Zip-code: %d; Street name: %s; Apartment number: %d", country, city, zipCode, street, apartmentNumber);
    }
}