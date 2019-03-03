import java.util.*;
public class QuanLiDaySoNguyen {
    public static void main (String[] args){
        DaySo array= new DaySo();
        array.Nhap();
        array.Xuat();
        System.out.println();

        array.Sua();
        System.out.println("Mang sau khi sua: ");
        array.Xuat();
        System.out.println();

        array.Them();
        System.out.println("Mang sau khi them: ");
        array.Xuat();
        System.out.println();

        array.Sort();
        System.out.println("Mang sau khi sap tang: ");
        array.Xuat();
        System.out.println();
        
        array.Average();
        int i=array.PTGanAvg();
        System.out.println("Vi tri phan tu gan bang trung binh nhat: "+ i);
    }
}
