public class Main {
    public static void main(String[] args) {

        // en buyuk sayıyı bulma
        int sayi1 = 32;
        int sayi2 = 33;
        int sayi3 = 34;
        if(sayi1>sayi2){
            if(sayi1>sayi3){
                System.out.println("En buyuk sayı" + sayi1);
            }
        }
        if(sayi2>sayi1) {
            if(sayi2>sayi3){
                System.out.println("En buyuk sayı"+sayi2);
            }
        }
        if(sayi3>sayi2){
            if(sayi3>sayi1){
                System.out.println("En buyuk sayı" + sayi3 );
            }
        }

        //videodaki çözüm
        int enBuyuk=sayi1;
        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3)
        {
            enBuyuk=sayi3;
        }
        System.out.println("En buyuk sayı=" + enBuyuk );
    }

}