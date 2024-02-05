import java.util.Scanner;

public class Car {
    //車両のモデル名
    private String modelName;
    //車両の詳細情報
    private String details;
    //入力を受け取るScannerオブジェクト
    public Scanner scanner;

    //Carクラスのコンストラクタ 
    public Car(String modelName, String details) {
        this.modelName = modelName;
        this.details = details;
    }
    
    //車両のモデル名を取得
    public String getModelName() {
        return modelName;
    }

    //車両の詳細情報を取得
    public String getDetails() {
        return details;
    }
}

