public class Bowler extends Player implements BowlerInterface,Runnable{
    int Wickets;
    public Bowler(String name, int matches, int wickets) {
        super(name, matches);
        Wickets = wickets;
        SetPlayerType();

    }
    public int GetWickets() {
        return Wickets;
    }
    public float GetBowlingAverage() {
        if (Wickets == 0) return 0;
        return  (float) Wickets / GetMatches() ;
    }
    public void SetPlayerType() {
        PlayerType = "Bowler";
    }
    public void bowl() {
            System.out.println(GetName() + " is bowling.");
        }
        
    public void run() {
        // Bowling logic here
        bowl();
    }
    public String GetPlayerType(){
        return PlayerType;
    }
}
