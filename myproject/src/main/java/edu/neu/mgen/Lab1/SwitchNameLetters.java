package edu.neu.mgen.Lab1;
import java.util.ArrayList;

public class SwitchNameLetters {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Koti");
        names.add("Vaishnavi");
        names.add("Varshetha");
        names.add("Irfan");
        names.add("Baddam");

        ArrayList<String> switchedNames = switchFirstLastLetters(names);

        // Print original names
        System.out.print("Names = { ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        // Print switched names
        System.out.print("Names (switched) = { ");
        for (int i = 0; i < switchedNames.size(); i++) {
            System.out.print(switchedNames.get(i));
            if (i < switchedNames.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static ArrayList<String> switchFirstLastLetters(ArrayList<String> names) {
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            char firstChar = Character.toUpperCase(name.charAt(name.length() - 1));
            char lastChar = Character.toLowerCase(name.charAt(0));
            StringBuilder switchedName = new StringBuilder(name.substring(1, name.length() - 1));
            switchedName.insert(0, firstChar);
            switchedName.append(lastChar);
            switchedNames.add(switchedName.toString());
        }
        return switchedNames;
    }
}
