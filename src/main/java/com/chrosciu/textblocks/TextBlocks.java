package com.chrosciu.textblocks;

public class TextBlocks {
    private static String basic = """
            <html>
                <body>
                    DUMMY TEXT   
                <body>
            <html>
            """;

    private static String notEmptyLastLine = """
            <html>
                <body>
                    DUMMY TEXT
                <body>
            <html>""";

    private static String positiveIndented = """
            <html>
                <body>
                    DUMMY TEXT
                <body>
            <html>
        """;

    private static String negativeIndented = """
            <html>
                <body>
                    DUMMY TEXT
                <body>
            <html>
                """;

    private static String mergedLines = """
            <html>
                <body>\
                    DUMMY TEXT \
                <body>
            <html>
            """;

    private static String extraWhiteChars = """
            <html>
                <body>
                    DUMMY TEXT  \s
                <body>
            <html>
            """;

    public static void main(String[] args) {
        System.out.println("---basic---");
        System.out.println(basic);
        System.out.println("---notEmptyLastLine---");
        System.out.println(notEmptyLastLine);
        System.out.println("---positiveIndented---");
        System.out.println(positiveIndented);
        System.out.println("---negativeIndented---");
        System.out.println(negativeIndented);
        System.out.println("---mergedLines---");
        System.out.println(mergedLines);
        System.out.println("---extraWhiteChars---");
        System.out.println(extraWhiteChars);
        System.out.println("---");
    }
}
