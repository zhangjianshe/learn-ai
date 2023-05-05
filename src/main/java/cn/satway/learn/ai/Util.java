package cn.satway.learn.ai;

import java.util.Random;

public class Util {
    static Random random ;
    static {
         random=new Random(69);
    }

    /**
     * random number generator min~max
     * @param min
     * @param max
     * @return
     */
    public static float rand(float min,float max){
       return random.nextFloat()*(max-min)+min;
    }
}
