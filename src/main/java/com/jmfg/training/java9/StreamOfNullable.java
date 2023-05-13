package com.jmfg.training.java9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamOfNullable {

    public static void main(String[] args) {
        nullInStream();
        filter();
        flatMap();
        flatMapOfNullable();
    }

    public static void nullInStream() {

        List<String> teams = List.of("Bayern Munich", "Atalanta", "InterMilan",
                "Napoli", "Manchester United");

        Map<String, Integer> teamGoalsMap = getTopFiveStatistics();
        List<Integer> allGoals =
                teams.stream()
                        .map(teamGoalsMap::get)
                        .toList();
        System.out.println("Goals Scored :" + allGoals);

    }


    public static void filter() {

        List<String> teams = List.of("Bayern Munich", "Atalanta", "InterMilan",
                "Napoli", "Manchester United");

        Map<String, Integer> teamGoalsMap = getTopFiveStatistics();
        List<Integer> allGoals =
                teams.stream()
                        .map(teamGoalsMap::get)
                        .filter(Objects::nonNull)
                        .toList();
        System.out.println("Goals Scored filter:" + allGoals);
    }

    public static void flatMap() {

        List<String> teams = List.of("Bayern Munich", "Atalanta", "InterMilan",
                "Napoli", "Manchester United");

        Map<String, Integer> teamGoalsMap = getTopFiveStatistics();

        List<Integer> allGoals =
                teams.stream()
                        .flatMap(team -> {
                            Integer goals = teamGoalsMap.get(team);
                            return goals != null ? Stream.of(goals) : Stream.empty();
                        })
                        .toList();
        System.out.println("Goals Scored flatMap:" + allGoals);
    }

    public static void flatMapOfNullable() {

        List<String> teams = List.of("Bayern Munich", "Atalanta", "InterMilan",
                "Napoli", "Manchester United");
        Map<String, Integer> teamGoalsMap = getTopFiveStatistics();

        List<Integer> allGoals =
                teams.stream()
                        .flatMap(team -> Stream.ofNullable(teamGoalsMap.get(team)))
                        .toList();
        System.out.println("Goals Scored flatMap + ofNullable:" + allGoals);
    }


    private static Map<String, Integer> getTopFiveStatistics() {
        final Map<String, Integer> teamGoals = new HashMap<>();
        teamGoals.put("Bayern Munich", 99);
        teamGoals.put("Atalanta", 90);
        teamGoals.put("InterMilan", 89);
        teamGoals.put("Napoli", 85);
        teamGoals.put("Manchester City", 83);

        return teamGoals;
    }
}
