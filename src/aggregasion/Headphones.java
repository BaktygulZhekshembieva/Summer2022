package aggregasion;

public class Headphones {

    public String first;
    public String second;

    public Headphones(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}
