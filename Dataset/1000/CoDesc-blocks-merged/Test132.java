class Test {
    public class Example {
    public static int codePointCount(CharSequence seq,int beginIndex,int endIndex){
      if (seq == null) {
        throw new NullPointerException();
      }
      int len=seq.length();
      if (beginIndex < 0 || endIndex > len || beginIndex > endIndex) {
        throw new IndexOutOfBoundsException();
      }
      int result=0;
      for (int i=beginIndex; i < endIndex; i++) {
        char c=seq.charAt(i);
        if (isHighSurrogate(c)) {
          if (++i < endIndex) {
            c=seq.charAt(i);
            if (!isLowSurrogate(c)) {
              result++;
            }
          }
        }
        result++;
      }
      return result;
    }
        public void setArray(long[] array) {
    		this.array = array;
    		this.size = ((long[]) this.array).length;
    		this.maxId = this.size - 1;
    	}
        protected void parse(DataInputStream stream) throws Exception {
      int size=stream.readInt();
      int ret, read=0;
      data=new byte[size];
      while (size > 0) {
        ret=stream.read(data,read,size);
        size-=ret;
        read+=ret;
      }
    }
    }
}