class Test {
    public class Example {
    public void setColspan(int colspan) throws WrongValueException {
    		if (colspan <= 0)
    			throw new WrongValueException("Positive only");
    		if (_colspan != colspan) {
    			_colspan = colspan;
    			final Execution exec = Executions.getCurrent();
    			if (exec != null && exec.isExplorer())
    				invalidate();
    			else smartUpdate("colspan", Integer.toString(_colspan));
    		}
    	}
        public String auditStack(Set activeCallIDs,long leakedDialogTimer,long leakedTransactionTimer){
      String auditReport=null;
      String leakedDialogs=auditDialogs(activeCallIDs,leakedDialogTimer);
      String leakedServerTransactions=auditTransactions(serverTransactionTable,leakedTransactionTimer);
      String leakedClientTransactions=auditTransactions(clientTransactionTable,leakedTransactionTimer);
      if (leakedDialogs != null || leakedServerTransactions != null || leakedClientTransactions != null) {
        auditReport="SIP Stack Audit:\n" + (leakedDialogs != null ? leakedDialogs : "") + (leakedServerTransactions != null ? leakedServerTransactions : "")+ (leakedClientTransactions != null ? leakedClientTransactions : "");
      }
      return auditReport;
    }
        public void setRoseCenterPaint(Paint paint) {
            if (paint == null) {
                throw new IllegalArgumentException("Null 'paint' argument.");
            }
            this.roseCenterPaint = paint;
            fireChangeEvent();
        }
    }
}