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
    public static String getYesOrNo(Scanner sc, String prompt) {
        System.out.println("Would you like to pick another number yes or no?");

        String s = sc.next();// read user entry

        while (!(s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("no"))) {
            System.out.println("Error! Invalid entry, please type yes or no ");
            s = sc.next();
            sc.nextLine();

        }
        return s;

}