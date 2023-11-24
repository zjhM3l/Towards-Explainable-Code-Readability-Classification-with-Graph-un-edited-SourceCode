class Test {
    public class Example {
    public void calcTotal(){
            for(int counter = 0; counter < getOrderLineList().size(); counter++){
                POTotal = POTotal + getOrderLineList().get(counter).getLineAmount();
            }                
        }
        public String getHost() {
    		if (this.iNamespacePath == null) return null;
    		String userInfo = this.iNamespacePath.getUserInfo();
    		String host = this.iNamespacePath.getHost();
    		return userInfo == null ? host : userInfo + '@' + host;
    	}
        public Lattice findFrequentItemsetsAndImplications(int minSupport) {
            DepthSearchCalculator latticeCalc = new DepthSearchCalculator();
            Lattice lat = FCAEngineRegistry.makeLatticeForContext(cxt);
            latticeCalc.setRelation(cxt.getRelation());
            latticeCalc.setLattice(lat);
            latticeCalc.buildLattice();
            return lat;
        }
    }
}