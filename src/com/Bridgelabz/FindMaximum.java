package com.Bridgelabz;
 //Refactor to create Generic class to take in three variables of generic type

public class FindMaximum<E extends Comparable<E>> {

        E firstValue;
        E secondValue;
        E thirdValue;

        public FindMaximum(E firstValue, E secondValue, E thirdValue) {
            this.firstValue = firstValue;
            this.secondValue = secondValue;
            this.thirdValue = thirdValue;
        }

        public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
            E max = firstValue;
            if (secondValue.compareTo(max) > 0)
                max = secondValue;
            if (thirdValue.compareTo(max) > 0)
                max = thirdValue;
            return max;
        }

        public <E extends Comparable<E>> E getMax() {
            E max = (E) getMax(firstValue, secondValue, thirdValue);
            return max;
        }

        public static void main(String[] args) {
            System.out.println("Maximum Value Of Integer:");
            System.out.println(new FindMaximum(40, 10, 90).getMax());
            System.out.println("Maximum Value Of Flot:");
            System.out.println(new FindMaximum(1.2f, 4.2f, 5.6f).getMax());
            System.out.println("Maximum Value Of String:");
            System.out.println(new FindMaximum("apple", "banana", "peach").getMax());
        }
    }






