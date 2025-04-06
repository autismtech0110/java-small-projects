public class BoardGames {
   
    public static void main(String[] args) {
        // Declare class objects
	Monopoly m = new Monopoly();
        Chess c = new Chess();
        Battleship b = new Battleship();
        
	// Objects can now call their class methods
        m.play();
        c.play();
        b.play();
    }
}

abstract class Game {
    abstract String getName();
    abstract void play();
}

class Monopoly extends Game {

    // Give "Monopoly" name to game
    String getName() {
        String name = "Monopoly";
        return name;
   }

    // Play method should print "Buy all property."
    void play() {
        System.out.println("Buy all property.");
    }
}

class Chess extends Game {

    // Give "Chess" name to game
    String getName() {
        String name = "Chess";
        return name;
    }

   // Play method should print "Capture the enemy king."
   void play() {
       System.out.println("Capture the enemy king.");
   }
}

class Battleship extends Game {

    // Give "Battleship" name to game
    String getName() {
        String name = "Battleship";
        return name;
    }

    // Play method should print "Sink all ships."
    void play() {
        System.out.println("Sink all ships.");
    }
}
