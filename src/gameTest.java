import java.util.Scanner;

public class gameTest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter players Names");

        player p1 = new player(sc.nextLine());
        //player p2 = new player(sc.nextLine());
        //p1.name = sc.nextLine();
        p1.makeGuess();
        //p2.makeGuess();
        while(true){
           boolean gameover = Game.checkPlayerInput(p1.playerGuess, p1.name);
           if(gameover){
               break;
           }
        }

    }
}
