/**
 * Created by ernestine on 2/23/2017.
 */
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumber {

    //Create an array
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Let's locate some primes!\n");
        System.out.println("This application will find you any prime, in order, from first prime number on.");
        System.out.println("Which prime number are you looking for?\n ");
        int key = scan.nextInt();
        findPrime(key);
        System.out.println("The "+key+"th prime number is " + findPrime(key)+".");
        System.out.println("Do you want to find another prime number: (y/n):");
        System.out.println("Which prime number are you looking for? ...");

    }
    public static int findPrime(int key){
        int numbers[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67,
                71, 73, 79, 83, 89, 97, 101, 103, 107, 109,
                113, 127, 131, 137, 139, 149, 151, 157, 163,
                167, 173, 179, 181, 191, 193, 197, 199};//declaration, instantiation and initialization ;//declaration and instantiation of array
        return numbers[key-1];
    }
}