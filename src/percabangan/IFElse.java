package percabangan;

public class IFElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if (uangDiDompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi ya jajannya");
        }else if(uangDiDompet>totalBelanja) {
            double angsul = uangDiDompet - totalBelanja;
            System.out.println("Uanng cukup, angsul : " + angsul);
        }else{
            System.out.println("Uang pas ya...Eheeee");
        }
    }
}
