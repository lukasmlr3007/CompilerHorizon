class SimpleMethodCallAndUsage {

    public int myValue;

    public SimpleMethodCallAndUsage() {
        this.myValue = this.calledMethod();;
    }

    public int calledMethod() {
        return 42;
    }
}