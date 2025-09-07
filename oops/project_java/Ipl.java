public class Ipl {
    public static void main(String[] args) {
        Country india = new Country("India");
        Country australia = new Country("Australia");

        Batsman virat = new Batsman("Virat Kohli", 90, 12000);
        Batsman smith = new Batsman("Steve Smith", 70, 8000);
        Batsman rohit = new Batsman("Rohit Sharma", 85, 9500);
        Bowler bumrah = new Bowler("Jasprit Bumrah", 80, 120);
        AllRounder hardik= new AllRounder("Hardik Pandya", 70, 1000, 60);
        india.AddPlayer(virat);
        australia.AddPlayer(smith);
        india.AddPlayer(rohit);
        india.AddPlayer(bumrah);
        india.AddPlayer(hardik);
        System.out.println(virat.GetName() + " is a " + virat.GetPlayerType() + " from " + india.GetCountryOfPlayer(virat.GetName()) + " has an average of " + virat.GetAverage());
        System.out.println(smith.GetName() + " is a " + smith.GetPlayerType() + " from " + australia.GetCountryOfPlayer(smith.GetName()) + " has an average of " + smith.GetAverage());
        System.out.println(rohit.GetName() + " is a " + rohit.GetPlayerType() + " from " + india.GetCountryOfPlayer(rohit.GetName()) + " has an average of " + rohit.GetAverage());
        System.out.println(bumrah.GetName() + " is a " + bumrah.GetPlayerType() + " from " + india.GetCountryOfPlayer(bumrah.GetName()) + " has a Bowling average of " + bumrah.GetBowlingAverage());
        System.out.println(hardik.GetName() + " is a " + hardik.GetPlayerType() + " from " + india.GetCountryOfPlayer(hardik.GetName()) + " has an average of " + hardik.GetAverage() + " and a Bowling average of " + hardik.GetBowlingAverage());
        Player sandy=new Batsman("Sandy",10,1000);
        Player gudduPlayer=new Bowler("Guddu",20,50);
        india.AddPlayer(sandy);
        india.AddPlayer(gudduPlayer);
        System.out.println(sandy.GetName() + " is a " + sandy.GetPlayerType() + " from " + india.GetCountryOfPlayer(sandy.GetName()) + " has an average of " + sandy.GetAverage());
        System.out.println(gudduPlayer.GetName() + " is a " + gudduPlayer.GetPlayerType() + " from " + india.GetCountryOfPlayer(gudduPlayer.GetName()) + " has a Bowling average of " + gudduPlayer.GetBowlingAverage());
        Thread t1 = new Thread(rohit);
        Thread t2 = new Thread(bumrah);
        t1.start();
        t2.start();
        // india.GetAllPlayers().forEach(System.out::println);
        // australia.GetAllPlayers().forEach(System.out::println);
    }
}
