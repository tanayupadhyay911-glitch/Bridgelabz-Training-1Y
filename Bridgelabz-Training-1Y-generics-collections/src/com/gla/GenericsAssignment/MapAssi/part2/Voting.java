package com.gla.GenericsAssignment.MapAssi.part2;

import java.util.*;

public class Voting {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] voteList = {
                "A", "B", "A", "C", "A",
                "B", "C", "A", "B", "A"
        };

        for (String v : voteList) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        System.out.println(votes);

        String winner = Collections.max(
                votes.entrySet(),
                Map.Entry.comparingByValue()
        ).getKey();

        System.out.println("Winner: " + winner);
    }
}
