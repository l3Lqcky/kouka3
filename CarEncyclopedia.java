// CarEncyclopedia.java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CarEncyclopedia {
    private Map<String, Car> mitsubishiCars;
    private Map<String, Car> subaruCars;

    public CarEncyclopedia() {
        mitsubishiCars = new HashMap<>();
        subaruCars = new HashMap<>();

        // 三菱の車両情報を追加
        mitsubishiCars.put("evo8", new Mitsubishi("Evo 8", "三菱ランサーエボリューション VIII"));
        mitsubishiCars.put("evo9", new Mitsubishi("Evo 9", "三菱ランサーエボリューション IX"));
        mitsubishiCars.put("evo10", new Mitsubishi("Evo 10", "三菱ランサーエボリューション X"));

            // スバルの車両情報を追加
        // subaruCars.put("wrxs4", new Subaru("WRX S4", "スバルWRX S4"));
        // subaruCars.put("wrxsti", new Subaru("WRX STI", "スバルWRX STI"));
    }

    // 三菱の車両情報を表示するメソッド
    public void displayMitsubishiCars() {
        System.out.println("三菱車両情報:");
        for (Car car : mitsubishiCars.values()) {
            System.out.println("モデル名: " + car.getModelName());
            System.out.println("詳細: " + car.getDetails());
            System.out.println();
        }
    }

    // スバルの車両情報を表示するメソッド
    public void displaySubaruCars() {
        System.out.println("スバル車両情報:");
        for (Car car : subaruCars.values()) {
            System.out.println("モデル名: " + car.getModelName());
            System.out.println("詳細: " + car.getDetails());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CarEncyclopedia encyclopedia = new CarEncyclopedia();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. 三菱車両を閲覧");
                System.out.println("2. スバル車両を閲覧");
                System.out.println("3. 終了");
                System.out.print("選択してください: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

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
                System.out.println("数値を入力してください。");
                scanner.nextLine(); // 不正な入力をクリアするために次の行を読み捨てる
            }
        }
    }
}
