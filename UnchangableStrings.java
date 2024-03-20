package main;

public class UnchangableStrings {
    public static void main(String[] args) {
        var email = " SupporT@hexlet.io\n";


        email = email.trim();
        email = email.toLowerCase();
        System.out.println(email);

    }
}
