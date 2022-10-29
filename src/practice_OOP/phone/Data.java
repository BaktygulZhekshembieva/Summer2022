package practice_OOP.phone;

public class Data {

    public Data(){

    }

    private String data;

    public Data(String data) {
        this.data = data;
    }

    public boolean chekData(String data){
        return this.data.equals(data);
    }

    public String getData() {
        return data;
    }
}