public class Main {
    public static void main(String[] args) {
        int number = 497;
        int sum=0;

        for(int i = 1; i<number ;i++)
        {
            if(number % i ==0)
            {
                sum=sum+i;

            }
        }

        if(sum==number){

            System.out.println("Sayı mükemmel sayıdır");
        }
        else{
            System.out.println("Sayı mükemmel sayı değildir");
        }




    }
}