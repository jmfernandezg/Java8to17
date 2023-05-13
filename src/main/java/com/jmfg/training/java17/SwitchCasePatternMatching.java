package com.jmfg.training.java17;

import java.util.List;
import java.util.Map;
import java.util.Set;


//Example of pattern matching & switch
public class SwitchCasePatternMatching {

    public static void main(String[] args) {

        Object value = getValue();

        String result = getResult(value);
        System.out.println(result);
    }

    public static String getResult(Object value) {
        //char,byte,short,int,Character,Byte,Short,Integer,String,Enum type.

        return switch (value) {
            case String s -> "A String of length :  " + s.length();
            case List list -> "A list of size : " + list.size();
            case Map map -> "A map(key,value) of size : " + map.size();
            case Set set -> "A set, unique elements : " + set.size();
            default -> "Unknown data structure...";
        };
    }

    public static String getResultSwitchStatement(Object value) {
        return switch (value) {
            case String s -> "A String of length :  " + s.length();
            case List list -> "A list of size : " + list.size();
            case Map map -> "A map(key,value) of size : " + map.size();
            case Set set -> "A set, unique elements : " + set.size();
            default -> "Unknown data structure...";
        };
    }

    //Example of Guarded pattern
    public static String getResultWithGuard(Object value) {
        return switch (value) {
            case String s -> "A String of length :  " + s.length();
            case List list && (list.size() > 10000) -> "A large list of size : " + list.size();
            case List list -> "A list of size : " + list.size();
            case Map map -> "A map(key,value) of size : " + map.size();
            case Set set -> "A set, unique elements : " + set.size();
            default -> "Unknown data structure...";
        };
    }

    //null case label.
    public static String getLeagueDescription(FootballLeague league) {
        return switch (league) {
            case null -> "Invalid league";
            case EPL -> "English Premier League";
            case LA_LIGA -> "Spanish football League";
            case BUNDESLIGA -> "Football league in Germany";
            case LIGUE_1 -> "French football tournament";
        };
    }

    private static Object getValue() {
        return Map.of("1", "One", "2", "Two");
        //return List.of(1,2,3,4,5);
        //return "Hello Pattern matching for switch";
    }
}
