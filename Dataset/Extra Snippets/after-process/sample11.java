class Test {
    public class ExampleClass {

        public void doSomething() {
            System.out.println("Doing something");
        }

        public void doSomethingElse() {
            System.out.println("Doing something else");
        }

        public void handleException() {
            try {
                int result = 1 / 0;
                System.out.println("Result: " + result);
            } catch (Exception e) {
            }
        }

        public static void main(String[] args) {
            ExampleClass example = new ExampleClass();
            example.doSomething();
            example.doSomethingElse();
            example.handleException();
        }
    }
}