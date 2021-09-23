import edu.duke.*;
import java.io.File;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
 
    public static void main (String [] args)
    {
    URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
      
      for (String s : ur.words()) {
      String url1 = s.toLowerCase();
      int youtube = url1.indexOf("youtube.com");
      if(youtube > 0)
      {
        int beg = s.lastIndexOf("\"",youtube);
        int end = s.indexOf("\"", youtube+1);
        System.out.println(s.substring(beg+1,end));
        }
      } 
     
    }
}
