import java.util.*;
class Player {
  String name;
  String costume;
  int piecesOfCandy;

  public Player(String name, String costume, int piecesOfCandy) {
    this.name = name;
    this.costume = costume;
    this.piecesOfCandy = piecesOfCandy;
  }
  
  public void TrickOrTreat() {
  
    //The greatings
    System.out.println("-----------------------------------");
    System.out.println(name + ": Trick or Treat!");
    System.out.println("Home Owner: That's a good " + costume + " costume.");

    //Trick or Treat coin toss'
    int TrickOTreat = (int)(Math.random() * 2);
    //Cases for trick or treat
    switch(TrickOTreat){
      case 0: 
        //Tricks
        int trick = (int)(Math.random() * 4);
        //five kinds of tricks  
        switch(trick){
          case 0:
            System.out.println(name + " is pelted with eggs");
            break;
          case 1:
            System.out.println(name + " is scared by a ghost.");
            break;
          case 2:
            System.out.println(name + " reaches for into the bowl but only finds cold spagetti.");
            break;
          case 3:
            System.out.println(name + " gets blasted with a marshmellow gun.");
            break;
          case 4:
            System.out.println(name + " is scared when a clown jumps out of the bushes.");
            break;
        }
        
        System.out.println("Home Owner: Mwahaha!");
        
        break;

      //Treats
      case 1:
        System.out.println("Home Owner: Here's some candy.");
        //Random candy
        piecesOfCandy = piecesOfCandy + (int)((Math.random() * 5) + 1);
        System.out.println(name + ": Thank you!");
        break;
    }
    //Candy total
    System.out.println("---");
    System.out.println("Your Candy Total is: " + piecesOfCandy);
    System.out.println("---");
  }
}