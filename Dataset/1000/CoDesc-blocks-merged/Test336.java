class Test {
    public class Example {
    public void setPositionInformation(int startLineno, int startCharno,
                                         int endLineno, int endCharno) {
        if (startLineno > endLineno) {
          throw new IllegalStateException(
              "Recorded bad position information\n"
              + "start-line: " + startLineno + "\n"
              + "end-line: " + endLineno);
        } else if (startLineno == endLineno && startCharno >= endCharno) {
          throw new IllegalStateException(
              "Recorded bad position information\n"
              + "line: " + startLineno + "\n"
              + "start-char: " + startCharno + "\n"
              + "end-char: " + endCharno);
        }
    
        this.startLineno = startLineno;
        this.startCharno = startCharno;
        this.endLineno = endLineno;
        this.endCharno = endCharno;
      }
        public static boolean isConnected(Context context){
      ConnectivityManager connectivityManager=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
      NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
      return networkInfo != null && networkInfo.isConnected();
    }
        public void testMissingGroupid() throws Exception {
            BugReport report = createCompleteBugReport((String) getNormalUser().getGroupList().get(0));
            report.setGroupid(null);
            info("trying to add a bug report with missing package.");
            missingAttributeTest(report, "errors.missing.groupid");
        }
    }
}