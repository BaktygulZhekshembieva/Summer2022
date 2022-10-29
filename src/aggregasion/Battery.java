package aggregasion;

public class Battery {

    public int timeForUsing;

    public Battery(int timeForUsing) {
        this.timeForUsing = timeForUsing;
    }

    public String charging(){
        return "<<<CHARG>>>";
    }

    @Override
    public String toString() {
        return "Battery{" +
                "timeForUsing=" + timeForUsing +
                '}';
    }
}
