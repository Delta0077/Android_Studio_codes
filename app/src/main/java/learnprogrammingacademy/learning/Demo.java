package learnprogrammingacademy.learning;

import java.sql.SQLOutput;

    public class Demo {






    /* static String[] pets= {"sparrow","parrot","crow"};
     static int [] [] table = {

             {1,2,3},
             {4,5,6,11},
             {7,8,9}
     };*/


     public static void main(String[] args) {
        /* int sum=0;
        //my own code for challenge
         for(int i =1; i<101; i++){
             sum+=i;

             System.out.println("Sum = " +sum );

         }*/
         //while
         int number = 1;
         int sum = 0;
         while(number<=100){
             sum+= number;
             number++;
         }
         System.out.println("Sum " + sum);
         //do-while
         number = 1;
         sum = 0;
         do {
             sum+=number;
             number++;
         } while(number<=100);
         System.out.println(" sum = " + sum);


         //for loop
         sum = 0;

         for(int i = 1;i<=100; i++)
            sum+=i;
         {
             System.out.println(" sum " + sum);
         }



             // System.out.println("Enter range" + n);


       /*     for(int i = 0; i<pets.length;i++)
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
                for(int row = 0; row< table.length; row++){
                    for(int column =0; column< table[row].length; column++)

                        System.out.println("number = " + table[row][column]);

                }*/
    }
}