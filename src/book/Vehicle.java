package book;

public class Vehicle{
    double speed;
    int power;
    void speedUp(int s){
        if(this.speed+s>200){
            System.out.println("速度不能超过200");
        }
        else{this.speed=this.speed=s;}
    }
    void speedDown(int d)
    {if (this.speed-d<0){System.out.println("速度不能小于0");}
    else{this.speed=this.speed-d;}
    }
    void setPower(int p){
        power=p;
    }int getPower(){
        return power;
    }double getSpeed() {
        return speed;
    }void brake(){
        this.speed=0;}
}
