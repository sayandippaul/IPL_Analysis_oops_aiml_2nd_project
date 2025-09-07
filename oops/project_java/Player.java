public class Player {
    private String Name;
    protected int Matches;
    protected String PlayerType="Not Known";

    public Player(String name, int matches) {
        Name = name;
        Matches = matches;
    }
    public String GetName(){
        return Name;
    }
    public String GetPlayerType(){
        return PlayerType;
    }
    public int GetMatches(){
        return Matches;
    }
    public float GetAverage(){
        // just concept of polymorphism 
        return 0;
    }
    public float GetBowlingAverage(){
        // just concept of polymorphism
        return 0;
    }

}
