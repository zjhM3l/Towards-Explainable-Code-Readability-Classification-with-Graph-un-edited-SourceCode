class Test {
    public class Example {
    public void setDayProperties(int newCurrent, int newLast) {
            if(newCurrent > newLast || newCurrent < 0 || newLast < 0 ||
    	   (newCurrent == current && newLast == last))
    	    return;
    
    	current = newCurrent;
    	last = newLast;
    	fireStateChanged();
        }
        @ VisibleForTesting static void deserializeForImport ( Block self , JsonReader reader ) throws IOException {
      super . deserializeForImport ( self , reader ) ;
      self . transactions = new ArrayList < Transaction > ( ) ;
      int transactionLength = reader . readVarInt ( ) ;
      for ( int i = 0 ;
      i != transactionLength ;
      ++ i ) {
        Transaction tx = Transaction . deserializeFrom ( reader ) ;
        self . transactions . add ( tx ) ;
      }
      if ( self . transactions . size ( ) < 1 ) {
        throw new RuntimeException ( "Invalid format " + self . index + " " ) ;
      }
    }
        @DoesServiceRequest
        public boolean createIfNotExists(TableRequestOptions options, OperationContext opContext) throws StorageException {
            options = TableRequestOptions.populateAndApplyDefaults(options, this.tableServiceClient);
    
            boolean exists = this.exists(true, options, opContext);
            if (exists) {
                return false;
            }
            else {
                try {
                    this.create(options, opContext);
                    return true;
                }
                catch (StorageException e) {
                    if (e.getHttpStatusCode() == HttpURLConnection.HTTP_CONFLICT
                            && StorageErrorCodeStrings.TABLE_ALREADY_EXISTS.equals(e.getErrorCode())) {
                        return false;
                    }
                    else {
                        throw e;
                    }
                }
            }
        }
    }
}