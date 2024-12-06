package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service1 = new RandomNumberService(new JavaRandomGenerator());
        System.out.println("Random Number (Java RNG): " + service1.getRandomNumber());

        RandomNumberService service2 = new RandomNumberService(new CustomRandomGenerator());
        System.out.println("Random Number (Custom RNG): " + service2.getRandomNumber());
    }
}
