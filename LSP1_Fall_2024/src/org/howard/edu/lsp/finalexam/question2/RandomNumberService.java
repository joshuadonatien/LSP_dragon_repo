package org.howard.edu.lsp.finalexam.question2;

interface RandomNumberGenerator {
    int generate();
}

class JavaRandomGenerator implements RandomNumberGenerator {
    public int generate() {
        return new java.util.Random().nextInt(100) + 1; // Random 1-100
    }
}

class CustomRandomGenerator implements RandomNumberGenerator {
    public int generate() {
        return (int) (Math.random() * 100 + 1); // Custom random 1-100
    }
}

public class RandomNumberService {
    private RandomNumberGenerator generator;

    public RandomNumberService(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    public int getRandomNumber() {
        return generator.generate();
    }
}
