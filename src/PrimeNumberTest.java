import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;
/**
 * Created by ernestine on 2/23/2017.
 */
public class PrimeNumberTest {
    @Test
    public void testCase1() throws Exception {
        Assert.assertEquals(7,PrimeNumber.findPrime(4));

    }
    @Test
    public void testCase2() throws Exception {
        Assert.assertEquals(2,PrimeNumber.findPrime(1));

    }

}