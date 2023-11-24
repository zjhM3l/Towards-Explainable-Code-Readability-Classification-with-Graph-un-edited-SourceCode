class Test {
    public class Example {
    public void processBytes(byte[] in,int inOff,int len,byte[] out,int outOff) throws DataLengthException {
      if (outOff + len > out.length) {
        throw new DataLengthException("output buffer too small in processBytes()");
      }
      for (int i=0; i != len; i++) {
        cipher.processBlock(in,inOff + i,out,outOff + i);
      }
    }
        public String encryptCredentials(String password) throws IdMUnitException {
    	    try {
    	        // Encode the string into bytes using utf-8
    	        byte[] utf8 = password.getBytes("UTF8");
    
    	        // Encrypt
    	        byte[] enc = encrypt(utf8, secretKey, xform);
    
    	        // Encode bytes to base64 to get a string
    	        return new sun.misc.BASE64Encoder().encode(enc);
    	    } catch (UnsupportedEncodingException e) {
    	    	throw new IdMUnitException("Failed to encrypt credentials (Unsupported encoding)");
    	    }
    	}
        private RuleSet cloneRuleSet() {
            final RuleSet clonedRuleSet = new RuleSet();
    
            for (Rule rule: projectRuleSet.getRules()) {
                clonedRuleSet.addRule(rule);
            }
            clonedRuleSet.addExcludePatterns(projectRuleSet.getExcludePatterns());
            clonedRuleSet.addIncludePatterns(projectRuleSet.getIncludePatterns());
    
            return clonedRuleSet;
        }
    }
}