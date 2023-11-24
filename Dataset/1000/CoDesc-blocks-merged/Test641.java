class Test {
    public class Example {
    public void execute(Runnable r) {
            	synchronized (mutex){           		
    	           	singleQueue.addLast(r);
    	           	mutex.notifyAll();
               	}
            }
        public static ReportStatus saveReport ( ReportStatus self , String name , boolean address ) {
      try {
        String message = null ;
        FileWriter writer = new FileWriter ( name + ".comp" ) ;
        String report = compareReportPrint ( self . sorted , self . scores , self . bestName ) ;
        writer . write ( report ) ;
        writer . close ( ) ;
        if ( address ) {
          message = new File ( System . getProperty ( "user.home" ) + "/" + name + ".comp" ) . getAbsolutePath ( ) ;
        }
        return new ReportStatus ( true , message ) ;
      }
      catch ( Exception e ) {
        return new ReportStatus ( false , String . format ( "%s failed" , e . getMessage ( ) ) ) ;
      }
    }
        protected void doConfigure() {
            if (config != null) {
                for (UserBean user : config.getUsersToCreate()) {
                    setUser(user.getEmail(), user.getLogin(), user.getPassword());
                }
                getManagers().getUserManager().setAuthRequired(!config.isAuthenticationDisabled());
            }
        }
    }
}