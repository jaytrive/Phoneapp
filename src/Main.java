public class Main {
    public static void main(String[] args) {
        Deskphone d1=new Deskphone("123457");
        //Deskphone d2=new Deskphone("6789")
        d1.incomingcall("12345");
        if(d1.isringing()==true) d1.answer();
        else System.out.print("no incoming call");
;    }
}