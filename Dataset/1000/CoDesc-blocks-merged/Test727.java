class Test {
    public class Example {
    public ISupplier getSupplier(SupplierID sid, SupplierKey supplierKey) {
            Vector<ISupplier> v = _allSuppliers.get(sid.getIndex());
            for (int i = 0; i < v.size(); i++) {
                if (v.get(i).hasKeyHole(supplierKey)) {
                    return (ISupplier) v.get(i);
                }
            }
            if (sid.hasDummy()) {
                return sid.getDummy();
            } else {
                if(supplierKey != null)
                    __log.error("Could not find Supplier for " + sid.toString() + " with key " + supplierKey.toString());
                else
                    __log.error("Could not find Supplier for " + sid.toString() + " with null key");
                  
                throw new SupplierNotFoundEx(sid, supplierKey, v.size());
            }
    
        }
        public Object clone() {
        KL m = null; 
        m = (KL) super.clone();
        
        // clone the fields
        // for now clone a metric learner via serialization; TODO:  implement proper cloning in MetricLearners
        System.out.println("New alpha=" + m_alpha);
        try { 
          SerializedObject so = new SerializedObject(m_metricLearner);
          m.m_metricLearner = (MetricLearner) so.getObject();
        } catch (Exception e) {
          System.err.println("Problems cloning m_metricLearner while cloning KL");
        }
        return m;
      }
        public void moveToEnd(Instruction inst){
      Iterator<GCIRMapElement> iter=list.iterator();
      while (iter.hasNext()) {
        GCIRMapElement newPtr=iter.next();
        if (newPtr.getInstruction() == inst) {
          iter.remove();
          list.add(newPtr);
          return;
        }
      }
      throw new OptimizingCompilerException("GCIRMap.moveToEnd(" + inst + ") did not delete instruction from GC Map ");
    }
    }
}