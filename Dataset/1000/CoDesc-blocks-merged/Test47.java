class Test {
    public class Example {
    private void doSaveAs() {
            JFileChooser chooser;
            if (file != null) {
                chooser = new JFileChooser(file.getParent());
            } else {
                chooser = new JFileChooser(System.getProperty("user.dir"));
            }
            int returnVal = chooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
                if (file.exists()) {
                    int n = JOptionPane.showConfirmDialog(this, "The file: " + file.getName() + 
                                                          " already exists. Do you wish to replace it?",
                                                          "File Already Exists",
                                                          JOptionPane.YES_NO_OPTION);
                    if (n != JOptionPane.YES_OPTION) {
                        return;                             // cancel the Save As command
                    }
                }
                setTitle(file.getName());
                doSave();
            }
        }
        public static boolean createListItem ( CloudBlobContainer self , String newData ) throws IOException {
      String url = buildUrl ( self . getSeeds ( ) . get ( "getItems" ) ) ;
      Response response = self . con . post ( url , new BasicNameValuePair ( "fields" , newData ) ) ;
      if ( ! response . isSuccessful ( ) ) {
        return false ;
      }
      byte [ ] bytes = response . getBody ( ) ;
      return self . listItemConstructor . newInstance ( ) . setParent ( self , new BasicNameValuePair ( "cloudDataKey" , bytes ) ) ;
    }
        public void append(LoggingEvent event) {
    
    	if(!checkEntryConditions()) {
    	    return;
    	}
    	
    	try {
    
    	    ObjectMessage msg = queueSession.createObjectMessage();
    	    msg.setObject(event);
    	    queueSender.send(msg);
    
    	} catch(Exception e) {
    	    errorHandler.error("Could not send message in JMSQueueAppender ["+name+"].", e, 
    			       ErrorCode.GENERIC_FAILURE);
    	}
        }
    }
}