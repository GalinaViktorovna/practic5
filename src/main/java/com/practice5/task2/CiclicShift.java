package com.practice5.task2;

public class CiclicShift {
    public static int findCyclicShift(String before, String after) {
        for (int index = before.length() - 1; index >= 0; index--) {
            if ((before.substring(index) + before.substring(0, index)).equals(after)) {
                return before.length() - index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findCyclicShift("macbook", "bookmac"));
    }
}
