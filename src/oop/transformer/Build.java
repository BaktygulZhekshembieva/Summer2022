package oop.transformer;

public class Build {
    public static void main(String[] args) {

//        Gun gun = new Gun();
//        System.out.println(gun.ammo);
//
//        Transformer trans = new Transformer( 10);
//
//        trans.run(20);


        Gun leftGun = new Gun();
        Gun rightGun = new Gun();
        Transformer transformer = new Transformer(leftGun, rightGun);

        System.out.println(transformer.getLeftGun() + " " + transformer.getRightGun());

        Transformer transformer1 = new Autobots(leftGun, rightGun);

        Autobots opt = new Autobots(leftGun, rightGun, 100);
        Desepticons opt1 = new Desepticons(leftGun, rightGun, 100);

        opt.fire();
        opt1.fire();

        System.out.println("A " + opt.health);
//        System.out.println("A " + opt.);
        System.out.println("D " + opt1.health);
        System.out.println("D " + opt1);


    }
}

