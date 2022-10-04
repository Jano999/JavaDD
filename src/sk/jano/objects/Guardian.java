package sk.jano.objects;

import sk.jano.utils.Utils;

public class Guardian extends Hero {
    private Weapon weapon;
    public Guardian(int life, int strenght, int speed) {
        super(life, strenght, speed);
        this.weapon = new Sword(150,30);
    }

    public void attack (Hero hero){
        int weaponHit = Utils.calculateHit(weapon.getStrenght(),weapon.getCritical());
        super.attack(hero, weaponHit);
    }
}
