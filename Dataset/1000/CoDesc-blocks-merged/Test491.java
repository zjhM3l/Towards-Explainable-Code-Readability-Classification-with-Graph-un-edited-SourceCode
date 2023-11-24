class Test {
    public class Example {
    public static synchronized void cleanup(ResultSet R){
      Statement S=null;
      if (R != null) {
        try {
          S=R.getStatement();
        }
     catch (    Throwable t) {
          surfaceThrowable("cleanup() called ResultSet.getStatement()",t);
        }
        cleanup(S,R);
      }
    }
        public void createAccount(AccountType accountType, String username, String password) { 
            if(isConnected()) {
                try {
                    synchronized(this) {
                        this.getOutputStream().writeInt(ClientMessageCode.CREATEACCOUNT.getIndex());
                        this.getOutputStream().writeInt(accountType.getIndex());
                        new TransferString(username, 2000).sendData(this.getOutputStream());
                        new TransferString(password, 2000).sendData(this.getOutputStream());
                        this.getOutputStream().flush(); 
                    }
                } catch (IOException e) { 
                    this.messageFailed(e);
                }
            }
        }
        private static void updateContainerHostConfig ( ContainerHostConfig self , Service service ) {
      if ( service == null ) {
        throw new NullPointerException ( "service must not be null" ) ;
      }
      if ( service . getDependencies ( ) != null ) {
        loadDependencyContainers ( service ) ;
        if ( service . getHostConfig ( ) . getLinks ( ) != null ) {
          updateLinks ( service ) ;
        }
        if ( service . getHostConfig ( ) . getVolumesToAdd ( ) != null ) {
          updateVolumesToAdd ( service ) ;
        }
      }
    }
    }
}