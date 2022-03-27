class Box{
    double height;
    double width;
    double depth;
}
class Mybox{
    public static void main(String args[]);{
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        //assining values to box 1 instance variable
        myBox1.height = 12;
        myBox1.width = 22;
        myBox1.depth = 21;
        //assining values to box 2 instance variables
        myBox2.height = 3;
        myBox2.width = 6;
        myBox2.depth = 8;
        vol = myBox1.height * myBox1.width * myBox1.depth;
        System.out.println("volume of 1st box is:"+vol);
        double vol1;
        vol1 = myBox2.height * myBox2.width * myBox2.depth;
        System.out.println("volume of second box is:"+vol1);

    }
}