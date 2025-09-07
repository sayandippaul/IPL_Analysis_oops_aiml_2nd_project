import java.util.Set;

public class Batsman extends Player implements BatsmanInterface,Runnable{
    private int RunsScored;
    public Batsman(String name,int matches,int runs){
        super(name, matches);
        RunsScored = runs;
        SetPlayerType();
    }
    public String BatsmanDetails(){
        return "Runs Scored: " + RunsScored + ", Matches: " + GetMatches();
    }
    public void setRunsScored(int runs){
        RunsScored = runs;
    }
    public int GetRunsScored(){
        return RunsScored;
    }
    public int GetMatches(){
        return Matches;

    }
    public float GetAverage(){
        if(Matches > 0){
            return (float) RunsScored / Matches;
        }
        return 0;
    }
      public void bat() {
            System.out.println(GetName() + " is batting.");
        }
        
    public void run() {
        // Batting logic here
        bat();
    }

    public void SetPlayerType() {
        PlayerType = "Batsman";
    }
    public String GetPlayerType(){
        return PlayerType;
    }
}
