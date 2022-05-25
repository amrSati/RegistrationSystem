package edu.cds.registrationsystem;

/**
 *  Should be instantiated only if it's different from the address
 **/
public class MailingAddress extends Address {

    /** Constructor */
    public MailingAddress(int flatNumber,
                          int houseNumber,
                          int postalCode,
                          String streetName,
                          String areaName,
                          String cityName,
                          String governorateName,
                          String country) {
        super(flatNumber, houseNumber, postalCode, streetName, areaName, cityName, governorateName, country);
    }
}
