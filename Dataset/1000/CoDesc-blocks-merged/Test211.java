class Test {
    public class Example {
    public void setValueAt(Object value, int row, int col) {
            this.dataSet[row][col] = value;
            if (col == idCol)
                ids.add(row, value);
        }
        public void execute(IServerPushCallback callback){
      boolean inUIThread=Executions.getCurrent() != null;
      boolean desktopActivated=false;
      try {
        if (!inUIThread) {
          if (Executions.activate(desktop,10 * 60 * 1000)) {
            desktopActivated=true;
          }
     else {
            throw new DesktopUnavailableException("Timeout activating desktop.");
          }
        }
        callback.updateUI();
      }
     catch (  DesktopUnavailableException de) {
        throw de;
      }
    catch (  Exception e) {
        throw new AdempiereException("Failed to update client in server push worker thread.",e);
      }
     finally {
        if (!inUIThread && desktopActivated) {
          Executions.deactivate(desktop);
        }
      }
    }
        private static void cloneAndScoreClusterer ( Clusterer clusterer , Random random , int n ) {
      long start = System . currentTimeMillis ( ) ;
      clusterer = clone ( clusterer ) ;
      Collections . shuffle ( clusterer , random ) ;
    }
    }
}