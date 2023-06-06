class Calculator {
    private boolean add;
    private int a;
    private int b;
    private int result;

    Calculator () {
      setValues();
      calculate();
      printResult();
    }

    public void setValues() {
        this.add = true;
        this.a = 3;
        this.b = 2;
    }

    private void calculate() {
        if (this.add == true) {
            this.result = this.a + this.b;
        } else {
            this.result = this.a * this.b;
        }
    }

    private void printResult() {
        System.out.println("Das Ergebnis ist: " + this.result);
    }
}

class Spam {
    private int amount;

    Spam(int a) {
        this.amount = a;
        while (this.amount > 0) {
            System.out.println("SPAM");
            this.amount = this.amount - 1;
        }
    }
}