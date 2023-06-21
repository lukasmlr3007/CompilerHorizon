class Expressions {

    private int numberA;
    private int numberB;
    private boolean boolA;
    private boolean boolB;

    private int ergebnis;
    private boolean wahrheitswert;

    public void test() {

        this.numberA = 1;
        this.numberB = 2;
        this.boolA = true;
        this.boolB = false;

        this.ergebnis = numberA + numberB;
        this.ergebnis = numberA - numberB;
        this.ergebnis = numberA * numberB;
        this.ergebnis = numberA / numberB;

        this.wahrheitswert = numberA < numberB;
        this.wahrheitswert = numberA >= numberB;
        this.wahrheitswert = numberA == numberB;
        this.wahrheitswert = boolA && boolB;
        this.wahrheitswert = boolA || boolB;
    }
}