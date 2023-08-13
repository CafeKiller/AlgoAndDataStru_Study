package com.cafe;

public class AlogMain {

    public static void main(String[] args) {

        SnowflakeDistributeId idWorker = new SnowflakeDistributeId(0, 0);
        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
//            System.out.println(Long.toBinaryString(id));
            System.out.println(id);
        }
    }
}
