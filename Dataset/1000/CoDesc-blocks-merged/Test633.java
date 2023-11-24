class Test {
    public class Example {
    public int compareTo(ServiceCounter other) {
    			// compare service group
    			int serviceGroup = StringTool.compareWithNull(this.getVerrechenbar().getCodeSystemName(), other
    					.getVerrechenbar().getCodeSystemName());
    			if (serviceGroup != 0) {
    				return serviceGroup;
    			}
    
    			// compare service code
    			int serviceCode = StringTool.compareWithNull(this.getVerrechenbar().getCode(), other.getVerrechenbar()
    					.getCode());
    			if (serviceCode != 0) {
    				return serviceCode;
    			}
    
    			return this.getIncome().getCents() - other.getIncome().getCents();
    		}
        private double computeEntropy(int[][] data) throws Exception {
    
        double[] classCounts = new double[26] ;		
        for (int i = 0; i < data.length; i++) {
        	classCounts[data[i][0]-97]++;		// egyes karakterek sz�m�t sz�molja   (int) a  = 97
        }
        double entropy = 0;
        for (int j = 0; j < 26; j++) {
          if (classCounts[j] > 0) {
            entropy -= classCounts[j] * Math.log(classCounts[j])/ Math.log(2);
          }
        }
        entropy /= (double) data.length;
        return entropy + Math.log(data.length)/ Math.log(2);
      }
        public Reference (String division){
            this.division = division;
    
            // Now, get the RegexPatterns Object for this division
            patterns = (RegexPatterns) (RegexPatterns.patternHash.get(this.division));
    
            if  (patterns == null) {
                patterns = new RegexPatterns();
                patterns.compile();
            }
    
            compiler = patterns.getCompiler();
    
            matcher = new Perl5Matcher();
            this.category = RefType.REF_NOT_SET;
        }
    }
}