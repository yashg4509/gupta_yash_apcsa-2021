package unit5;

import static java.lang.System.*;

public class WordsCompareRunner {
   public static void main(String args[]) {
      WordsCompare test = new WordsCompare("hello", "goodbye");
      out.println(test.toString());
      test.setWords("abe", "ape");
      
      out.println(test.toString());
      test.setWords("giraffe", "gorilla");
      
      out.println(test.toString());
      test.setWords("one", "two");

      out.println(test.toString());
      test.setWords("fun", "funny");

      out.println(test.toString());
      test.setWords("123", "19");
      
      out.println(test.toString());
      test.setWords("193", "1910");

      out.println(test.toString());
      test.setWords("goofy", "godfather");
  
      out.println(test.toString());
      test.setWords("funnel", "fun");

   }
}