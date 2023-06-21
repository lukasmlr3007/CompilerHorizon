class MethodAccessModifierTest {

    public AnotherClass anotherClass;

    public void test() {
        this.anotherClass = new AnotherClass();
        this.anotherClass.tested();
    }
}

class AnotherClass {

    public AnotherClass() {

    }

    private void tested() {


    }

}