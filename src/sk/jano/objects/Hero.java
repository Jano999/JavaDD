package sk.jano.objects;

import sk.jano.utils.Utils;

public class Hero {

    private int life;
    private int strenght;
    private  int speed;

    private boolean isAttackable;

    private int defenseCount;

    public Hero(int life, int strenght, int speed) {
        this.life = life;
        this.strenght = strenght;
        this.speed = speed;
        isAttackable = true;
        defenseCount = 0;
    }

    protected void attack(Hero hero, int weaponHit){
        isAttackable = true;
        if (hero.isAttackable){
            int hit = Utils.calculateHit(strenght, speed) + weaponHit);
            hero.setLife(hero.getLife() - hit);
        }

    };
    public boolean  defense(){
        if (defenseCount <= 2){
            isAttackable = false;
            defenseCount++;
            return true;
        }
        return false;
    };

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getSpeed() {
        return speed;
    }
}
