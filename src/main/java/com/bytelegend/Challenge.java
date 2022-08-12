package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int... i) {
        return Arrays.stream(i).sum();
    }

    public static String add(String... str) {
        return Arrays.stream(str)
                .reduce("", (s1, s2) -> s1 + s2);
    }
}
