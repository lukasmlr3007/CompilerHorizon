class Calculator {
    private boolean add;
    private int aa;
    private int bb;
    private int result;

    Calculator () {
      setValues();
      calculate();
      printResult();
    }

    public void setValues() {
        this.add = true;
        this.aa = 3;
        this.bb = 2;
    }

    private void calculate() {
        if (this.add == true) {
            this.result = this.aa + this.bb;
        } else {
            this.result = this.aa * this.bb;
        }
    }

    private void printResult() {
        System.out.println("Das Ergebnis ist: " + this.result);
    }
}

class Spam {
    private int amount;

    Spam(int aa) {
        this.amount = aa;
        while (this.amount > 0) {
            System.out.println("SPAM");
            this.amount = this.amount - 1;
        }
    }
}