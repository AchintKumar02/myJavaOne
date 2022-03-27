class Dim{
    double length;
    double breadth;
    double height;

    double volume(){
    return length * breadth * height;
    }
    void setDim(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }
}
public class WithDim{
    public static void main (String args[]){
        Dim box1 = new Dim();
        Dim box2 = new Dim ();

        box1.setDim(10, 20, 15);
        box2.setDim(3, 6, 9);

        System.out.println(box1.volume());
        System.out.println(box2.volume());

    }
}
 