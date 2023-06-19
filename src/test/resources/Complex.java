class Calculator {
    private boolean add;
    private int aa;
    private int bb;
    private int result;

    public Calculator () {
      this.setValues();
      this.calculate();
      this.printResult();
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
        System.out.println(true);
    }
}

class Spam {
    private int amount;

    public Spam(int aa) {
        this.amount = aa;
        while (this.amount > 0) {
            System.out.println(c);
            this.amount = this.amount - 1;
        }
    }
}