package oop.transformer;

public class Autobots extends Transformer{

    public Autobots(Gun leftGun, Gun rightGun, int health) {
        super(leftGun, rightGun, health);
    }

    public Autobots(Gun leftGun, Gun rightGun) {
        super(leftGun, rightGun);
    }

    public Autobots(int km) {
        super(km);
    }


    public void fire(Desepticons desepticons) {
        super.fire();
        desepticons.health -= 10;
    }
}
