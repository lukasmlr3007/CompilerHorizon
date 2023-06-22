class OutOfScopeVar {

    public OutOfScopeVar() {

        if (1 == 1) {

            int iii;

        } else {

        }

        System.out.println(iii);
    }
}