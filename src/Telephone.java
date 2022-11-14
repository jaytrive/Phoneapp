public interface Telephone {
    public void makecall(String number);
    public void incomingcall(String number);
    public void answer();
    public  boolean isringing();
    public boolean poweron();
    public void rejectcall();
}
