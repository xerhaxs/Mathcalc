package Code;

public class Calc {
    
     private Fracture connectedFracture1;
     private Fracture connectedFracture2;

     public Calc() {

     }
     public void connectFracture1(Fracture pFracture) {
         connectedFracture1 = pFracture;

     }
     public void connectFracture2(Fracture pFracture) {
         connectedFracture2 = pFracture;
     }
    private int getSCM() {
        int lHelp = 1;
        while (!(lHelp % connectedFracture1.getDenominator() == 0 && lHelp % connectedFracture2.getDenominator() == 0)) {
            lHelp = lHelp + 1;
        }
        return lHelp;
    }

    public Fracture getSum() {
        Fracture lFracture = new Fracture(1,1);
        connectedFracture1.expand(this.getSCM() / connectedFracture1.getDenominator());
        connectedFracture2.expand(this.getSCM() / connectedFracture2.getDenominator());
        lFracture.setNumerator(connectedFracture1.getNumerator() + connectedFracture2.getNumerator());
        lFracture.setDenominator(this.getSCM());
        lFracture.shortenCompleteley();
        return lFracture;
    }
    public Fracture getDiff() {
        Fracture lFracture = new Fracture(1,1);
        connectedFracture1.expand(this.getSCM() / connectedFracture1.getDenominator());
        connectedFracture2.expand(this.getSCM() / connectedFracture2.getDenominator());
        lFracture.setNumerator(connectedFracture1.getNumerator() - connectedFracture2.getNumerator());
        lFracture.setDenominator(this.getSCM());
        lFracture.shortenCompleteley();
        return lFracture;
    }
    public Fracture getProduct() {
        Fracture lFracture = new Fracture(1,1);
        lFracture.setNumerator(connectedFracture1.getNumerator() * connectedFracture2.getNumerator());
        lFracture.setDenominator(connectedFracture2.getDenominator() * connectedFracture2.getDenominator());
        lFracture.shortenCompleteley();
        return lFracture;
    }
    public Fracture getQuotient() {
        Fracture lFracture = new Fracture(1,1);
        connectedFracture2.reciprocal();
        lFracture.setNumerator(connectedFracture1.getNumerator() * connectedFracture2.getNumerator());
        lFracture.setDenominator(connectedFracture1.getDenominator() * connectedFracture2.getDenominator());
        connectedFracture2.reciprocal();
        lFracture.shortenCompleteley();
        return lFracture;
    }

}
