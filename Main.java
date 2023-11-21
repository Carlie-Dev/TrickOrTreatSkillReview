import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    
    //scanners and player inputs
      //Name
    Scanner nameScanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String playerName = nameScanner.nextLine();
    
      //Costume
    Scanner costumeScanner = new Scanner(System.in);
    System.out.println("What are you dressed up as?");
    String playerCostume = costumeScanner.nextLine();

    Player trickerTreater = new Player(playerName, playerCostume, 0);
    
  //number of houses
    Scanner housesScanner = new Scanner(System.in);
    System.out.println("How many houses do you want to go to? Enter an integer bellow.");
    int housesNum = housesScanner.nextInt();
    
      //gameplay.. Calling the trick or treats
      for (int i = 0; i < housesNum; i++) {
        trickerTreater.TrickOrTreat();
    }
    
    nameScanner.close();
    costumeScanner.close();
    housesScanner.close();
  }
}