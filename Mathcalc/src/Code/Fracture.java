package Code;

public class Fracture {
    
    int zDenominator;
    int zNumerator;
    int zGCD;

    public Fracture(int pDenominator, int pNumerator) {
        zNumerator = pNumerator;
        zDenominator = pDenominator;
        System.out.println("Numerator: " + zNumerator);
        System.out.println("Denominator: " + zDenominator);

    } 
    public void setNumerator(int pNumerator) {
        zNumerator = pNumerator;
        System.out.println("Numerator: " + zNumerator);
    }
    public int getNumerator() {
        return zNumerator;
    }
    public void setDenominator(int pDenominator) {
        zDenominator = pDenominator;
        System.out.println("Denominator: " + zDenominator);
    }
    public int getDenominator() {
        return  zDenominator;
    }
    public void shorten(int pDivider) {
        if (zNumerator / pDivider * pDivider == zNumerator && zDenominator / pDivider * pDivider == zDenominator) {
            zNumerator = zNumerator / pDivider;
            zDenominator = zDenominator / pDivider;
            System.out.println(zNumerator * pDivider + "/" + zDenominator * pDivider + " shorten to " + zNumerator + "/" + zDenominator);
       }
    }
    public void expand(int pMultiplicator) {
        zNumerator = zNumerator * pMultiplicator;
        zDenominator = zDenominator * pMultiplicator;
        System.out.println(zNumerator / pMultiplicator + "/" + zDenominator / pMultiplicator + " expand to " + zNumerator + "/" + zDenominator);
    }
    public void shortenCompleteley() {
        int lhelp;
        boolean lrun;
        lrun = true;
        lhelp = Math.min(zNumerator, zDenominator);
        while (lrun) {
            if (zNumerator / lhelp * lhelp == zNumerator && zDenominator / lhelp * lhelp == zDenominator) {
                zNumerator = zNumerator / lhelp;
                zDenominator = zDenominator / lhelp;
                zGCD = lhelp;
                lrun = false;
                System.out.println("GCD: " + lhelp);
            } else {
                lhelp = lhelp - 1;
            }
        }
    }
    public int getzGCD() {
        return zGCD;
    }
    public void reciprocal() {
        int lhelp = zDenominator;
        zDenominator = zNumerator;
        zNumerator = lhelp;
    }
    public double getDecimal() {
        return (double)zNumerator / (double)zDenominator;
    }
}
