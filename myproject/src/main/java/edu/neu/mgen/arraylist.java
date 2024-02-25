package edu.neu.mgen;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<String>();
        city.add("Austin");
        city.add("Houston");
        city.add("Oakland");
        city.add("Paris");
        city.add("San Francisco");
        city.add("Seattle");
        System.out.println("Arraylist City items intial");
        for (String i : city) {
            System.out.println(i);
        }
        System.out.println("Arraylist City items intial");
        city.remove(3); // removed paris from list
        System.out.println("Arraylist City items Final"); 
        for (String i : city) {
            System.out.println(i);
        }
    }
}
