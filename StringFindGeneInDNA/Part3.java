
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
   public String twoOccurrences(String startcodon, String dna){
       
      int text = dna.indexOf(startcodon); 
      int twiceString = dna.indexOf(startcodon, text+3);
      if(twiceString > 0)
      {
          return "True";
        }
      return "False";  
   }  
   
   public String lastPart(String startcodon, String dna){
      int text = dna.indexOf(startcodon); 
      int twiceString = dna.indexOf(startcodon, text+3);
      if(twiceString > 0){  
        String restString = dna.substring(twiceString);
        return restString;
      }
       return startcodon;
    }
   
   public void testTwoOccurrences(){
       String startcodon = "ATG";
       String dna = "ATGHATGHJTGSTAA";
       String twiceString = twoOccurrences(startcodon, dna);
       System.out.println(" Text Occured Twice at : " +twiceString);
       String restString = lastPart(startcodon, dna);
       System.out.println(" Text Occured Twice at : " +restString);
       String startcodon1 = "ATG";
       String dna1 = "ATGHATHASFTAA";
       String restString1 = lastPart(startcodon1, dna1);
       System.out.println(" Text Occured Twice at : " +restString1);
    }
}
