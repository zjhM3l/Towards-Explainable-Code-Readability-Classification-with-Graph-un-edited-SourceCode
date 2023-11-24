class Test {
    public class Example {
    private void appendReport(String reportFilePath, String msg) {
    		if (reportFilePath == null)
    			System.out.print(msg + "\n\n");
    		else {
    
    			try {
    				// Write validation report:
    				FileWriter writer = new FileWriter(reportFilePath, true);
    				writer.write(msg);
    				writer.write("\n\n");
    				writer.close();
    			} catch (Exception e) {
    				prtln("Error writing transform report file: " + e);
    			}
    		}
    	}
        public double compute_spatial_locality(long cachesize) {
            double usedBytes=0, fetchedBytes=0;
            for(int i=0; i<64; i++)
                    if (rdis[i] != null) {
                            usedBytes += rdis[i].getUsedBytes(cachesize);
                            fetchedBytes += rdis[i].getFetchedBytes(cachesize);
                    }
            return usedBytes/fetchedBytes;
        }
        private int getBottomIndex(int bottom, int limit) {
    	    if (bottom<0) {
    		return 0;
    	    }
    	    int result = bottom/elementHeight+1;
    	    return result > limit ? limit : result;
    	}
    }
}