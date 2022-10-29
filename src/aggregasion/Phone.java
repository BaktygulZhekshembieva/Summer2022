package aggregasion;

public class Phone {

    public int id;
    public String mark;
    public String model;
    private double memory;
    public Battery battery;
    public Headphones headphones;

    public Phone(int id, String mark, String model, double memory) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.memory = memory;
//        composition
        this.battery = new Battery(24); //  Battery battery = new Battery(24);
    }

    public Phone(int id, String mark, String model, double memory, Battery battery, Headphones headphones) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.battery = battery;
        this.headphones = headphones;
    }

    public Phone(int id, String mark, String model, double memory, Battery battery) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.battery = battery;
    }


    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", battery=" + battery +
                ", headphones=" + headphones +
                '}';
    }

}
