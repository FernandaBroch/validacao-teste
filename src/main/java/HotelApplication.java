package main.java;
import java.util.ArrayList;
import java.util.List;

public class HotelApplication {

    private List<Hotel> hotels;

    public HotelApplication(){
        populateHotelData();
    }

    public Hotel cheapestHotel(String input) {
        String customerType = InputExtractor.extractCustomerType(input);
        System.out.println(customerType);
        return hotels.get(0);
    }

    private void populateHotelData(){
        hotels = new ArrayList<Hotel>();

        List<Fee> lakewoodFees = new ArrayList<>();
        lakewoodFees.add(new Fee("Regular", "Weekday", 110));
        lakewoodFees.add(new Fee("Rewards", "Weekday", 80));
        lakewoodFees.add(new Fee("Regular", "Weekend", 90));
        lakewoodFees.add(new Fee("Rewards", "Weekend", 80));
        hotels.add(new Hotel("Lakewood", lakewoodFees));
        
        //oi test

    }

}
