package main;

public class ChainsMethod {
    public static void main(String[] args) {
        var name = "hexlet";

        var name1 = name.substring(0, 1).toUpperCase();
        var name2 = name.substring(1).toLowerCase();

        System.out.println(name1 + name2);

    }
}
