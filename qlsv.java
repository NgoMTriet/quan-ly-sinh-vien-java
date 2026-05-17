package Lab2;
import java.util.Scanner;
public class qlsv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] Ho_ten = new String[n];
        double[] Diem = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Sinh vien "+ (i+1)+" : ");
            System.out.print("Ho ten: ");
            Ho_ten[i] = sc.nextLine();
            System.out.println("Diem: ");
            Diem[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1-i; j++) {

                if (Diem[j] > Diem[j+1]) {
                    double tempdiem = Diem[j];
                    Diem[j] = Diem[j+1];
                    Diem[j+1] = tempdiem;

                    String tempten = Ho_ten[j];
                    Ho_ten[j] = Ho_ten[j+1];
                    Ho_ten[j+1] = tempten;
                }
            }
        }
        System.out.println("Danh sach sinh vien: ");
        for(int i = 0; i < 0; i++){
            System.out.print("Ho ten: "+ Ho_ten[i] + " | Diem: "+ Diem[i] + " | Hoc luc:"+ xepLoai(Diem[i]));                       
        }
    }
    public static String xepLoai(double Diem){
        if(Diem< 5){
            return "Yeu";
        }else if(Diem < 6.5){
            return "Trung binh";
        }else if(Diem < 8){
            return "Kha";
        }else{
            return "Gioi";
        }
    }
}
