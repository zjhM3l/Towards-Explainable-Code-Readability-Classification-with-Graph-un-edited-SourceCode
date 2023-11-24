class Test {
    public class Example {
    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
      s.defaultReadObject();
      if (parents == null) {
        throw new NullPointerException();
      }
      if (lookupTable == null) {
        throw new NullPointerException();
      }
    }
        private Object readJSON() throws IOException {
    		skipWhiteSpace(); // Skip all white space, and read up to the first character?
    		if (isStartObject(current)){
    			 return readObject();
    		} else if (isArrayStart(current)){
    			return readArray();
    		} else {
    			return readValue();
    		}
    	}
        public void addPush(String k){
      int length=k.length();
      int limit=itsConstantPool.getUtfEncodingLimit(k,0,length);
      if (limit == length) {
        addLoadConstant(k);
        return;
      }
      final String SB="java/lang/StringBuffer";
      add(ByteCode.NEW,SB);
      add(ByteCode.DUP);
      addPush(length);
      addInvoke(ByteCode.INVOKESPECIAL,SB,"<init>","(I)V");
      int cursor=0;
      for (; ; ) {
        add(ByteCode.DUP);
        String s=k.substring(cursor,limit);
        addLoadConstant(s);
        addInvoke(ByteCode.INVOKEVIRTUAL,SB,"append","(Ljava/lang/String;)Ljava/lang/StringBuffer;");
        add(ByteCode.POP);
        if (limit == length) {
          break;
        }
        cursor=limit;
        limit=itsConstantPool.getUtfEncodingLimit(k,limit,length);
      }
      addInvoke(ByteCode.INVOKEVIRTUAL,SB,"toString","()Ljava/lang/String;");
    }
    }
}