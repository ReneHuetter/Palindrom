
import java.util.*;

public class Palindrom {

    static int[] pali = {1,2,3,3,2,1};

    public static void main(String[] args) {
        boolean istpalindrom = istpalindrom();
        System.out.println("ist ein Palindrom: "+ istpalindrom);
    }

    public static boolean istpalindrom() {
        if (pali.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i <= pali.length / 2; i++) {
            int left = pali[i];
            int reht = pali[pali.length - 1 - i];
            if (left != reht) {
                return false;
            }
        }
        return true;
    }
}
