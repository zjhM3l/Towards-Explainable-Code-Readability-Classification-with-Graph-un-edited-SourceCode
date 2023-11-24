class Test {
    public class Example {
    private String toHexString(byte[] block, int ofs, int len) {
            StringBuffer buf = new StringBuffer();
            if (len < 1) len = block.length;
            for (int i = ofs; i < ofs+len; i++) {
                buf.append(hexaNibble[(block[i]>>>4)&15]);
                buf.append(hexaNibble[ block[i]     &15]);
            }     
            return buf.toString();
        }
        protected void release(final DirContext context) {
    
    		; // NO-OP since we are not pooling anything
    
    	}
        public int getPrecision(int column) throws SQLException{
    		try {
    		column=getValidColumn(column);
    	    Integer precision=(Integer)characteristics[column][6];
    		return precision==null?0:precision.intValue();
    		}catch(Exception e) {
    			DaffodilDBExceptionHandler.handle("Error Found In is getPrecision" , "" , e,connection.getLocale());
    			return Integer.MIN_VALUE;
    		}
    
    
    	}
    }
}