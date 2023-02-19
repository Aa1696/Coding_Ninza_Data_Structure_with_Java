package Abstract_Concept;

public abstract class Vehicle implements Vehicle_Interface {
    private String color;
    int max_speed;
//    public Vehicle(){
//        color="red";
//        System.out.println("Vehicle is having the un-parameterised constructor");
//        max_speed=60;
//    }
    public Vehicle(int data){
        this.max_speed=data;
        System.out.println("Vehicle is having parameterised constructor");
        this.color="red";
    }
    public String getColor(){
        return this.color;
    }
    public  void setColor(String str){
        this.color=str;
    }
    public void print(){
        System.out.println("Color of the Vehicle:"+this.color+","+"Max speed of Vehicle:"+this.max_speed);

    }
}
