public class FindGeneSimpleAndTest {

    public String findGeneSimple(String dna) {

        String result = " ";
        int startIndex = dna.indexOf("ATG");

        if (startIndex == -1) { // No ATG found
            return "No gene found";
        }

        int stopIndex = dna.indexOf("TAA", startIndex + 3);

        if (stopIndex == -1) { // No TAA found
            
            return "No gene found";
        }

        result = dna.substring(startIndex, stopIndex + 3);
        return result;
    }

    public void testFindGeneSimple() {
        String dna = "AATGCGTAATATGGT"; // This DNA does not have a "TAA" stop codon after "ATG"
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
    }

    public static void main(String[] args) {
        FindGeneSimpleAndTest test = new FindGeneSimpleAndTest();
        test.testFindGeneSimple();
    }
}
