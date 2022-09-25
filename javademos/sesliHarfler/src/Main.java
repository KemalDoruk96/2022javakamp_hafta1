public class Main {
    public static void main(String[] args) {
        char harf = 'O';
         /* BENİM YAPTIĞIM ŞEKİL

        char[] kalınsesliHarfler = new char[4];
         kalınsesliHarfler[0] ='A';
         kalınsesliHarfler[1] ='I';
         kalınsesliHarfler[2]='O';
         kalınsesliHarfler[3]='U';

        char[] incesesliHarfler = new char[4];
        incesesliHarfler[0] ='E';
        incesesliHarfler[1] ='İ';
        incesesliHarfler[2]='Ö';
        incesesliHarfler[3]='Ü';

         boolean isOk=true;

         for(char harfkontrol:kalınsesliHarfler)
         {
             if (harfkontrol==harf)
             {
                     isOk=true;
             }
         }

         for(char harfkontrol2:incesesliHarfler)
         {
             if(harfkontrol2==harf)
             {
                isOk=false;
             }

         }

         if(isOk){

             System.out.println("Kalın sesli harftir");
         }
         else{

             System.out.println("İnce seslidir");
         }

         */

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harftir");



        }


    }
}