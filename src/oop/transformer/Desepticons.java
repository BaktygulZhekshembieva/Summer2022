package oop.transformer;

public class Desepticons extends Transformer{

    public Desepticons(Gun leftGun, Gun rightGun, int health) {
        super(leftGun, rightGun, health);
    }

    public Desepticons(int km) {
        super(km);
    }

    public void fire(Autobots autobots) {
        super.fire();
        autobots.health -= 10;
    }
}
