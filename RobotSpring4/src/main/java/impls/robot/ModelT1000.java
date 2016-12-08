package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

/**
 * Created by User on 30.11.2016...
 */
public class ModelT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    public String color;
    public int year;
    public boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnabled) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println(color);
        System.out.println(year);
        System.out.println(soundEnabled);
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {

        return head;
    }

    public Hand getHand() {
        return hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public String getColor() {

        return color;
    }

    public int getYear() {
        return year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }
}
