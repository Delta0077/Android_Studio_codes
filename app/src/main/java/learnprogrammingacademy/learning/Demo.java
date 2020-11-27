package learnprogrammingacademy.learning;

import java.sql.SQLOutput;

public class Demo {
    static int lives=3;
   // static int score;// 0 by default
    static int coinCount = 90;
    //static boolean gameOver; // false by default

   /* static int itemCount = 24;
    static int itemsPerPage = 5;*/


    public static void main(String[] args) {

        while (lives > 0) {
            System.out.println("lives " + lives);
            lives--;
        }
        lives=3; //resetting lives to 3 do-while executes 3 times/if we don't reset lives the do-while loop will execute once as per order of previous while loop:)

        do{
            System.out.println("lives " + lives);
            coinCount+=20;
            lives--;
        } while (lives > 0);

        System.out.println("coins " + coinCount + " lives " + lives);

       /* score+= 10;
        coinCount = 110; // re-initialising
       // lives = 0;

        if(lives== 0)
        {
            gameOver= true;
        }
        if(coinCount>100)
        {
            System.out.println("gold medal");
        }
        else if(coinCount> 80){
            System.out.println("silver medal");
        }
        else if(coinCount> 70){
            System.out.println("bronze medal");
        }
        else{
            System.out.println("no medal");
        }
        if(gameOver){
            System.out.println("score " + score);
        }
        else{
            System.out.println("lives " + lives);
        }
        if(!gameOver){
            System.out.println("game is not over");
        }

      /*  System.out.println("score " + score);

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
        System.out.println("coint count " + coinCount);

        coinCount%=100;
        System.out.println("Coin count " + coinCount);

        //calculating remaining items
        int remainingItems = itemCount % itemsPerPage;
        System.out.println("Remaining items " + remainingItems);*/
    }
}