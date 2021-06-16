import java.util.Scanner;

public class soNgTo100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ban muon bat dau tu so nao");
        int count = 0;
        int number;
        number = scanner.nextInt();
//        khong su dung vong for duoc vi bieu thuc khoi tao for can 3 tham chieu neu muon dung for thi them 2 dai cham phay
        while (number<100) {
            boolean check = true;
            for (int n = 2; n < number; n++) {
                if (number % n == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " ");
                count++;
            }
            number++;
        }
    }
}