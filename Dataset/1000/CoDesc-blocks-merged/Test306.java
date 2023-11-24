class Test {
    public class Example {
    public boolean containsAttribute(List<Attribute> attributeList, Attribute attribute) {
            Iterator<Attribute> i = attributeList.iterator();
            while (i.hasNext()) {
                if (i.next().getName().equals(attribute.getName()))
                    return true;
            }
            return false;
        }
        private static void setAny ( YangRuleImpl self , YangValue v , boolean load ) {
      if ( log . isDebugEnabled ( ) ) {
        log . debug ( "setAny(" + self + ", " + v + ")" ) ;
      }
      try {
        YANGDynClass t = new YANGDynClass ( v , Base . YANGBool , true , YangRuleImpl . class . getName ( ) , YangRuleImpl . class . getName ( ) , YangRuleImpl . class . getName ( ) , YangRuleImpl . class . getName ( ) , self , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , ( String ) v , load ) ;
        public void writeLong(long a) throws IOException {
      io.write((byte)(a >> 56));
      io.write((byte)(a >> 48));
      io.write((byte)(a >> 40));
      io.write((byte)(a >> 32));
      io.write((byte)(a >> 24));
      io.write((byte)(a >> 16));
      io.write((byte)(a >> 8));
      io.write((byte)(a));
    }
    }
}