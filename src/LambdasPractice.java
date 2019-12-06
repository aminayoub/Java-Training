import java.util.*;

public class LambdasPractice {
    //

    public static void main(String[] args) {

        Player amin = new Player("Amin Ayoub", 32);
        Player john = new Player("John Smith", 20);

        List<Player> players = new ArrayList<>();
        players.add(amin);
        players.add(john);

   /*        Collections.sort(players, new Comparator<Player>() {
           @Override
            public int compare(Player player1, Player player2){
               return player1.getName().compareTo(player2.getName());
          }
        });*/


       Collections.sort(players, (player1, player2) ->
                player1.getName().compareTo(player2.getName()));

        for(Player player: players) {
            System.out.println(player.getName());
        }
    }
}

class Player {
    private String name;
    private int rank;

    public Player(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank() {
        this.rank = rank;
    }
}