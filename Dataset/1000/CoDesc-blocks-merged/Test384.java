class Test {
    public class Example {
    public void sendEmptyChunk() throws NetworkException {
      if (sLogger.isActivated()) {
        sLogger.info("Send an empty chunk");
      }
      String newTransactionId=generateTransactionId();
      String newMsgId=generateTransactionId();
      addMsrpTransactionInfo(newTransactionId,newMsgId,null,TypeMsrpChunk.EmptyChunk);
      sendEmptyMsrpSendRequest(newTransactionId,mTo,mFrom,newMsgId);
    }
        public Transaction lookup(long transaction_id) throws DAOException{
    
    		try {
    			return factory.lookup(transaction_id);
    		} catch (RollbackException e) {
    			throw new DAOException(e);
    		}
    	}
        @Override public Element store(Object o){
      Element e=new Element("fileLocations");
      storeLocation(e,"defaultScriptLocation",FileUtil.getScriptsPath());
      storeUserFilesLocation(e,FileUtil.getUserFilesPath());
      e.setAttribute("class",this.getClass().getName());
      return e;
    }
    }
}