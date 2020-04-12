package percabangan;

public class IFElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang tidak mencukupi setelah Lockdown, Dirumahaja");
        }else{
            System.out.println("Uang mencukupi, anda selamat bisa belanja");
        }
    }
}
