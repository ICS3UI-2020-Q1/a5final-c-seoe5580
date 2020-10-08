import java.util.Scanner;
/**
 * This program will start counting and end counting depending on user's input
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user what number they want to start counting from
    System.out.println("What number do you want to begin counting from?");
    
    // Gets the starting number from the user
    int numStart = input.nextInt();

    // Asks the user what number they want to end counting at
    System.out.println("What number do you want to end counting at?");

    // Gets the ending number from the user
    int numEnd = input.nextInt();

    // using the if statement if the starting num is an odd number it will add one to round it up
    if(numStart % 2 == 1){
      numStart = numStart + 1;
    }
    
    // using the for loop it will add 2 everytime from the starting vaule until it reaches the ending number
    for(int i = numStart; i <= numEnd; i += 2){
      System.out.println(i);
    }
    
  }
}
