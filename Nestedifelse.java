public class Nestedifelse {
    public static void main(String[] args) {
        int age = 30;
        int salary = 25000;
        if (age >= 21) {
            if (salary >= 20000) {
                System.out.println("loan is approved");
            } else {
                System.out.println("loan is not approved");
            }
        }else{
                System.out.println("Your Age is Low");

            }
        }
    }
