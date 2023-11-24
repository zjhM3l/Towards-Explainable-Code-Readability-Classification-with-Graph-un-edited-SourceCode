class Test {
    public class Example {
    public void xmlDeclaration(String encoding) {
    
            if (out == null)
                return;
    
            if (encoding == null) {
                out.println("<?xml version='1.0'?>");
            } else {
                out.println("<?xml version='1.0' encoding='" + encoding + "'?>");
            }
        }
        private static String wordShapeChris4(String s, boolean omitIfInBoundary, Collection<String> knownLCWords) {
    
        int len = s.length();
    
        if (len <= BOUNDARY_SIZE * 2) {
    
          return wordShapeChris4Short(s, len, knownLCWords);
    
        } else {
    
          return wordShapeChris4Long(s, omitIfInBoundary, len, knownLCWords);
    
        }
    
      }
        public java.lang.String getPrivateEndpoint() {
        java.lang.Object ref = privateEndpoint_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          privateEndpoint_ = s;
          return s;
        }
      }
    }
}