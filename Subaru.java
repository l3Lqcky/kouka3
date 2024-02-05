public class Subaru extends Car implements CarInterface{

    private String maker;

    public Subaru(String modelName, String details) {
        super(modelName, details);
        this.maker="スバル";

    }

    @Override
    public void displayCar() {
        System.out.println(this.maker+"車両情報");
        System.out.println("モデル名:"+this.getModelName());
        System.out.println("詳細:"+this.getDetails());
    }
}