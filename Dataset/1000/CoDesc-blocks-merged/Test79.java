class Test {
    public class Example {
    public int getExtensionValue(final int type){
        if (type < 0 || type > RESERVED) return -1;
        if (extCount[type] == 0)  return -1;
        return extValue[type];
      }
        private static final String toBrowserHexValue(final int number)
        {
            final String chex = Integer.toHexString(fixRGB(number) & 0xFF).toUpperCase();
    
            if (chex.length() < 2)
            {
                return "0" + chex;
            }
            return chex;
        }
        public boolean isPersistent() {
          String token = request.getValue("Connection");
          
          if(token != null) {
             return token.equalsIgnoreCase("keep-alive");
          }      
          int major = request.getMajor();
          int minor = request.getMinor();
          
          if(major >= 1) {
             return minor >= 1;
          }
          return false;     
       }
    }
}