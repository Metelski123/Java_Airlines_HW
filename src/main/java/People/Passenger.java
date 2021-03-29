package People;

public class Passenger extends Person {

    private int bags;

    public Passenger(String name, int bags){
        super(name);
        this.bags = bags;
    }

    public int getPassengerBagCount(){
        return this.bags;
    }
}