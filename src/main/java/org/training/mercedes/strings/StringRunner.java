package org.training.mercedes.strings;

public class StringRunner {
    public static void main(String[] args) {
        String s1 = " osman ";
        String s2 = s1 + " yay";
        String s3 = s2.concat(" test");
        System.out.println(s3);
        String s4 = s1 + " " + s2 + " --- " + s3;
        for (int i = 0; i < 100; i++) {
            s4 += " - " + i;
        }
        StringBuilder sb1 = new StringBuilder(100);
        sb1.append("osman")
           .append(10)
           .append("yay")
           .append(s1);
        for (int i = 0; i < 100; i++) {
            sb1.append(i);
        }
        String str5 = sb1.toString();
        System.out.println(str5);
        String s5 = s1.toUpperCase();
        String trim = s1.trim();
        String s6 = s1.substring(2);
        String s7 = "ping %ip% -t";
        String replace = s7.replace("%ip%",
                                    s1);
        char[] chars = replace.toCharArray();
        // UTF-16 UTF-8
        // osmanü UTF-16 -> 12byte
        // osmanü UTF-8 -> 7byte
        String str = new String("mehmet");
        System.out.println(str);
        if (str == "mehmet") {
            System.out.println("Mehmete eşit");
        }

        if (str.equals( "mehmet")) {
            System.out.println("Mehmet equals eşit");
        }

    }
}
