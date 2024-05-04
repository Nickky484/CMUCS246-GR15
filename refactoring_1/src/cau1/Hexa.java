package cau1;

public class Hexa {
    public void fourNumber() {
        char[] d = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int Decimal = 0;
        for (int i = 0; i < 16; i++)
            for (int j = 0; j < 16; j++)
                for (int k = 0; k < 16; k++)
                    for (int l = 0; l < 16; l++) {
                        System.out.println("" + d[i] + d[j] + d[k] + d[l] + "\t" + Decimal);
                        Decimal++;
                    }
    }

    public static void main(String a[]) {
        Hexa oc = new Hexa();
        System.out.println("Hexa\tDecimal");
        oc.fourNumber();
    }
}
