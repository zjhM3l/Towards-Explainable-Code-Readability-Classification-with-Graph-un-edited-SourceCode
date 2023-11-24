class Test {
    public class Example {
    private String getDomainTestDirectoryPath() {
    		String domainPackageCodeWithSlash = textHandler
    				.replaceDotWithSlash(domainConfig.getPackageCode());
    		return testDirectoryPath + SEPARATOR + domainPackageCodeWithSlash;
    	}
        public void analyze(Analyzer analyzer, boolean allowFlow)
        throws Exception
      {
        _pendingTargets = new IntArray();
        _completedTargets = new IntArray();
        
        analyzeImpl(analyzer, allowFlow, _pendingTargets, _completedTargets);
      }
        public void setItno(String value) {
            if (value.length() > 15) {
                value = value.substring(0, 15);
            }
            setField("MMITNO", value);
        }
    }
}