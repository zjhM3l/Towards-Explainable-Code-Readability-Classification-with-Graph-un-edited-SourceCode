class Test {
    public class Example {
    public static String getSystemProperty(String propName) {
            final String temp = propName;
            try {
                String prop = AccessController.doPrivileged(
                                                            new PrivilegedAction<String>() {
                                                                @Override
                                                                public String run() {
                                                                    return System.getProperty(temp);
                                                                }
                                                            });
                return prop;
            } catch (SecurityException se) {
                // LOG THE EXCEPTION
                return null;
            }
        }
        public void put(String key, String value) {
    		if (key.equals(VERB)) {
    			return;
    		}
    
    		mFields.put(key, value);
    	}
        @DSGenerator(tool_name="Doppelganger",tool_version="2.0",generated_on="2014-09-03 14:59:48.466 -0400",hash_original_method="CC627F0F353C80BB97E82A837A36768C",hash_generated_method="C510F9BA0D51F7A1D6FB275AB3D13B3F") static String clean(String str){
      if (str == null || str.length() == 0) {
        return str;
      }
      int len=str.length();
      char[] chars=new char[len];
      int count=0;
      for (int i=0; i < len; i++) {
        if (Character.isLetter(str.charAt(i))) {
          chars[count++]=str.charAt(i);
        }
      }
      if (count == len) {
        return str.toUpperCase();
      }
      return new String(chars,0,count).toUpperCase();
    }
    }
}