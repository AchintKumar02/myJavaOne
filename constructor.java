class Box{
    double length, breadth, height;
    
    double volume(){
        return length * breadth * height;
    }
    Box(){
        length = 10;
        breadth = 20;
        height = 15;
    }   
}
public class Constructor{
    public static void main(String args []){
        Box box1 = new Box();
        Box box2 = new Box();
        System.out.println(box1.volume());
        System.out.println(box2.volume());

    }
}