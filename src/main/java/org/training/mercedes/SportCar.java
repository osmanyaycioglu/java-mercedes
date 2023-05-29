package org.training.mercedes;

public class SportCar extends Car {
    private int topSpeed;

    public void fastForward(){
        System.out.println("çok hızlı ileri gidiyorum");
    }

    @Override
    public void forward() {
        System.out.println("Sport Car ileri gidiyor");
        super.forward();
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
