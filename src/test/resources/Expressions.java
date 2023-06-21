class Expressions {

    public void test() {

        int numberA;
        int numberB;
        boolean boolA;
        boolean boolB;

        this.numberA = 1;
        this.numberB = 2;
        this.boolA = true;
        this.boolB = false;

        int ergebnis;
        bool wahrheitswert;

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