public class Main {
    public static void main(String[] args) {

        int number = 35 ;
        boolean isPrime = true;

      /*  for  (int i=2;i<number;i++)
        {
            if (number % i ==0)
            {
                System.out.println("Sayı asal değildir");

            }
        } */

        if(number==1){
            System.out.println("Sayı asal değildir");
        }
        if(number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2;i<number;i++) {
            if (number % i ==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("Sayı asaldır");

        }
        else{
            System.out.println("Sayı asal değildir");

        }


    }
}