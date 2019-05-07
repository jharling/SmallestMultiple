package com.company;

public class Main {

    public static void main(String[] args) {
				/*
				Starting with 2520 because the problem gives me it as the lowest number divisible
				by 1-10. So I know 1-20 must be higher.
				*/
				Long num = 2520L;
				System.out.println(smallestMultiple(num));
    }

    private static Long smallestMultiple (Long num) {
        boolean flag = false;
        while (!flag) {
            if (num % 19 == 0) {
                if (num % 18 == 0) {
                    if (num % 17 == 0) {
                        if (num % 16 == 0) {
                            if (num % 14 == 0) {
                                if (num % 13 == 0) {
                                    if (num % 11 == 0) {
                                        if (num % 9 == 0) {
                                            if (num % 8 == 0) {
                                                if (num % 7 == 0) {
                                                    if (num % 3 == 0) {
                                                        flag = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!flag) {
                num += 20;
            }
        }
        return num;
    }

}
