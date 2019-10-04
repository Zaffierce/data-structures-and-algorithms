package code401challenges.utilities;

import java.util.Arrays;

public class MultiBracketValidation {

    public static boolean multiBrackedValidation(String str) {
        String[] splitInto;
        int j = 0;
        int counter = 0;
        boolean flaggy = false;

        splitInto = str.split("");
        System.out.println(splitInto.length);
        String[] filtered = new String[6];


        for (int i = 0; i < splitInto.length; i++) {
            if(splitInto[i].equals("{") || splitInto[i].equals("}") ||
                    splitInto[i].equals("(") || splitInto[i].equals(")") ||
                    splitInto[i].equals("[") || splitInto[i].equals("]")) {
                filtered[j] = splitInto[i];
                j++;
                counter++;
//                filtered[0 + counter];
            }
//            System.out.println(filtered[i]);
        }
        System.out.println(Arrays.toString(filtered));
        int i = 0;
        while (counter > 0) {
            System.out.println(filtered[i]);
//            i++;
            if (filtered[i].equals(filtered[counter-1])) {
                i++;
                counter--;
                flaggy = true;
            }
            counter--;
//            return flaggy;
//            System.out.println("counter is " + counter + " and i is " + i);
            }
//        System.out.println(flaggy);
        return flaggy;
    }

    public static void main (String[] args) {
        multiBrackedValidation("{([hello])}");
    }

}
