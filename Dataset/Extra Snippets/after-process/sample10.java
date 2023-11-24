class Test {
    public class my_class {
        private static final int MY_CONSTANT = 10;
        private static String MY_FIELD_NAME = "Hello World";

        public void my_method() {
            int MY_LOCAL_VARIABLE = 5;
            System.out.println(MY_FIELD_NAME + " " + MY_LOCAL_VARIABLE);
        }

        public void my_another_method() {
            MY_FIELD_NAME = "Goodbye World";
            System.out.println(MY_FIELD_NAME);
        }
    }
}

