package oop.transformer;

public class Gun {

    int ammo;

    public Gun() {
        this.reload();
    }

    public void reload() {
         this.ammo = 30;
    }

    public void fire() {
        this.ammo--;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "ammo=" + ammo +
                '}';
    }

}
