import java.util.Scanner;
import java.util.InputMismatchException;

public class Zikko {

public static void main(String[] args) {
    CarEncyclopedia encyclopedia = new CarEncyclopedia();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        try {
            System.out.println("");
            System.out.println("1. 三菱車両を閲覧");
            System.out.println("2. スバル車両を閲覧");
            System.out.println("3. 終了");
            System.out.print("選択してください: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("車種を選択してください:");

            switch (choice) {
                case 1:
                    encyclopedia.displayMitsubishiCars();
                    break;
                case 2:
                    encyclopedia.displaySubaruCars();
                    break;
                case 3:
                    System.out.println("終了します。");
                    scanner.close();
                    return;
                default:
                    System.out.println("無効な選択です。再度選択してください。");
            }
        } catch (InputMismatchException e) {
            System.out.print("数値を入力してください。");
            scanner.nextLine(); // 不正な入力をクリアするために次の行を読み捨てる
        }
    }
}
}
