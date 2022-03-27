class Box {
    double length;
    double bth;
    double height;

    Box(double i, double j, double k){
        this.length = i;
        this.bth = j;
        this.height = k;
    }
    double volume(){
        return length * bth * height;
    }
}
public class ConstWithPara{
    public static void main (String args[]){
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(3, 6, 9);

        System.out.println(box1.volume());
        System.out.println(box2.volume());
    }
}