class Test {
    public class Example {
    public ExecutableTests getExecutableTests() throws ShiftException {
            loadInheritedActions();
            ExecutableTests eTests = new ExecutableTests();
            for (Iterator iter = tests.entryIterator(); iter.hasNext();) {
                Test test = (Test) iter.next();
                optimizeTest(test);
                fillOutTest(test);
                eTests.add(convertTest(test));
            }
            return eTests;
        }
        public DerivativeStructure toRadians(){
      final DerivativeStructure ds=new DerivativeStructure(compiler);
      for (int i=0; i < ds.data.length; ++i) {
        ds.data[i]=FastMath.toRadians(data[i]);
      }
      return ds;
    }
        @Override
      public int compareTo(ID o) {
        TaskID that = (TaskID)o;
        int jobComp = this.jobId.compareTo(that.jobId);
        if(jobComp == 0) {
          if(this.isMap == that.isMap) {
            return this.id - that.id;
          }
          else return this.isMap ? -1 : 1;
        }
        else return jobComp;
      }
    }
}