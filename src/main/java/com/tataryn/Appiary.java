package com.tataryn;

public class Appiary {
    public static void main(String[] args) {
        Hive Hive1 = new Hive(1, 12, "Karpatka");
        Hive Hive2 = new Hive(2, 8, "Karnica");
        Hive Hive3 = new Hive(3, 6, "Bacfast");
        System.out.println("Total number of hives are " + Hive.kilkist);
        Hive1.futureCountOFHoney();
        Hive2.futureCountOFHoney();
        Hive3.futureCountOFHoney();


    }
}
