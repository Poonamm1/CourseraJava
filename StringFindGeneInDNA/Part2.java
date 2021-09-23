import edu.duke.*;
import java.io.File;

/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        int stopIndex = dna.indexOf(stopCodon, startIndex+3);
        if ((startIndex == -1 && stopIndex == -1) || startIndex == -1 || stopIndex == -1)
        {
        return "";
        }
        int validgene = (startIndex - stopIndex) % 3;
        if(validgene != 0)
        {
        return "";
        }
        else 
        {
        result = dna.substring(startIndex, stopIndex+3);
         
           return result.toUpperCase();
        }
        
    }
    
    public void testSimpleGene(){
        String startCodon = "ATG";
        String StopCodon = "TAA";
        String dna1 = "ATGTGATAA";
        String dnagene1 = findSimpleGene(dna1, startCodon, StopCodon);
        System.out.println("Gene : " +dnagene1);
        String dna0 = "ATGAATGATGSHTAAGHS";
        String dnagene0 = findSimpleGene(dna0,startCodon, StopCodon);
        System.out.println("Gene : " +dnagene0);
        String dna2 = "ATGAATGATGSHTA";
        String dnagene2 = findSimpleGene(dna2,startCodon, StopCodon);
        System.out.println("Gene : " +dnagene2);
        String dna3 = "TGGTGSHTAAGHS";
        String dnagene3 = findSimpleGene(dna3, startCodon, StopCodon);
        System.out.println("Gene : " +dnagene3);
        String dna4 = "ATGAATHTTAA";
        String dnagene4 = findSimpleGene(dna4, startCodon, StopCodon);
        System.out.println("Gene : " +dnagene4);
        String dna5 = "AGAATHTTA";
        String dnagene5 = findSimpleGene(dna5, startCodon, StopCodon);
        System.out.println("Gene : " +dnagene5);
    }
}