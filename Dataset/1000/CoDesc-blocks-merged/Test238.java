class Test {
    public class Example {
    private Graph graphIsomorphicCopy(Graph g){
    		Graph newG = new Graph();
    		for(Vertex v : g.getVertexList()){
    			Vertex w = new Vertex(v.getID());
    			newG.addVertex(w);  
    			v.setImage(w);	// Use the variable "image" to record the isomorphism
    			w.setImage(v);
    		}
    		for(Vertex v : g.getVertexList()){
    			for(Vertex w : v.getNeighborList())
    				newG.addEdge(v.getImage(),w.getImage());
    		}
    		return newG;
    	}
        @SuppressWarnings({ "rawtypes", "unchecked" })
    	public void addTransformationOrPredicate(SerFunction transformationOrPredicate) {
    		Tuple2<Integer, Object> currentProcedure = this.checkPointProcedures.get(this.checkPointProcedures.size()-1);
    		SerFunction func = (SerFunction) currentProcedure._2() == null
    				? transformationOrPredicate
    						: transformationOrPredicate.compose((SerFunction) currentProcedure._2());
    		this.checkPointProcedures.set(this.checkPointProcedures.size()-1, tuple2(currentProcedure._1(), func));
    	}
        public boolean adaptToBoolean(String value) {
                int length;
                if (value == null || (length = value.length()) == 0) {
                    if (mLenient) {
                        return false;
                    }
                } else if (length == 1 || mLenient) {
                    return adaptToBoolean(value.charAt(0));
                }
    
                throw new IllegalArgumentException
                    ("Cannot adapt '" + value + "' into boolean for property \"" +
                     mPropertyName + '"');
            }
    }
}