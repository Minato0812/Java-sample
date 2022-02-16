import java.io.*;

public class ArgsLastPrinter {
    public static void main(String[] args) {
        try {
            System.out.println(args[args.length -1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("なし");
        }
    }
}