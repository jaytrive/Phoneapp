public class Deskphone implements  Telephone {
    String phonenumber;
    boolean ringing;

    public Deskphone(String phonenumber) {
        this.phonenumber = phonenumber;
        this.ringing=false;
    }

    @Override
    public void makecall(String number) {
        System.out.println("Calling"+ number);
    }

    @Override
    public void incomingcall(String number) {
        if(number==phonenumber) {
            ringing=true;
            System.out.println("incoming call");
        }
        else System.out.println("wrong number");
        //System.out.println("Recieved a call");
    }

    @Override
    public void answer() {
        System.out.println("phone is answered");
        ringing=false;
    }

    @Override
    public boolean isringing() {
        if(ringing==true)
        System.out.println("Phone is ringing");
        return ringing;
    }

    @Override
    public boolean poweron() {
        System.out.println("always on");
        return true;
    }

    @Override
    public void rejectcall() {
        System.out.println("rejected a call");
        ringing=false;
    }
}
