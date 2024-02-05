public class Mitsubishi extends Car implements CarInterface{
    private String maker;

    public Mitsubishi(String modelName, String details) {
        super(modelName, details);
        this.maker="三菱";
    }

    @Override
    public void displayCar() {
        System.out.println(this.maker+"車両情報");
        System.out.println("モデル名:"+this.getModelName());
        System.out.println("詳細:"+this.getDetails());
    }
}
