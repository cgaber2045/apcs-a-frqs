
/**
 * Write a description of class WordListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class WordListTester
{
   public static void main(String[] args)
   {
        ArrayList myList = new ArrayList();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
        
        WordList r1 = new WordList(myList);
        
        System.out.println(r1.numWordsOfLength(2));
        r1.removeWordsOfLength(4);
        System.out.println(myList);
   }
}
