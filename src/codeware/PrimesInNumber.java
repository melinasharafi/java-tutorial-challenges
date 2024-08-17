package codeware;

import java.util.ArrayList;
import java.util.List;

public class PrimesInNumber {

    public static String factors(int n) {

        // check for positive numbers
        if (n <= 0) {
            return "Only positive numbers have prime factor decomposition";
        }

        StringBuilder output = new StringBuilder();

        List<Integer> primeNumbers = generatePrimes(100);

        while ((n > 1)) {

            for (int prime : primeNumbers) {

                int numberOfPrime = 0;

                while ((n % prime == 0)) {
                    numberOfPrime++;
                    n = n / prime;
                }

                if (numberOfPrime == 1) {
                    output.append("(");
                    output.append(prime);
                    output.append(")");
                } else if (numberOfPrime > 1) {
                    output.append("(");
                    output.append(prime);
                    output.append("**");
                    output.append(numberOfPrime);
                    output.append(")");
                }

                if (n == 1) {
                    break;
                }
            }
        }

        return output.toString();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to generate a list of prime numbers up to a certain limit
    public static List<Integer> generatePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }


    public static void main(String[] args) {
        System.out.println(factors(24));
        System.out.println(factors(7775460));
    }
}

