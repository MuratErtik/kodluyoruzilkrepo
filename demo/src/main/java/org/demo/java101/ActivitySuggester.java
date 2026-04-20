package org.demo.java101;

public class ActivitySuggester {
    public static void main(String[] args) {
        int temperature = 20;

        if (temperature < 5) {
            System.out.println("Recommend: Skiing");
        } else if (temperature <= 15) {
            System.out.println("Recommend: Cinema");
        } else if (temperature <= 25) {
            System.out.println("Recommend: Picnic");
        } else {
            System.out.println("Recommend: Swimming");
        }
    }
}
