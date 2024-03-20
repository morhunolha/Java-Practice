package main;

public class Smile {
    public static void main(String[] args) {
        var emoji = "-(";

        emoji = ":".concat(emoji);
        emoji = emoji.replace("(",")");
        System.out.println(emoji);
    }
}
