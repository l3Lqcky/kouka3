import java.util.Scanner;
import java.util.InputMismatchException;

//メインプログラムを実行するためのクラス
public class Zikko {

public static void main(String[] args) {
    //CarEncyclopediaのインスタンスを生成
    CarEncyclopedia encyclopedia = new CarEncyclopedia();
    //ユーザーからの入力を受け取るScannerオブジェクトを生成
    Scanner scanner = new Scanner(System.in);

     //メニューを表示し、ユーザーの選択に応じて処理を繰り返す
    while (true) {
        try {
            System.out.println("");
            System.out.println("1. 三菱車両を閲覧");
            System.out.println("2. スバル車両を閲覧");
            System.out.println("3. 終了");
            System.out.print("選択してください: ");
            //ユーザーの選択を読み取る
            int choice = scanner.nextInt();
            scanner.nextLine(); //改行を読み取る

            switch (choice) {
                case 1:
                    //三菱車両を表示
                    encyclopedia.displayMitsubishiCars();
                    break;
                case 2:
                    //スバル車両を表示
                    encyclopedia.displaySubaruCars();
                    break;
                case 3:
                    // 終了
                    System.out.println("終了します。");
                    //Scannerを閉じる
                    scanner.close();
                    return;
                default:
                //1,2,3以外の選択をした場合の出力
                    System.out.println("無効な選択です。再度選択してください。");
            }
        } catch (InputMismatchException e) {
            //入力が数値でない場合の例外処理
            System.out.print("数値を入力してください。");
            scanner.nextLine(); // 不正な入力をクリアするために次の行を読み捨てる
        }
    }
}
}
