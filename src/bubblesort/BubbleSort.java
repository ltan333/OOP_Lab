/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author AnLee
 */
public class BubbleSort {

    public int[] numArr;
    private int inputNum;

    public BubbleSort() {

    }

    Scanner scan = new Scanner(System.in);

    public int getInputNum() {
        return inputNum;
    }

    public boolean setInputNum(int inputNum) {
        if (inputNum > 1) {
            this.inputNum = inputNum;
            return true;
        } else {
            return false;
        }
    }

    public void run() {
        System.out.print("Enter number of array: ");
        if (!this.setInputNum(scan.nextInt())) {
            scan.nextLine();
            System.out.println("Number of array must be greater than 1!");
            run();
        } else {
            numArr = new int[this.inputNum];
            System.out.print("Unsorted Array: [ ");
            for (int i = 0; i < this.inputNum; i++) {
                numArr[i] = (int) Math.floor(Math.random() * 50);
                System.out.print(numArr[i] + " ");
            }
            System.out.println("]");
            selection();
        }
    }

    public void bubble() {
        System.out.print("Sorted Array: [ ");
        for (int i = 0; i < this.inputNum; i++) {
            for (int j = 0; j < this.inputNum - i - 1; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int tg = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tg;
                }
            }
        }
        for (int element : numArr) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    public void selection() {
        for (int i = 0; i < this.inputNum; i++) {
            for (int j = i + 1; j < this.inputNum; j++) {
                if (numArr[i] > numArr[j]) {
                    int tg = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tg;
                }
            }
        }
        System.out.print("Sorted Array: [ ");
        for (int element : numArr) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
