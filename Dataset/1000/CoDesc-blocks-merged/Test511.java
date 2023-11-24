class Test {
    public class Example {
    public void addHistory( DefaultBranchColouring history ) {
    		
    		// require that my child colour is the new history's parent colour
    		if (childColour != history.parentColour) {
    			throw new Error("My child colour and the added parent colour don't match");
    		}
    		colourChanges.addAll( history.colourChanges );
    		changeHeights.addAll( history.changeHeights );
    		childColour = history.childColour;
    		
    		fullSanityCheck();
    
    	}
        public void recalcMinMax(){
          double min = Double.POSITIVE_INFINITY;
          double max = Double.NEGATIVE_INFINITY;
          for(int count = 0; count<genes.size(); count++){
            Gene g = (Gene)genes.elementAt(count);
            double d;
            if((d=g.getMaxValue())!=Double.POSITIVE_INFINITY){
              max=Math.max(max,d);
            }
            if((d=g.getMinValue())!=Double.POSITIVE_INFINITY){
              min=Math.min(min,d);
            }
          }
    
          this.minExpValue = min;
          this.maxExpValue = max;
        }
        public void testGettingParametersAsPropertiesGroupThatDontExist() {
    		try {
                core.setConfiguration(this.createComplexConfiguration());
                versionEffectiveDate=new VersionEffectiveDate();
                Properties p=core.getParametersAsProperties("plants");
                assertNotNull(p);
    		}
            catch(Throwable e) {
                fail("Unexpected exception:"+e);
            }
        }
    }
}