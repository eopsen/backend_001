package com.company;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //SearchAlgoritm(); // pkt. 3

        ShowTime();//pkt. 5
    }

    private static void ShowTime() {
        LocalTime localTIme = LocalTime.now();
        System.out.println("Local time :" + localTIme);

        Instant globalTime = Instant.now();
        System.out.println("Global time :" + globalTime);
    }

    private static void SearchAlgoritm()
    {
        int[] array = {4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };
        int index = SearchIndex(array, 11); // we want to find index for 11

        System.out.println(index);
    }

    private static int SearchIndex(int[] array, int value)
    {
        int index = 0;
        int limit = array.length - 1;

        while (index <= limit)
        {
            int point = (int)Math.ceil((index + limit) / 2);
            int entry = array[point];
            if (value > entry) {
                index = point + 1;
                continue;
            }
            if (value < entry) {
                limit = point - 1;
                continue;
            }
            return point; // value == entry
        }

        return -1;
    }

    private static void CRC32()
    {
//        int[] CRC_TABLE = new int[256];

//        for (int i = 0; i < 256; ++i) {
//            int code = i;
//            for (int j = 0; j < 8; ++j) {
//                code = (code & 0x01 ? 0xEDB88320 ^ (code >>> 1) : (code >>> 1));
//            }
//            CRC_TABLE[i] = code;
//        }
    }
}
