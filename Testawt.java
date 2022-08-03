import java.awt.*;
import java.awt.event.*;

public class Testawt extends Frame
{
    public Testawt()
    {
        Button btn=new Button("Achint kumar");
        add(btn); 		
        setSize(400, 500);        
        setTitle("welcome to the party");   
        setLayout(new FlowLayout());	
        setVisible(true);        
    }

    public static void main (String[] args)
    {
        Testawt ta = new Testawt();    
    }
}