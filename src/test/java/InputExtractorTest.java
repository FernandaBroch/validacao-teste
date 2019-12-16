package test.java;
import org.junit.Test;

import main.java.InputExtractor;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InputExtractorTest {

    @Test
    public void testExtractCustomerTypeShouldReturnRegularCustomer(){
        String input = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";

        String expectedCustomerType = InputExtractor.extractCustomerType(input);

        assertEquals("Regular", expectedCustomerType);
    }

    @Test
    public void testExtractCustomerTypeShouldReturnRewardsCustomer(){
        String input = "Rewards: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";

        String expectedCustomerType = InputExtractor.extractCustomerType(input);

        assertEquals("Rewards", expectedCustomerType);
    }

    @Test
    public void testExtractDaytypesShouldReturnListWithWeekdays() throws Exception {
        String input = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";

        List<String> expectedDayTypes = InputExtractor.extractDayTypes(input);
        expectedDayTypes.stream().forEach(expectedDayType -> assertEquals("Weekday", expectedDayType));
    }

}
