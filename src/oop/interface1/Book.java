package oop.interface1;

abstract public class Book implements Printable, Readable{

    public String name;
    private String autor;
    private int pages;
    private boolean isAudioBook;


    public Book(String name, String autor, int pages) {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
    }

    public String getAutor() {
        return autor;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAudioBook() {
        return isAudioBook;
    }

    public void setAudioBook(boolean audioBook) {
        isAudioBook = audioBook;
    }

    public String listening(){
        if (isAudioBook == true){
            return "<<LISTENING>>";
        }else {
            return null;
        }
    }

    abstract public String published();

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", pages=" + pages +
                '}';
    }
}
