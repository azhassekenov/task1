package javatest;

import java.util.Scanner;

public class Task1 {

    public static String summa(String a, String b)
    {
        String pattern = "^0+(?!$)";
        a= a.replaceAll(pattern, "");
        b= b.replaceAll(pattern, "");

        if (a.length() < b.length()){
            String c = a;
            a = b;
            b = c;
        }

        String summa = "";

        int aLength = a.length();
        int bLength = b.length();
        int raznica = aLength-bLength;

        int kaldyk = 0;
        for (int i=aLength-1; i>=0; i--)
        {
            int charA = (int) a.charAt(i);
            int numericValueA = Character.getNumericValue(charA);
            if(i>=raznica) {
                int charB = (int) b.charAt(i - raznica);
                int numericValueB = Character.getNumericValue(charB);
                int sum = (numericValueA + numericValueB + kaldyk);
                int toSumma = sum%10;
                kaldyk = sum/10;
                summa = summa + toSumma;
            }
        }

        for (int i=aLength-bLength-1; i>=0; i--)
        {
            int charA = (int) a.charAt(i);
            int numericValueA = Character.getNumericValue(charA);
            int sum = (numericValueA +  kaldyk);
            int toSumma = sum%10;
            kaldyk = sum/10;
            summa = summa + toSumma;
        }

        if(kaldyk>0){
            summa = summa + kaldyk;
        }

        StringBuffer finalSumma = new StringBuffer(summa);
        finalSumma.reverse();
        return finalSumma.toString();
    }

}
