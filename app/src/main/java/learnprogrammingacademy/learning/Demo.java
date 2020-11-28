package learnprogrammingacademy.learning;

import java.sql.SQLOutput;

    public class Demo {




     static String[] pets= {"sparrow","parrot","crow"};
     static int [] [] table = {

             {1,2,3},
             {4,5,6,11},
             {7,8,9}
     };


     public static void main(String[] args) {


            for(int i = 0; i<pets.length;i++)
            {
                //1st iteration i = 0
                //2nd iteration i = 1
                //3rd iteration i = 2
                //4th iteration i=3 , 3<3, loop false
                System.out.println("pet[" + i + "]= " + pets[i]);

            }

                for(String pet : pets){

                    System.out.println("pet= " + pet);


                }
                    
    }
}