package learnprogrammingacademy.learning;






            class StringUtils{

            public static boolean  startsWithUppercase(String value) {
                return !(value == null || value.isEmpty()) && Character.isUpperCase(value.charAt(0));
            }
        }









    public class Demo {








     public static void main(String[] args) {

        String myString = "Java";

         System.out.println("toLowercase = " + myString.toLowerCase());

         System.out.println("startsWithUpper =" + StringUtils.startsWithUppercase(myString));
         System.out.println("startsWithUpper =" + StringUtils.startsWithUppercase(null));
         System.out.println("startsWithUpper =" + StringUtils.startsWithUppercase(""));
         System.out.println("startsWithUpper =" + StringUtils.startsWithUppercase("java"));


     }



    }