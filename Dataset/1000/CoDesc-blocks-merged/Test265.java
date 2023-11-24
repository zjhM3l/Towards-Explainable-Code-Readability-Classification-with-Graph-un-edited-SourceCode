class Test {
    public class Example {
    public void text(float num, float x, float y) {
            if (recorder != null)
                recorder.text(num, x, y);
            g.text(num, x, y);
        }
        public String getService() {
            if (service != null) {
                return service.getService();
            }
            return null;
        }
        public static void sleep(long millis){
      try {
        Thread.sleep(millis);
      }
     catch (  InterruptedException e) {
        e.printStackTrace();
      }
    }
    }
}