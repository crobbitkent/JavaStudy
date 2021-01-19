package org.common;

import java.util.Scanner;

public abstract class BaseUI {
    private Scanner scanner;



    public BaseUI(Scanner scanner) {
        this.scanner = scanner;
    }

    protected void print(Object msg) {
        System.out.println(msg);
    }

    protected String inputStr(Object msg) {
        System.out.println(msg);

        return scanner.nextLine();
    }

    protected int inputInt(Object msg) {

        return Integer.parseInt(inputStr(msg));
    }

    protected double inputDouble(Object msg) {

        return Double.parseDouble(inputStr(msg));
    }

    public abstract void show()throws Exception;

}
