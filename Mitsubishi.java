//三菱自動車の車両情報を表示するためのクラス
public class Mitsubishi extends Car implements CarInterface{
    // 車両のメーカー名
    private String maker;

    public Mitsubishi(String modelName, String details) {
        // 親クラスのコンストラクタを呼び出し
        super(modelName, details);
        // メーカー名を設定
        this.maker="三菱";
    }

    
    //車両情報を表示するメソッド
    @Override
    public void displayCar() {
        //メーカー名と車両情報を出力
        System.out.println(this.maker+"車両情報");
        System.out.println("モデル名:"+this.getModelName());
        System.out.println("詳細:"+this.getDetails());
    }
}
