/**
 * Subaruクラスは、Carクラスを拡張し、CarInterfaceを実装します。
 */
public class Subaru extends Car implements CarInterface{

    // メーカー名を格納するための変数
    private String maker;

    public Subaru(String modelName, String details) {
        // 親クラスのコンストラクタを呼び出し
        super(modelName, details);
        // メーカー名を設定
        this.maker="スバル";
    }

    //車両情報を表示するメソッド。
    @Override
    public void displayCar() {
        // メーカー名と車両情報を出力
        System.out.println(this.maker+"車両情報");
        System.out.println("モデル名:"+this.getModelName());
        System.out.println("詳細:"+this.getDetails());
    }
}
