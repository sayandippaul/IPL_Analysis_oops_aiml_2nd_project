import java.util.*;
public class Composition_team_board {
  public static void main(String[] args) {
    BoardDemo board = new BoardDemo("Board A");

    board.addTeam("Team A");
    board.addTeam("Team B");
    board.showTeams();
  }
}

class TeamDemo {
  String name;
  public TeamDemo(String name) {
    this.name = name;
  }
}

class BoardDemo {
  String name;
  List<TeamDemo> teams = new ArrayList<>();

  public BoardDemo(String name) {
    this.name = name;
  }

  public void addTeam(String t) {
    TeamDemo team = new TeamDemo(t);

    teams.add(team);
  }

  public void showTeams() {
    System.out.println("Teams in " + name + ":");
    for (TeamDemo team : teams) {
      System.out.println("- " + team.name);
    }
  }
}
