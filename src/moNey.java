import java.util.Scanner;

public class moNey {
    public static void main(String[] args) {
        double money =1.0;
        int month=1;
        double tyLe=1.0;
        Scanner input =new Scanner(System.in);
        System.out.println("nhap so tien ban muon vay");
        money=input.nextDouble();
        System.out.println("ban vay trong bao lau");
        month=input.nextInt();
        System.out.println("ty le lai suoat la bao nhieu");
        double sotienla=1.0;
        for (int i=0;i<month;i++){
            sotienla += money*(tyLe/100)/12*month;
        }
        System.out.println("so tien lai la" +sotienla);

    }
}
