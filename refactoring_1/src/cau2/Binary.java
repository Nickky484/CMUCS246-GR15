package cau2;

public class Binary {
    public void fourNumber() {
        int Decimal = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    for (int l = 0; l < 2; l++) {
                        System.out.println("" + i + j + k + l + "\t" + Decimal);
                        Decimal++;
                    }
    }

    public static void main(String a[]) {
        Binary oc = new Binary();
        System.out.println("Binary\tDecimal");
        oc.fourNumber();
    }
}
