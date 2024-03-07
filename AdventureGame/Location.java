package AdventureGame;
import java.util.*;

import java.util.Scanner;

public abstract class Location {
    

    private Player player;
    private String locName;

    public Location(Player player, String locName) {
        this.player = player;
        this.locName = locName;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    
    public void location(){
        Scanner scan=new Scanner(System.in);

        System.out.println("1) Safe house");
        System.out.println("2) Forest");
        System.out.println("3) Cave");
        System.out.println("4) River");
        System.out.println("5) Toolstore");

        System.out.print("Please enter a loacation: ");
        int location=scan.nextInt();

        if(location==1){
            this.locName="Safe house";
        }else if(location==2){
            this.locName="Forest";

        }else if(location==3){
            this.locName="Cave";

        }else if(location==4){
            this.locName="River";

        }else if(location==5){
            this.locName="Toolstore";   
        }
    }

        public abstract boolean onLocation();
    
}
