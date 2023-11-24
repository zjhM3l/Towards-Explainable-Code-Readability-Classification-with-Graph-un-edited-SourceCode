class Test {
    public class Example {
    private double volume(double teAv, double teAr) {
    
    		double dx = 1;
    		double x, dV;
    		double result = 0;
    		double tex;
    
    
    		x = courbes[nCourbes - 1].getE().getX();
    		while (x < courbes[nCourbes - 1].getT().getX()) {
    			tex =
    				teAv
    					+ (courbes[0].getE().getX() - x)
    						/ (courbes[0].getE().getX() - courbes[0].getT().getX())
    						* (teAr - teAv);
    			dV = aire(x, tex) * dx;
    			result += dV;
    			x += dx;
    		}
    		return result;
    	}
        public PagedList<CloudPool> listPools(DetailLevel detailLevel, Iterable<BatchClientBehavior> additionalBehaviors)
                throws BatchErrorException, IOException {
            PoolListOptions options = new PoolListOptions();
    
            BehaviorManager bhMgr = new BehaviorManager(this.customBehaviors(), additionalBehaviors);
            bhMgr.appendDetailLevelToPerCallBehaviors(detailLevel);
            bhMgr.applyRequestBehaviors(options);
    
            return this.parentBatchClient.protocolLayer().pools().list(options);
        }
        protected void validate(LSIDRequestContext req) throws LSIDServerException {
    		checkLowerCase(req.getLsid());
    		// all lsids must have either metadata, data, or both
    		if (hasMetadata(req) || hasData(req) ) {
    			return;
    		}
    		throw new LSIDServerException(LSIDServerException.UNKNOWN_LSID,"no data or metadata");
    	}
    }
}