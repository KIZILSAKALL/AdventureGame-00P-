package AdventureGame;
import java.util.*;
public class Game {
   private Scanner scan=new Scanner(System.in);

    public void start(){
       
        System.out.println("Welcome to our Game. Enjoy game !!!");
        System.out.print("Enter your name and surname: ");
        String nameSurname=scan.nextLine();
        Player player=new Player(nameSurname);
        System.out.println("Sayin "+player.getPlayerName()+ " bu karanlik ve sisli adaya hosgeldiniz ! Burada yaşananlarin hepsi gerçek !");
        
        player.selectChar();
    }
    
}
