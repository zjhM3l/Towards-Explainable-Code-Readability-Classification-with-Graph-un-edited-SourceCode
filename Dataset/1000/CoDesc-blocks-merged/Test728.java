class Test {
    public class Example {
    protected void navCellStart() {
            print("  ");
            tdBgcolorStyle("#EEEEFF", "NavBarCell1");
            print("    ");
        }
        public StreamInfoManager(TwitchApi api,StreamInfoListener listener){
      this.listener=listener;
      this.api=api;
      pendingRequests=new HashMap<>();
      invalidStreamInfo=new StreamInfo("invalid",listener);
      invalidStreamInfo.setRequested();
    }
        @DSComment("From safe class list") @DSSafe(DSCat.SAFE_LIST) @DSGenerator(tool_name="Doppelganger",tool_version="2.0",generated_on="2013-12-30 12:56:30.244 -0500",hash_original_method="7F9E047B51DBA75DC18A757B80E882F7",hash_generated_method="DB1114BC7A734B93414409E7AC5A0CD5") public static String toOctalString(long v){
      String str=new String();
      str.addTaint((int)v);
      return str;
    }
    }
}