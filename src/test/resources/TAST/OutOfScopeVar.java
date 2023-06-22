class OutOfScopeVar {

    public OutOfScopeVar() {

        if (1 == 1) {

            int iii;
            iii = 3;

        } else {

        }

        System.out.println(iii);

    }

}