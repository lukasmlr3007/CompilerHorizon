class FieldAccessModifierTest {

    private AnotherClass anotherClass;
    private int aaaa;

    public FieldAccessModifierTest() {

        this.anotherClass = new AnotherClass();

        this.aaaa = this.anotherClass.ac;

    }

}

class AnotherClass {

    private int ac;

    public AnotherClass() {
        this.ac = 5
    }

}