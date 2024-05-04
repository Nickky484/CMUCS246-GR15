package cau2;

public class Print {
    public static void printLine() {
        System.out.println("*****************");
    }

    public static void printStart() {
        printLine();
        System.out.println("******START******");
        printLine();
    }

    public static void printEnd() {
        printLine();
        System.out.println("*******END*******");
        printLine();
    }

    public static void main(String[] args) {
        printStart();
        System.out.println("THE MAIN FUNCTION");
        printEnd();
        //Close the variable
    }
}
