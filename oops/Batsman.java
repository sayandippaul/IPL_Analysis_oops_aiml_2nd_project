public class Batsman{
    public static void main(String[] args){
        Batsmandetails b1=new Batsmandetails("Virat Kohli",10000);
        System.out.println(b1.getdetails());
    }
}
 class Batsmandetails{
    private String batsman;
    private int total_runs;
    public Batsmandetails(String batsman,int total_runs){
        this.batsman=batsman;
        this.total_runs=total_runs;
    }
    public String getdetails(){
        return "this great batsman "+batsman+" has scored "+total_runs+" runs.";
    }
};
