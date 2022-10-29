package oop.interface1;

public class HarryPotter extends Book{

    public HarryPotter(String name, String autor, int pages) {
        super(name, autor, pages);
    }

    @Override
    public String published() {
        return "<<PUBLISHED>>";
    }

    @Override
    public String print() {
        return null;
    }

    @Override
    public String read() {
        return null;
    }
}
