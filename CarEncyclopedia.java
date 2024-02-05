import java.nio.charset.Charset;
import java.util.Scanner;

public class CarEncyclopedia{
    private Scanner sc=new Scanner(System.in,Charset.forName("Shift-JIS"));
    String input;

    public void displayMitsubishiCars(){
        Mitsubishi mitsubishiCar=null;
        input=sc.nextLine();
        switch (input) {
            case "evo1"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション", " 初代ランサーエボリューションが登場したのは1992年。\nコンパクトセダンのランサーに、上級車種であるギャランのターボエンジンと4WDシステムをねじ込み登場。\n当初は2500台限定だったが、反響がすさまじく最終的には7600台を販売するに至った。");
            case "evo2"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション II", "ランサーエボリューションⅡになり、外観こそ大きな変化はありませんでしたが、\n最高出力は10PSアップの260PSになり、サスペンション各部の見直しやホイールベースの延長、機械式リアLSDの採用など\n確実にポテンシャルアップを果たしている。");
            case "evo3"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション III", "1995年にはランサーエボリューションⅢへと進化。基本ボディは共通ながらエアロパーツを全てデザインし直し\nハイスピードラリーに対応を果たし、1996年には当時のワークスドライバーのトミ・マキネンがWRCでドライバーズタイトルを獲得しました。");
            case "evo4"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション IV", "ここでベースとなったランサーセダンがフルモデルチェンジを果たし、ランサーエボリューションも第2世代へと突入。\nエンジンは当時の自主規制値いっぱいとなる280PSを発生し、リアデフには現在まで採用され続けているAYC（アクティブ・ヨー・コントロールシステム）が初搭載されました。");
            case "evo5"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション V", "従来の5ナンバーサイズから、ついに3ナンバーサイズへとサイズアップし、17インチタイヤの採用やブレーキの容量アップを実現。\nサイズアップをしながらもアルミ製部品などを多用し、動力性能やボディ剛性をアップさせながら軽量化も果たしている。");
            case "evo6"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション VI", "ランエボⅥでは、空気抵抗や冷却性能の改善を目的として、ナンバープレートの位置を中央から左側に移動し、よりアグレッシブな外観へと変貌。\n2000年には当時のワークスドライバー、トミ・マキネンの4年連続ドライバーズチャンピオン獲得を記念し、特別仕様車の「トミ・マキネンエディション」を発売。\n通称「ランエボ6.5」と呼ばれ、現在でも高い人気を誇る。");
            case "evo7"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション VII", "2000年のランサーのフルモデルチェンジに伴い、2001年に登場したランエボⅦは3世代目のボディを手に入れた。\n外観こそ若干大人しめになったものの、新たに搭載されたACD（アクティブ・センター・デファレンシャルシステム）などにより、ポテンシャルは確実にアップしている。");
            case "evo8"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション VIII", "8代目となるランエボⅧでは、従来のAYCを進化させた「スーパーAYC」を搭載し、さらにコーナリング性能をアップ。\nさらにミッションの6速化（一部グレードには5速も有）も果たした。\nまた、翌年には「MR（Mitsubishi Racing）」を冠した改良型が発売された。");
            case "evo9"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション IX", "第3世代の最後となったランエボⅨは、エンジンに可変バルブタイミング機構である「MIVEC」を初採用。\n初代から搭載され続けていた4G63エンジンも熟成を重ね、最大トルクは40.8kgf・mを誇る。\n翌2006年には、先代に引き続き「MR」が登場。第3世代を締めくくった。");
            case "evo10"->mitsubishiCar=new Mitsubishi("三菱ランサーエボリューション X", "第4世代かつ、最後のランサーエボリューションとなったランエボⅩは、従来の4G63エンジンから新たに4B11エンジンへと変更となり、最終型はついに300PSを発生するに至りました。\n組み合わされるミッションも従来の3ペダルMTに加え、2ペダルMTの「ツインクラッチSST」を採用。さらに幅広いユーザーが楽しめるようになった。");
            default->System.out.println("無効な入力です");
        }

        mitsubishiCar.displayCar();
    }

    public void displaySubaruCars(){
        Subaru subaruCars=null;
        input=sc.nextLine();

        switch (input) {
            case "wrxs4"->subaruCars=new Subaru("WRX S4", "スバルWRX S4");
            case "wrxsti"->subaruCars=new Subaru("WRX STI", "スバルWRX STI");
            default->System.out.println("無効な入力です");
        }

        subaruCars.displayCar();
    }

    // 三菱の車両情報を表示するメソッド

}
