import java.util.Scanner;

public class CharacterInfo
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String aChar1 = input.nextLine();
      char aChar= aChar1.charAt(0);    //converts string to char

      System.out.println("The character is " + aChar);
      if(Character.isUpperCase(aChar))
         System.out.println(aChar + " is uppercase");
      else
         System.out.println(aChar + " is not uppercase");
      if(Character.isLowerCase(aChar))
         System.out.println(aChar + " is lowercase");
      else
         System.out.println(aChar + " is not lowercase");
      aChar = Character.toLowerCase(aChar);
      System.out.println("After toLowerCase(), aChar is " + aChar);
      aChar = Character.toUpperCase(aChar);
      System.out.println("After toUpperCase(), aChar is " + aChar);
      if(Character.isLetterOrDigit(aChar))
         System.out.println(aChar + " is a letter or digit");
      else
         System.out.println(aChar +
            " is neither a letter nor a digit");
      if(Character.isWhitespace(aChar))
         System.out.println(aChar + " is whitespace");
      else
         System.out.println(aChar + " is not whitespace");
   }
}
