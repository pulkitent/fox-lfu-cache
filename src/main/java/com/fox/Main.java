package com.fox;

import com.fox.cache.LFUCache;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        /*

        Input:
        ["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
        [[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]

        Output:
        [null, null, null, 1, null, -1, 3, null, -1, 3, 4]

         */

        LFUCache lfuCache = new LFUCache(2); // Initiates cache with capacity [2]
        lfuCache.put(1, 1);// Put [1,1]
        lfuCache.put(2, 2);// Put [2,2]
        out.println(lfuCache.get(1));// Get [1] -> output as 1
        lfuCache.put(3, 3);// Put [3,3]
        out.println(lfuCache.get(2));// Get [2] -> output as -1
        out.println(lfuCache.get(3));// Get [3] -> output as 3
        lfuCache.put(4, 4);// Put [4,4]
        out.println(lfuCache.get(1));// Get [1] -> output as -1
        out.println(lfuCache.get(3));// Get [3] -> output as 3
        out.println(lfuCache.get(4));// Get [4] -> output as 4

    }
}
