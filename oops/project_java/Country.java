import java.util.ArrayList;

public class Country{
    private String CountryName;
    private ArrayList<Player> PlayerList=new ArrayList<Player>();
    public Country(String countryName){
        this.CountryName = countryName;
    }
    public String GetCountryOfPlayer(String playerName){
        for(int i=0;i<PlayerList.size();i++){
            if(PlayerList.get(i).GetName().equals(playerName)){
                return CountryName;
            }
        }
        // if(PlayerList.contains(playerName)){
        //     return CountryName;
        // }
        return "";
    }
    public ArrayList<String> GetAllPlayers(){
        ArrayList<String> playerNames = new ArrayList<String>();
        for(Player player : PlayerList){
            playerNames.add("From Country "+CountryName+" Played "+player.GetName());
        }
        return playerNames;
    }
    public void AddPlayer(Player player){
        PlayerList.add(player);
    }

}
