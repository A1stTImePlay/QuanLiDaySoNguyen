import java.util.*;

public class DaySo {
    private int SoLuong;
    private int[] Mang;
    private int TrungBinh=0;

    public void Nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong cua mang: ");
        this.SoLuong = input.nextInt();
        Mang = new int[SoLuong];
        System.out.println("Nhap mang: ");
        for (int i = 0; i < this.SoLuong; i++) {
            Mang[i] = input.nextInt();
        }
    }

    public void Xuat() {
        System.out.println("Mang da nhap: ");
        for (int i = 0; i < this.SoLuong; i++) {
            System.out.print(Mang[i]);
        }
    }

    public void Sua() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vi tri so can sua: ");
        int ViTri = input.nextInt();
        System.out.println("Nhap gia tri moi: ");
        this.Mang[ViTri] = input.nextInt();
    }

    public void Xoa() {

    }

    public void Them() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so them moi: ");
        int SoThem = input.nextInt();
        this.SoLuong += SoThem;

    }

    public void Sort() {
        Arrays.sort(this.Mang);
    }

    public void Average(){
        for (int i=0;i<this.SoLuong;i++)
            this.TrungBinh+=this.Mang[i];
        this.TrungBinh=this.TrungBinh/this.SoLuong;
    }

    public int PTGanAvg(){
        int min=Math.abs(this.Mang[0]-this.TrungBinh);
        for (int i=1;i<this.SoLuong;i++){
            int tam = Math.abs(this.Mang[i]-this.TrungBinh);
            if (tam<min) min=tam;
        }
        return min;
    }
}

