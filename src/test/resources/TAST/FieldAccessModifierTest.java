class FieldAccessModifierTest {

    private AnotherClass anotherClass;

    public FieldAccessModifierTest() {

        int aaaa = this.anotherClass.ac;

    }

}

class AnotherClass {

    private int ac;

    public AnotherClass() {
        this.ac = 5;
    }

}