package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
    Scanner sc = new Scanner(System.in);
    final ArrayList<StockIns> insList = new ArrayList<>();

    void listOfStocks(){
        StockIns tataPower = new StockIns("TATAPOWER",1000,220);
        insList.add(tataPower);
        StockIns tataMotors = new StockIns("TATAMOTORS",1000,220);
        insList.add(tataMotors);
        StockIns tataChem = new StockIns("TATACHEM",1000,220);
        insList.add(tataChem);
        StockIns suzlon = new StockIns("SUZLON",1000,220);
        insList.add(suzlon);
        StockIns adaniPower = new StockIns("ADANIPOWER",1000,220);
        insList.add(adaniPower);
        StockIns rPower = new StockIns("RPOWER",1000,220);
        insList.add(rPower);
        StockIns rCom = new StockIns("RCOM",1000,220);
        insList.add(rCom);
        StockIns mahindra = new StockIns("MAHINDRA",1000,220);
        insList.add(mahindra);
        StockIns powerGrid = new StockIns("POWERGRID",1000,220);
        insList.add(powerGrid);
        StockIns bhel = new StockIns("BHEL",1000,220);
        insList.add(bhel);
        StockIns zomato = new StockIns("ZOMATO",1000,220);
        insList.add(zomato);
        StockIns renuka = new StockIns("RENUKA",1000,220);
        insList.add(renuka);

    }
    void buy() {
        System.out.println("enter stock name ");
        String sName = sc.next();
        System.out.println("enter number of shares to buy");
        int nShares = sc.nextInt();
        System.out.println("enter price at what value to buy");
        int shPrice = sc.nextInt();
        for (StockIns stockAccount:insList) {
            if (stockAccount.getStockName().equals(sName)){
                int value =  0;
                value = nShares * shPrice;
                System.out.println("total amount to buy number of share " + nShares + " at share price " + shPrice + " is " + value);
            }
        }
    }
//    void sell(){
//        System.out.println("enter stock name ");
//        String sName = sc.next();
//        System.out.println("enter number of shares to buy");
//        int numShares = sc.nextInt();
//        System.out.println("enter price at what value to sell");
//        int sharePrice = sc.nextInt();
//        for (StockIns stockIns : insList) {
//            if (stockIns.equals(sName)){
//                int value = 0;
//                value = numShares * sharePrice;
//                System.out.println(" total amount to sell number of share " + numShares + " at share price " + sharePrice + " is " + value);
//                for (Stock stock : list){
//                    int add = numShares - stock.getNumShares();
//                    if(value<balanceAmount){
//                        System.out.println("press Y to confirm");
//                        String a = sc.next();
//                        if (a == "Y"){
//                            System.out.println("total number of shares in your account is "+add);
//                        }
//                    }
//                    else {
//                        System.out.println("you don't enough amount to sell number of shares");
//                    }
//
//                }
//            }
//
//        }
//    }
}