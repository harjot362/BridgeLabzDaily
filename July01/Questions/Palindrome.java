package July01.Questions;

public class Palindrome {
  public static void main(String[] args) {

    String word = "Radar", reverseWord = "";
    int wordLen = word.length();

    for (int i = (wordLen - 1); i >=0; --i) {
      reverseWord = reverseWord + word.charAt(i);
    }

    if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
      System.out.println(word + " is a Palindrome String.");
    }
    else {
      System.out.println(word + " is not a Palindrome String.");
    }
  }
}

