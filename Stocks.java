import java.sql.SQLOutput;
import java.util.ArrayList;

class portfolio_stocks{
    String Sname;
    int Snum;
    double Sprice;

    double STotalPrice;
    int STotalCount;

    public void setPortfolio(String Sname, int Snum, int Sprice){
        this.Sname = Sname;
        this.Snum = Snum;
        this.Sprice = Sprice;
        STotalPrice += (this.Sprice * this.Snum);
        STotalCount += this.Snum;
    }


    @Override
    public String toString(){

        System.out.println("The Share Name is : " +Sname);
        System.out.println("The Share Count is : " +Snum);
        System.out.println("The each Share Price is : " +Sprice);
        System.out.println("The Total Share Price is : Rs"+(Sprice* Snum));
        return "";
    }

    public void Print(){
        System.out.println("The Total Number of Share is : " +STotalPrice);
        System.out.println("The Total Number of Share Count is : " +STotalCount);
    }

}
public class Stocks {
        ArrayList<portfolio_stocks> arr;
        portfolio_stocks ps = new portfolio_stocks();
    Stocks(){
        arr = new ArrayList<>();

    }

    public void add1(String Sname, int Snum, int Sprice){
        ps.setPortfolio(Sname,Snum,Sprice);
        arr.add(ps);
        System.out.println(ps);
        ps.Print();

    }

    public static void main(String args[]){

        Stocks S = new Stocks();
        S.add1("Tata_Power",10,200);
        S.add1("Tata_Steel",25,400);
        S.add1("Tata_Consultancy_Service",40,300);
        S.add1("Tata_Motors",100,100);

    }

}
