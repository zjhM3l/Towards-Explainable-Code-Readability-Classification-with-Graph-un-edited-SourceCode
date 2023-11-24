class Test {
    public class Example {
    public void onModuleLoad() {
    		//create view
    		TanCentrumView view = new TanCentrumView();
    		RootPanel.get("tanCentrumApp").add( view );
    
    		RPCObjectDAOFactory objectFactory = new RPCObjectDAOFactory( 
    				GWT.getModuleBaseURL()+"objectFactory", view );
    		
    		
    		
    		//give the view the object factory
    		view.setObjectFactory( objectFactory );
    //		objectFactory.setListener(view);
    	}
        @Override
    	public CommerceCurrency fetchByG_P_Last(long groupId, boolean primary,
    		OrderByComparator<CommerceCurrency> orderByComparator) {
    		int count = countByG_P(groupId, primary);
    
    		if (count == 0) {
    			return null;
    		}
    
    		List<CommerceCurrency> list = findByG_P(groupId, primary, count - 1,
    				count, orderByComparator);
    
    		if (!list.isEmpty()) {
    			return list.get(0);
    		}
    
    		return null;
    	}
        public void dump(PrintWriter pw, ClassFile cf) {
        pw.print("StartPC:     ");
        pw.println(getStartPc());
        pw.print("Line number: ");
        pw.println(getLineNumber());
      }
    }
}