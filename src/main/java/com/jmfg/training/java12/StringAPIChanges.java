package com.jmfg.training.java12;

import java.text.MessageFormat;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * String API changes in Java 12
 */
public class StringAPIChanges {

    public static void main(String[] args) {

        //2 examples to show how to use indent
        indent_one();
        indent_two();

        //transform
        //Exercise : add a filter to the stream
        withoutTransform();
        withTransform();
    }

    private static void indent_one() {
        var poem = """
                99 little bugs in the code.
                99 little bugs in the code.
                Take one down,patch it around.
                127 little bugs in the code...""";

        System.out.println(poem);

        var poemIndented = poem.indent(4);
        System.out.println(poemIndented);

        System.out.println("Back to no indentation....");
        var backToOriginal = poemIndented.indent(-4);
        System.out.println(backToOriginal);
    }

    private static void indent_two() {

        System.out.println("Example two - ");
        System.out.println("\nBefore indentation...");
        String newLine = System.getProperty("line.separator");
        var json = String.join(newLine,
                "\"round\": \"Matchday 1\",",
                "\"date\":  \"2021-04-06\",",
                "\"team1\": \"Real Madrid\",",
                "\"team2\": \"Barcelona\",",
                "\"score\": { \"ft\": [2, 1] }"
        );
        System.out.printf("{\n%s\n}%n", json);

        System.out.println("\nAfter indentation...");
        System.out.println(MessageFormat.format("'{'\n{0}'}'", json.indent(4)));
    }

    private static void withoutTransform() {
        var joke = "the only programming joke i know is my code";
		/*Expected output-
		            "Only Programming Joke I Know Is My Code..."
		*/
        var result = upperCase(dropFirstWord(joke)).concat("...");
        System.out.println(result);
    }

    private static void withTransform() {
        var joke = "the only programming joke i know is my code";
        var result = joke.transform(StringAPIChanges::dropFirstWord)
                .transform(StringAPIChanges::upperCase)
                .concat("...");

        System.out.println(result);
    }

    private static String dropFirstWord(String string) {
        return Stream.of(string.split("\\W+"))
                .skip(1)
                .collect(Collectors.joining(" "));
    }


    private static String upperCase(String string) {
        return Stream.of(string.split("\\W+"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}