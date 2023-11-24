class Test {
    public class Example {
    protected boolean isNo(String what) {
    
      // When at least 2 characters & match
      if  ((what.length() > 1) &&  
           (what.substring(0,2).equalsIgnoreCase(TyMsg.getText(55)))) {
    
          // is standalone 
          return true;
    
      } // endif
      
      // not standalone
      return false; 
      
    } // end-method
        private void validatePimListType(int pimListType) {
            switch (pimListType) {
                case PIM.CONTACT_LIST:
                case PIM.EVENT_LIST:
                case PIM.TODO_LIST:
                    // ok
                    break;
                default:
                    throw new IllegalArgumentException("Not a valid PIM list type: "
                        + pimListType);
            }
        }
        @Override public boolean execute(final String[] params,final String remainder){
      final RPAction action=new RPAction();
      action.put("type","group_message");
      action.put("text",remainder);
      ClientSingletonRepository.getClientFramework().send(action);
      return true;
    }
    }
}