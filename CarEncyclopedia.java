import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarEncyclopedia implements Interface{
    private Map<String, Car> mitsubishiCars;
    private Map<String, Car> subaruCars;
    private Scanner scanner;

    public CarEncyclopedia() {
        mitsubishiCars = new HashMap<>();
        subaruCars = new HashMap<>();
        scanner = new Scanner(System.in);

        // 三菱の車両情報を追加
        mitsubishiCars.put("evo1", new Mitsubishi("三菱ランサーエボリューション", " 初代ランサーエボリューションが登場したのは1992年。\nコンパクトセダンのランサーに、上級車種であるギャランのターボエンジンと4WDシステムをねじ込み登場。\n当初は2500台限定だったが、反響がすさまじく最終的には7600台を販売するに至った。"));
        mitsubishiCars.put("evo2", new Mitsubishi("三菱ランサーエボリューション II", "ランサーエボリューションⅡになり、外観こそ大きな変化はありませんでしたが、\n最高出力は10PSアップの260PSになり、サスペンション各部の見直しやホイールベースの延長、機械式リアLSDの採用など\n確実にポテンシャルアップを果たしている。"));
        mitsubishiCars.put("evo3", new Mitsubishi("三菱ランサーエボリューション III", "1995年にはランサーエボリューションⅢへと進化。基本ボディは共通ながらエアロパーツを全てデザインし直し\nハイスピードラリーに対応を果たし、1996年には当時のワークスドライバーのトミ・マキネンがWRCでドライバーズタイトルを獲得しました。"));
        mitsubishiCars.put("evo4", new Mitsubishi("三菱ランサーエボリューション IV", "ここでベースとなったランサーセダンがフルモデルチェンジを果たし、ランサーエボリューションも第2世代へと突入。\nエンジンは当時の自主規制値いっぱいとなる280PSを発生し、リアデフには現在まで採用され続けているAYC（アクティブ・ヨー・コントロールシステム）が初搭載されました。"));
        mitsubishiCars.put("evo5", new Mitsubishi("三菱ランサーエボリューション V", "従来の5ナンバーサイズから、ついに3ナンバーサイズへとサイズアップし、17インチタイヤの採用やブレーキの容量アップを実現。\nサイズアップをしながらもアルミ製部品などを多用し、動力性能やボディ剛性をアップさせながら軽量化も果たしている。"));
        mitsubishiCars.put("evo6", new Mitsubishi("三菱ランサーエボリューション VI", "ランエボⅥでは、空気抵抗や冷却性能の改善を目的として、ナンバープレートの位置を中央から左側に移動し、よりアグレッシブな外観へと変貌。\n2000年には当時のワークスドライバー、トミ・マキネンの4年連続ドライバーズチャンピオン獲得を記念し、特別仕様車の「トミ・マキネンエディション」を発売。\n通称「ランエボ6.5」と呼ばれ、現在でも高い人気を誇る。"));
        mitsubishiCars.put("evo7", new Mitsubishi("三菱ランサーエボリューション VII", "2000年のランサーのフルモデルチェンジに伴い、2001年に登場したランエボⅦは3世代目のボディを手に入れた。\n外観こそ若干大人しめになったものの、新たに搭載されたACD（アクティブ・センター・デファレンシャルシステム）などにより、ポテンシャルは確実にアップしている。"));
        mitsubishiCars.put("evo8", new Mitsubishi("三菱ランサーエボリューション VIII", "8代目となるランエボⅧでは、従来のAYCを進化させた「スーパーAYC」を搭載し、さらにコーナリング性能をアップ。\nさらにミッションの6速化（一部グレードには5速も有）も果たした。\nまた、翌年には「MR（Mitsubishi Racing）」を冠した改良型が発売された。"));
        mitsubishiCars.put("evo9", new Mitsubishi("三菱ランサーエボリューション IX", "第3世代の最後となったランエボⅨは、エンジンに可変バルブタイミング機構である「MIVEC」を初採用。\n初代から搭載され続けていた4G63エンジンも熟成を重ね、最大トルクは40.8kgf・mを誇る。\n翌2006年には、先代に引き続き「MR」が登場。第3世代を締めくくった。"));
        mitsubishiCars.put("evo10", new Mitsubishi("三菱ランサーエボリューション X", "第4世代かつ、最後のランサーエボリューションとなったランエボⅩは、従来の4G63エンジンから新たに4B11エンジンへと変更となり、最終型はついに300PSを発生するに至りました。\n組み合わされるミッションも従来の3ペダルMTに加え、2ペダルMTの「ツインクラッチSST」を採用。さらに幅広いユーザーが楽しめるようになった。"));

        // スバルの車両情報を追加
        subaruCars.put("wrxs4", new Subaru("WRX S4", "スバルWRX S4"));
        subaruCars.put("wrxsti", new Subaru("WRX STI", "スバルWRX STI"));
    }

    // 三菱の車両情報を表示するメソッド
    @Override
    public void displayMitsubishiCars() {
        System.out.println("三菱車両情報:");
        for (String key : mitsubishiCars.keySet()) {
            System.out.println(key + ": " + mitsubishiCars.get(key).getModelName());
        }
        System.out.print("車種を選択してください:");
        String selection = scanner.nextLine();
        if (mitsubishiCars.containsKey(selection)) {
            Car car = mitsubishiCars.get(selection);
            System.out.println("モデル名: " + car.getModelName());
            System.out.println("詳細: " + car.getDetails());
            
        } else {
            System.out.println("無効な選択です。");
        }
    }

    // スバルの車両情報を表示するメソッド
    @Override
    public void displaySubaruCars() {
        System.out.println("スバル車両情報:");
        for (String key : subaruCars.keySet()) {
            System.out.println(key + ": " + subaruCars.get(key).getModelName());
        }
        System.out.println("車種を選択してください:");
        String selection = scanner.nextLine();
        if (subaruCars.containsKey(selection)) {
            Car car = subaruCars.get(selection);
            System.out.println("モデル名: " + car.getModelName());
            System.out.println("詳細: " + car.getDetails());
        } else {
            System.out.println("無効な選択です。");
        }
    }
}
