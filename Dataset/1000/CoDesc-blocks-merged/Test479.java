class Test {
    public class Example {
    static public Vector resolveClusterRelationships(Vector/* IRelatableCluster */clusters) {
            Timer.printTimeElapsed("resolveClusterRelationships() -- START");
            try {
                Iterator it = clusters.iterator();
                while (it.hasNext()) {
                    resolveRelationship( (IRelatableCluster) it.next() );
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Timer.printTimeElapsed("resolveClusterRelationships() -- END");
            return clusters;
        }
        public void addProcedure (Procedure procedure) {
            procedures = (Procedure[]) 
                ArrayUtils.addElemToArray(Procedure.class, procedures, procedure);  
            procedure.setParent(this);      
        }
        public void setDataTable(String dataTable) {
    		this.dataTable = dataTable;
    //		this
    
    	}
    }
}