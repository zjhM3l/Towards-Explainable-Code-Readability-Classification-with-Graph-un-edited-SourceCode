class Test {
    public class Example {
    public Dictionary getComplement(Dictionary dictionary) {
            List<Dictionary> candidates = Lists.newArrayList();
    
            List<Dictionary> dictionaries = getDictionaries();
    
            for (Dictionary d : dictionaries) {
                if (d.getFromLanguage().equals(dictionary.getToLanguage()) && d.getToLanguage().equals(dictionary.getFromLanguage())) {
                    candidates.add(d);
                }
            }
    
            for (Dictionary candidate : candidates) {
                String[] langs = candidate.getName().split("-");
    
                if (langs.length == 2 && (langs[0].equalsIgnoreCase(dictionary.getToLanguage().getName())) &&
                        langs[1].equalsIgnoreCase(dictionary.getFromLanguage().getName())) {
                    return candidate;
                }
            }
    
            return null;
        }
        public RealMatrix getCorrelationStandardErrors() {
            int nVars = correlationMatrix.getColumnDimension();
            double[][] out = new double[nVars][nVars];
            for (int i = 0; i < nVars; i++) {
                for (int j = 0; j < nVars; j++) {
                    double r = correlationMatrix.getEntry(i, j);
                    out[i][j] = FastMath.sqrt((1 - r * r) /(nObs - 2));
                }
            }
            return new BlockRealMatrix(out);
        }
        public void joinGroup(Inet4Address group, VirtualInterface vif) {
    		Native.joinGroup(
    				Utilities.Inet4AddressToInt(group),
    				Utilities.Inet4AddressToInt(vif.getLocalAddress()),
    				vif.getIfIndex());
    	}
    }
}