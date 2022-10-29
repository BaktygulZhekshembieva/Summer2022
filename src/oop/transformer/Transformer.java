package oop.transformer;

public class Transformer {

    private int km;
    private int ammo;
    private Gun leftGun;
    private Gun rightGun;

    int health;


    public Transformer(Gun leftGun, Gun rightGun, int health) {
        this.leftGun = leftGun;
        this.rightGun = rightGun;
        this.health = health;
    }

    public Transformer(Gun leftGun, Gun rightGun) {
        leftGun = new Gun();
        rightGun = new Gun();
        this.leftGun = leftGun;
        this.rightGun = rightGun;
    }



    public void fire() {
        this.ammo--;
    }
    public Transformer(int km) {
        this.km = km;
    }

    public void run(int km) {
        System.out.println(this.km += km);
    }


//    public void reload() {
//        Gun.reload();
//    }

    @Override
    public String toString() {
        return "Transformer{" +
                "leftGun=" + leftGun +
                ", rightGun=" + rightGun +
                '}';
    }
    public Gun getLeftGun() {
        return leftGun;
    }
    public Gun getRightGun() {
        return rightGun;
    }

    public int getKm() {
        return km;
    }
}

