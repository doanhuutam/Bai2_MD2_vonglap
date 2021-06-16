import java.util.Scanner;

public class btHienThiAnh {
    public static void main(String[] args) {
        int choice = 8;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("menu");
            System.out.println("1.hinh chu nhat");
            System.out.println("2.hinh vuong");
            System.out.println("3.hinh chu nhat");
            System.out.println("0.exit");
            System.out.println("enter choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("hinh tam giac");
                    for ( int i=0;i<5;i++){
                        for (int j=0;j<9;j++){
                            System.out.print("*");
                        }
                        System.out.println("*");
                        break;
                    }
            }

        }
    }
}