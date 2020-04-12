package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs     : \"Terimakasih yo pak\"");
                System.out.println("Dosen   : \"Selamat ya Yayah !!\"");
                break;
            case 'B':
                System.out.println("Mhs     :\"kenapa nilai ulun kada A pak?\"");
                System.out.println("Dosen   :\"Sadar diri yaaa !!\"");
                break;
            case 'C':
                System.out.println("Mhs     :\"Absen full pak ai, tugas jua\"");
                System.out.println("Dosen   :\"Tapi nyata lah bujur nilai UTS UAS ikm 100\"");
                System.out.println("Mhs     :\"kada jua pang. he apang ngalih banar\"");
                break;
            default:
                System.out.println("Mhs     :\"tapi ulun semelam dapat point kuis\"");
                System.out.println("Dosen   :\"bujur juakah\"");
                System.out.println("Dosen   :\"memeriksa berkas\"");
                System.out.println("Dosen   :\"ikam handak mendustai aku kah\"");
                System.out.println("Mhs     :\"mohon maaf lahir batin pak, udah mauu lebaran,,Hee\"");
                break;
        }
    }
}
