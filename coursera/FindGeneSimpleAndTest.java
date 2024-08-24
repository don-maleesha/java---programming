public class FindGeneSimpleAndTest {
    
    public static void main(String[] args){

        String result = " ";

        return;

    }

    public void FindGeneSimple() {
    
        String dna = "AATGCGTAATATGGT";
        String result = ""; // Declare the result variable
    
        // Find the index of the start codon "ATG"
        int startIndex = dna.indexOf("ATG");
    
        // Find the index of the stop codon "TAA"
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
    
        // If the start and stop codons are found
        if (startIndex != -1 && stopIndex != -1) {
    
            // Check if the length of the gene is a multiple of 3
            if ((stopIndex - startIndex) % 3 == 0) {
    
                // Extract the gene from the DNA string
                result = dna.substring(startIndex, stopIndex + 3);
    
            }
    
        }
    
    }
}
