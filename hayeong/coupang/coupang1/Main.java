package coupang.coupang1;

import java.util.*;

public class Main {
    public static void main(String s, int[] idx) {
        int[] answer = new int[idx.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                queue.offerFirst(i);
            } else if(s.charAt(i) == '}') {
                Integer pair = queue.pop();
                map.put(pair, i);
                map.put(i, pair);
            }
        }

        for(int i = 0; i < idx.length; i++) {
            answer[i] = map.get(idx[i]);
        }
    }
}
