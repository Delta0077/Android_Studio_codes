package learnprogrammingacademy.learning;

import java.sql.SQLOutput;

public class Demo {
    static int lives=3;
    static int score;// 0 by default
    static int coinCount = 90;

    public static void main(String[] args) {

        System.out.println("score " + score);

        score+= 10;
        System.out.println("Score " + score + " lives " + lives);
        //lives-=1;
        lives--;

        System.out.println("score " + score + " lives " + lives);

        score*=2;
        System.out.println("score " + score + " lives " + lives);
        score/=2;
        System.out.println("score " + score + " lives " + lives);
        coinCount+=40;
//        System.out.println("coint count " + coinCount);
    }
}