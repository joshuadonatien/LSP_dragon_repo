package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

public class VotingMachine {
    private HashMap<String, Integer> candidates;  // Stores candidates and their votes

    // Constructor to make a new voting machine
    public VotingMachine() {
        candidates = new HashMap<>();  // Start with no candidates
    }

    // This adds a new candidate to the list
    public void addCandidate(String name) {
        candidates.put(name, 0);  // Add candidate with 0 votes
    }

    // This adds a vote to a candidate
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);  // Increase the vote count by 1
        }
    }

    // This prints out all the candidates and how many votes they got
    @Override
    public String toString() {
        String result = "";  // Start with an empty string
        for (String name : candidates.keySet()) {
            result += name + ": " + candidates.get(name) + " votes\n";  // Add candidate and votes to result
        }
        return result;  // Return the string of all candidates and votes
    }
}



