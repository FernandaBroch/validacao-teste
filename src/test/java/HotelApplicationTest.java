package test.java;
import org.junit.Test;

import main.java.Hotel;
import main.java.HotelApplication;

import static org.junit.Assert.*;

public class HotelApplicationTest {

   @Test
   public void testCheapestHotelShouldReturnLakewoodRegularWeekdays(){
    String input = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";
    HotelApplication app = new HotelApplication();

    Hotel resultHotel = app.cheapestHotel(input);

    assertEquals("Lakewood", resultHotel.getName());
   }
//
//    @Test
//    public void testCheapestHotelShouldReturnBridgewoodRegularWeekdays(){
//        String input = "Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";
//        HotelApplication app = new HotelApplication();
//
//        Hotel resultHotel = app.cheapestHotel(input);
//
//        assertEquals("Bridgewood", resultHotel.getName());
//    }

}
