import edu.duke.*;
import java.io.File;

/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {

    public String findSimpleGene(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1 )
        {
        return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1)
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
        return result;
        }
    }
    
    public void testSimpleGene(){
        String dna1 = "ATGAATGATGSHTAAGHS";
        String dnagene1 = findSimpleGene(dna1);
        System.out.println("Gene : " +dnagene1);
        String dna2 = "ATGAATGATGSHTA";
        String dnagene2 = findSimpleGene(dna2);
        System.out.println("Gene : " +dnagene2);
        String dna3 = "TGGTGSHTAAGHS";
        String dnagene3 = findSimpleGene(dna3);
        System.out.println("Gene : " +dnagene3);
        String dna4 = "ATGAATHTTAA";
        String dnagene4 = findSimpleGene(dna4);
        System.out.println("Gene : " +dnagene4);
        String dna5 = "AGAATHTTA";
        String dnagene5 = findSimpleGene(dna5);
        System.out.println("Gene : " +dnagene5);
    }
}
