import com.bridgelabz.service.CabInvoiceService;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest {
    CabInvoiceService cabInvoiceService = new CabInvoiceService();

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
}
