import java.util.*;

public class Enumerat {

    public static void main(String[] args) {

        Enumeration seasons;

        Vector v = new Vector < > ();

        v.add("Winter");

        v.add("Spring");

        v.add("Rainy");

        seasons = v.elements();

        v.add("Summer");

        while (seasons.hasMoreElements()) {

            System.out.print(seasons.nextElement() + ", ");

        }

    }

}