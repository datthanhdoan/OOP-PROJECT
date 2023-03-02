package chuyenxe;

import java.util.Scanner;
import java.time.LocalDateTime;

public class hamchinh {
    public static Scanner vdk = new Scanner(System.in);

    public static void main(String[] args) {
        thongtinchuyenxe a = new thongtinchuyenxe(null, null);
        thongtinkhachhang hai = new thongtinkhachhang();
        thongtinve c = new thongtinve();
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("+--------------------------Bang Gia Dat Ve Xe----------------------+");
        System.out.println("+------------- Ve di Hai Phong -> Ha Noi: 20.000 (A)---------------+");
        System.out.println("+------------- Ve di Hai Phong ->Thanh Hoa: 18.000 (B) -------------+");
        System.out.println("+------------- Ve di Hai Phong -> Tp Ho Chi Minh: 50.000 (C)-------+");
        System.out.println("+------------- Ve di Hai Phong -> Nghe An: 25.000 (D)--------------+");
        System.out.println("+------------- Ve di Ha Noi -> Thanh Hoa: 18.000 (E)---------------+");
        System.out.println("+------------- Ve di Ha Noi -> Tp.Ho Chi Minh: 50.000 (F)----------+");
        System.out.println("+------------- Ve di Ha Noi -> Nghe An: 20.000 (G)-----------------+");
        System.out.println("+------------- Ve di Thanh Hoa -> Tp.Ho Chi Minh: 50.000 (H)-------+");
        System.out.println("+------------- Ve di Thanh Hoa -> Nghe An: 20.000 (I)--------------+");
        System.out.println("+------------- Ve di Nghe An -> Tp.Ho Chi Minh: 40.000 (J)---------+");
        System.out.println();
        char k;
        System.out.print("Nhap ho ten khach hang: ");
        String name = vdk.next();
        hai.setnamekh(name);
        System.out.print("Nhap SDT khach hang: ");
        int lll = vdk.nextInt();
        hai.setSDTkh(lll);
        System.out.print("Nhap Dia Chi khach hang: ");
        String X = vdk.next();
        hai.setDiaChikh(X);
        int n;
        System.out.print("Nhap so luong ve: ");
        n = vdk.nextInt();
        double sum = 0;
        char[] loaiVe = new char[n];
        for (int i = 0; i < n; i++) {
            for (;;) {
                System.out.print("Nhap loai ve: ");
                k = vdk.next().charAt(0);
                c.setgetloaive(k);
                loaiVe[i] = k;
                if (k >= 'A' && k <= 'J') {
                    Double A, B, C, D, E, F, G, H, I, J;
                    if (k == 'A' || k == 'G' || k == 'I') {
                        A = G = I = 20.000;
                        sum += A;
                        System.out.println("Gia ve la: " + A);
                    } else if (k == 'B' || k == 'E') {
                        B = E = 18.000;
                        sum += B;
                        System.out.println("Gia ve la: " + B);
                    } else if (k == 'D') {
                        D = 25.000;
                        sum += D;
                        System.out.println("Gia ve la: " + D);
                    } else if (k == 'C' || k == 'F') {
                        C = F = 18.000;
                        sum += C;
                        System.out.println("Gia ve la: " + C);
                    } else {
                        J = 40.000;
                        sum += J;
                        System.out.print("Gia ve la: " + J);
                    }
                    break;
                } else if (k <= 'A' || k >= 'J') {
                    System.out.print("Vui long nhap lai: ");
                    continue;
                }
            }
        }
        System.out.println(sum);
        System.out.println("Nhap so tien khach dua: ");
        int l = vdk.nextInt();
        c.settienkhachdua(l);
        System.out.println("So tien thua: " + (l - sum));
        System.out.print("Thoi gian khoi hanh: ");
        System.out.println(a.getthoigian());
        System.out.println();
        System.out.println("+-----------------Bien lai-----------------+");
        System.out.println("Ho ten: " + name);
        System.out.println("Dia chi: " + X);
        System.out.println("So Dien Thoai: " + lll);
        System.out.println("Tien khach tra: " + l);
        System.out.println("Tien thua: " + (l - sum));
        System.out.println("So luong ve da dat: " + n);
        System.out.print("Cac loai ve da dat: ");
        for (int i = 0; i < n; i++) {
            System.out.print(loaiVe[i] + " ");
        }
        LocalDateTime now = LocalDateTime.now();
        System.out.println();
        System.out.print("Thoi gian dat ve: " + now);
    }
}
