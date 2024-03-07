package AdventureGame;
import java.util.*;

 public class Player {
    private int id;
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String playerName;
    private Scanner scan=new Scanner(System.in);

    public Player(String playerName) {
        this.playerName=playerName;
    }


    
    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectChar(){

        GameChar[] charlist={new Samurai(),new Archer(),new Knight()};

        System.out.println();
        System.out.println("****************************************************");

        System.out.println("CHARACTERS DAMAGE   HEALTH    MONEY");

        int i=1;
       for (GameChar gameChar : charlist) {
         System.out.println(gameChar.getId()+")"+gameChar.getName()+"     "+gameChar.getDamage()+"        "+gameChar.getHealth()+"       "+gameChar.getMoney());
         i++;
       }
        System.out.println("****************************************************");

       System.out.print("Please select a character = ");
       int selectChar=scan.nextInt();

       switch(selectChar){

        case 1:
        initPlayer(new Samurai());
        break;

        case 2:
        initPlayer(new Archer());
        break;

        case 3: 
        initPlayer(new Knight());
        break;

        default :
        initPlayer(new Samurai());

       }    

       System.out.println("Selected = "+this.getCharName()+"  Damage = "+this.getDamage()+"  Health = "+this.getHealth()+"  Money = "+this.getMoney());
    }

    public void initPlayer(GameChar gameChar){
        this.setId(gameChar.getId());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    
}
