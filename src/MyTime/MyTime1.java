package MyTime;

import jdk.dynalink.beans.StaticClass;

public class MyTime1 {
    public int timer; // attributes
    public int minutter;

    public MyTime1(int timer, int minutter) { //Constructor
        this.timer = timer;
        this.minutter = minutter;


    };

    public String timeAsString() { // metode
        return this.timer + ":" + this.minutter;



    }
}



