package sk.jano.utils;

public class Utils {
    public static int calculateHit(int strenght, int critical){
        int hit = strenght +(critical/100 * strenght);
        return hit;
    }
}
