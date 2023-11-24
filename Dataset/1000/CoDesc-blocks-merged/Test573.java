class Test {
    public class Example {
    @Override public boolean[] existsAll(List<Get> gets) throws IOException {
      boolean[] ret=new boolean[gets.size()];
      int i=0;
      for (  boolean b : exists(gets)) {
        ret[i++]=b;
      }
      return ret;
    }
        public void setBackgroundProcessingInd(int backgroundProcessingInd) {
    		if (!(this.backgroundProcessingInd == backgroundProcessingInd)) {
    			int oldbackgroundProcessingInd= 0;
    			oldbackgroundProcessingInd = this.backgroundProcessingInd;
    			this.backgroundProcessingInd = backgroundProcessingInd;
    			setModified("backgroundProcessingInd");
    			firePropertyChange(String.valueOf(APPLICATIONCONTROLS_BACKGROUNDPROCESSINGIND), oldbackgroundProcessingInd, backgroundProcessingInd);
    		}
    	}
        public void setRows(Location location, Set changedPaths) {
        this.location     = location;
        this.changedPaths = changedPaths;
    
        if(changedPaths.size() > 0) {
          for(Object path : changedPaths) {
            boolean enabled = location.getBranch().equals(FileTableRow.parseURL(path.toString(),
                                                                                FileTableRow.PARSE_URL_BRANCH));
    
            enableItems(enabled, UPDATE_CS, REVERT_CS);
    
            break;
          }
        }
      }
    }
}