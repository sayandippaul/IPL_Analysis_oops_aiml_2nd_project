
import java.util.*;
public class Aggregation_player_team {
  public static void main(String[] args) {
    PlayerDemo player1 = new PlayerDemo("John");
    PlayerDemo player2 = new PlayerDemo("Alice");

    TeamDemo team = new TeamDemo("Team A");
    team.addPlayer(player1);
    team.addPlayer(player2);

    team.showPlayers();
  }
}

class PlayerDemo {
  String name;
  public PlayerDemo(String name) {
    this.name = name;
  }
}

class TeamDemo {
  String name;
  List<PlayerDemo> players = new ArrayList<>();

  public TeamDemo(String name) {
    this.name = name;
  }

  public void addPlayer(PlayerDemo player) {
    players.add(player);
  }

  public void showPlayers() {
    System.out.println("Players in " + name + ":");
    for (PlayerDemo player : players) {
      System.out.println("- " + player.name);
    }
  }
}
