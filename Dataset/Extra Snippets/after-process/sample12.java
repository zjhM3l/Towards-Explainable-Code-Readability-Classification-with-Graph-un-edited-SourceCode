class Test {
    public class Example {
      private static String name = "John";
      private String message = "Hello world";

      public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(name); // bad
        System.out.println(obj.message); // bad
        obj.printMessage(); // very bad
      }

      public void printMessage() {
        System.out.println(this.message);
      }

      @Override
      protected void finalize() throws Throwable {
        // Perform finalization tasks here
        super.finalize();
      }
    }
}

