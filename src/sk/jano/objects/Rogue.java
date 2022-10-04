package sk.jano.objects;

import sk.jano.utils.Utils;

public class Rogue extends Hero{
    private Weapon weapon;
    public Rogue(int life, int strenght, int speed) {
        super(life, strenght, speed);
        this.weapon = new Dagger(30,150);
    }

    public void attack (Hero hero){
        int weaponHit = Utils.calculateHit(weapon.getStrenght(),weapon.getCritical());
        super.attack(hero, weaponHit);
    }
}
