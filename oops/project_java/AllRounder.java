public class AllRounder extends Player implements BatsmanInterface, BowlerInterface {

    private int RunsScored,wicketsTaken;
    public AllRounder(String name, int matches, int runs, int wickets){
        super(name, matches);
        RunsScored = runs;
        wicketsTaken = wickets;
        SetPlayerType();
    }
    public void SetPlayerType() {
        PlayerType = "AllRounder";
    }
    public int GetWicketsTaken(){
        return wicketsTaken;
    }
    public int GetRunsScored(){
        return RunsScored;
    }
    public String GetPlayerType(){
        return PlayerType;
    }
    public String BatsmanDetails(){
        return "AllRounder Details: Matches: " + GetMatches() + ", Runs Scored: " + GetRunsScored();
    }
    public float GetAverage(){
        if(GetMatches() > 0){
            return (float) RunsScored / GetMatches();
        }
        return 0;
    }
    public float GetBowlingAverage(){
        if(GetMatches() > 0){
            return (float) wicketsTaken / GetMatches();
        }
        return 0;
    }

}
