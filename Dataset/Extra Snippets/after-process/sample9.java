class Test {
    public class Example {

      @Deprecated private int field;

      @Override
      public String toString() {
        switch(field) {
          case 0:
            return "zero";
          case 1:
            return "one";
          case 2:
            return "two";
          default:
            return "unknown";
        }
      }

      public void setField(@Nullable int value) {
        field = value;
      }
    }
}


