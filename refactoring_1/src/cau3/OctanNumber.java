package cau3;

public class OctanNumber {
    public void fourNumber() {
        int Decimal = 0;
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                for (int k = 0; k < 8; k++)
                    for (int l = 0; l < 8; l++) {
                        System.out.println("" + i + j + k + l + "\t" + Decimal);
                        Decimal++;
                    }
    }

    public static void main(String a[]) {
        OctanNumber oc = new OctanNumber();
        System.out.println("Octan\tDecimal");
        oc.fourNumber();
    }
}
