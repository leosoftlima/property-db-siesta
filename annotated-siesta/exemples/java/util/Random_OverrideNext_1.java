package mop;

import java.util.Random;

public class Random_OverrideNext_1 extends Random {

    /**
     * Warns if a Random subclass does not override next(int).
     *
     * A subclass of Random should override next(int), according to the
     * documentation.
     * http://docs.oracle.com/javase/6/docs/api/java/util/Random.html#next%28int%29
     *
     * @severity warning
     */
    public Random_OverrideNext_1() {
        if (!getClass().equals(Random_OverrideNext_1.class) && !hasNextMethodOverridden()) {
            System.out.println("Warning: Random subclass should override next(int).");
        }
    }

    private boolean hasNextMethodOverridden() {
        try {
            getClass().getDeclaredMethod("next", int.class);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Random_OverrideNext_1 random = new Random_OverrideNext_1();
        // Your code here to use the random instance if needed
    }
}


