import java.util.Random;
import java.util.Scanner;

class BAITAPLON {
    public static Scanner vdk = new Scanner(System.in);
    private String name;
    private Character giave;
    private int sotienkhachdua;
    private int sotientralaikhach;
    private String masoghe;

    public BAITAPLON() {

    }

    public BAITAPLON(String name, Character giave, int sotienkhachdua, int sotientralaikhach, String masoghe) {
        this.name = name;
        this.giave = giave;
        this.sotienkhachdua = sotienkhachdua;
        this.sotientralaikhach = sotientralaikhach;
    };

    public void hienthi() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("+------------------Bang Gia Dat Ve Xe------------------+");
        System.out.println("+------------ Ve cho nguoi lon (A): 12000 -------------+");
        System.out.println("+--------------- Ve cho tre nho (B): 8000 -------------+");
        System.out.println("+------------------------------------------------------+");
        System.out.println();
    }

    public void nhap() {
        System.out.print("Nhap ho va ten khach hang:");
        name = vdk.next();
        System.out.print("Lua chon loai ve (A hoac B): ");
        giave = vdk.next().charAt(0);
        for (;;) {
            if (giave == 'A' || giave == 'B') {
                break;
            }
            System.out.print("Nhap lai: ");
            giave = vdk.next().charAt(0);
            if (giave == 'A' || giave == 'B') {
                break;
            }
        }
        if (giave == 'A') {
            giave = 12000;
        } else if (giave == 'B') {
            giave = 8000;
        }
        System.out.print("Nhap so tien: ");
        sotienkhachdua = vdk.nextInt();
        sotientralaikhach = sotienkhachdua - giave;
        System.out.println("So tien thua la: " + sotientralaikhach);
    };

    public static void main(String[] args) {
        int n;
        BAITAPLON sv;
        sv = new BAITAPLON();
        System.out.print("Nhap so luong ve can dat: ");
        n = vdk.nextInt();
        sv.hienthi();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin khach hang thu: " + (i + 1));
            sv.nhap();
        }
    }

}