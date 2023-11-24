class Test {
    public class Example {
    public Instance calcPivot(TempNode node1,TempNode node2,Instances insts) throws Exception {
      int classIdx=m_Instances.classIndex();
      double[] attrVals=new double[insts.numAttributes()];
      Instance temp;
      double anchr1Ratio=(double)node1.points.length / (node1.points.length + node2.points.length), anchr2Ratio=(double)node2.points.length / (node1.points.length + node2.points.length);
      for (int k=0; k < node1.anchor.numValues(); k++) {
        if (node1.anchor.index(k) == classIdx)     continue;
        attrVals[k]+=node1.anchor.valueSparse(k) * anchr1Ratio;
      }
      for (int k=0; k < node2.anchor.numValues(); k++) {
        if (node2.anchor.index(k) == classIdx)     continue;
        attrVals[k]+=node2.anchor.valueSparse(k) * anchr2Ratio;
      }
      temp=new DenseInstance(1.0,attrVals);
      return temp;
    }
        public void initialize() {
    		try {
    			super.initialize();
    			_dsEquipo.setPage(this);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
        private void fillDeletePermissionDataSet(OpProjectSession s, OpBroker broker, XComponent dataSet, XComponent deletePermissionSet) {
          for (int i = 0; i < dataSet.getChildCount(); i++) {
             XComponent row = (XComponent) dataSet.getChild(i);
             String locator = row.getStringValue();
             OpActivityIfc activity = (OpActivityIfc) broker.getObject(locator);
             boolean delete = OpMyTasksServiceImpl.deleteGranted(s, broker, activity);
             XComponent delRow = new XComponent(XComponent.DATA_ROW);
             delRow.setBooleanValue(delete);
             deletePermissionSet.addChild(delRow);
          }
       }
    }
}