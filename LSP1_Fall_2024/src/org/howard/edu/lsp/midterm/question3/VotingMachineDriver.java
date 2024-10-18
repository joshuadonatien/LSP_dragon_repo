package org.howard.edu.lsp.midterm.question3;

//This is the driver class to test the VotingMachine class
public class VotingMachineDriver {
 public static void main(String[] args) {
     VotingMachine vm = new VotingMachine();  // Make a new voting machine
     
     // Add candidates
     vm.addCandidate("Alsobrooks");
     vm.addCandidate("Hogan");
     
     // Cast votes
     vm.castVote("Alsobrooks");
     
     // Print out the votes
     System.out.println(vm);
 }
}
