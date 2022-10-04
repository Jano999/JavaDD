package sk.jano.objects;

import sk.jano.utils.Utils;

public class Mage extends Hero {
    private Weapon weapon;
    public Mage(int life, int strenght, int speed) {
        super(life, strenght, speed);
        this.weapon = new Staff(50,80);
    }

    public void attack (Hero hero){
        int weaponHit = Utils.calculateHit(weapon.getStrenght(),weapon.getCritical());
        super.attack(hero, weaponHit);
    }
}
