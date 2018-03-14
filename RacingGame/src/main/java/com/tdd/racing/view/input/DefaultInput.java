package com.tdd.racing.view.input;

import java.util.Scanner;

public class DefaultInput {
    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
