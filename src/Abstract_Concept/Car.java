package Abstract_Concept;

public class Car extends Vehicle implements Car_Interface {
    private String Color;
    int max_speed;
    Car(int data){
        super(data);
        this.max_speed=data;
        System.out.println("Car class is having Parameterised Constructot");
    }

    @Override
    public boolean isMotorised() {
        return true;
    }

    @Override
    public void setColor(String color) {
        this.Color = color;
    }

    @Override
    public String getColor() {
        return Color;
    }
    @Override
    public void print() {
        System.out.println("Color of the Vehicle:"+this.Color+","+"Max speed of Vehicle:"+this.max_speed);
    }
}
