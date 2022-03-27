class Box {
    double height;
    double width;
    double depth;

    void volume(){
        System.out.print("volume is ");
        System.out.println(height * width * depth);
    }
}
public class BoxDemo2{
    public static void main (String args[]){
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.height = 10;
        myBox1.width = 20;
        myBox1.depth = 15;

        myBox2.height = 3;
        myBox2.width = 6;
        myBox2.depth = 9;
        
        myBox1.volume();
        myBox2.volume();
    }
}