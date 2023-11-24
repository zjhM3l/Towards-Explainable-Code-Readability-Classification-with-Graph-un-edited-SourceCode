class Test {
    public class Example {
    public SecP192R1Point(ECCurve curve,ECFieldElement x,ECFieldElement y,boolean withCompression){
      super(curve,x,y);
      if ((x == null) != (y == null)) {
        throw new IllegalArgumentException("Exactly one of the field elements is null");
      }
      this.withCompression=withCompression;
    }
        public DNDHandler getMappingSource() {
            if (operType == WRITE_OPERATION) {
                return xmlTree;
            }
            return columnTree;
        }
        public ClusterStruct clusterStructforPeers(){
            ClusterStruct nuevo = new ClusterStruct();
            if (this.getNumGroups()>0){
                Enumeration ensc = getGroups().elements();
                while (ensc.hasMoreElements()){
                    nuevo.addGroup((Group)ensc.nextElement());
                }
            }
            //nuevo = nuevo.reviewClusterStruct();
            return nuevo;
        }
    }
}