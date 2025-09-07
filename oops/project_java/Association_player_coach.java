public class Association_player_coach {
  public static void main(String[] args) {
    PlayerDemo player1 = new PlayerDemo("John");
    PlayerDemo player2 = new PlayerDemo("Alice");

    CoachDemo coach = new CoachDemo("Coach Mike");

    coach.train(player1);
    coach.train(player2);
  }
}
class PlayerDemo {
  String name;
  public PlayerDemo(String name) {
    this.name = name;
  }
}
class CoachDemo {
  String name;
  public CoachDemo(String name) {
    this.name = name;
  }
  public void train(PlayerDemo player) {
    System.out.println(name + " is training " + player.name);
  }
}
