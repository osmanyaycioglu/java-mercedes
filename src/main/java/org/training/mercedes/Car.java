package org.training.mercedes;

public class Car implements ICar {

    protected String name;
    private int horsePower;

    public Car(){
    }

    public Car(String name,
               int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }

    public void forward(){
        System.out.println("ileri gidiyorum");
    }

    @Override
    public String turn(int degree) {
        return degree+ " derece döndüm";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0){
            System.out.println("Horsepower 0 dan küçük olamaz");
            horsePower = 0;
        } else {
            this.horsePower = horsePower;
        }
    }
}
