public class Game {

    private static int randonNumberGeneratedByGame(){
        return (int)(Math.random()*10);
    }
    public static boolean checkPlayerInput(int playerGuess,String p1){
        int x = randonNumberGeneratedByGame();
        if(playerGuess == x){
            System.out.println(p1+" guessed it correctly");
            return true;
        }
        else{
            System.out.println("You guessed " + playerGuess+ ",Correct number is "+x+". Play again");
            return false;
        }
    }
}
