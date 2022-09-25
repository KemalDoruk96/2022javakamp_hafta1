public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak=10;
        boolean isOk = false;

        for (int sayibul:sayilar) {

            if(sayibul==aranacak){
                isOk=true;
            }


        }

        if(isOk){
            System.out.println("Sayı bulundu");
        }
        else{
            System.out.println("Sayı bulunamadı");
        }


    }
}