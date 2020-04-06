import com.bridgelabz.service.CabInvoiceService;
import com.bridgelabz.service.Ride;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.RowId;

public class CabInvoiceServiceTest {
    CabInvoiceService cabInvoiceService = null;

    @Before
    public void createObject() {
        cabInvoiceService = new CabInvoiceService();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 5.0;
        int time = 15;
        double fare = cabInvoiceService.calculateFare(distance, time);
        Assert.assertEquals(65, fare, 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        double distance = 0.1;
        int time = 2;
        double fare = cabInvoiceService.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(4.1, 25)
        };
        double totalFare = cabInvoiceService.calculateFareForMultipleRides(rides);
        Assert.assertEquals(96, totalFare, 0);
    }
}
