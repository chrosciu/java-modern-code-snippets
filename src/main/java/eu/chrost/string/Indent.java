package eu.chrost.string;

public class Indent {
    public static void main(String[] args) {
        var lines = "  Ala ma kota \n" +
                    "  a kot nie ma Ali";
        var indented = lines.indent(2);
        System.out.println(indented);
        var backIndented = lines.indent(-2);
        System.out.println(backIndented);
    }
}
