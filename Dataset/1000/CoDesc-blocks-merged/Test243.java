class Test {
    public class Example {
    public void addBinaryCollaborations(Enumeration  values) throws ModelVetoException {
    		Vector	 lElems = new Vector();
    		while( values.hasMoreElements() )
    			{
    			/* 1. fire Vetoable events */
    			Object lTemp = values.nextElement();
    			lElems.add(lTemp);
    			fireAssociationAddedVetoable(SpecificationPackageInfo.ASSOCIATIONINFO_BinaryCollaborations, (BinaryCollaboration)lTemp);
    			}/*while*/
    
    		/* 4 Add or change value */
    		values = lElems.elements();
    		while( values.hasMoreElements() )
    			{
    			addBinaryCollaborations((BinaryCollaboration)values.nextElement());
    			}/*while*/
    	}
        public static void fromStr ( ContingencyTable self , String in ) {
      StringTokenizer st = new StringTokenizer ( in , ";
    " ) ;
      while ( st . hasMoreTokens ( ) ) {
        String varName = st . nextToken ( ) ;
        String value = st . nextToken ( ) ;
        if ( varName . equals ( "Obs_Threshold" ) ) {
          self . obs_threshold = Double . parseDouble ( value ) ;
        }
        else if ( varName . equals ( "Thresholds" ) ) {
          self . thresholds = new BigDecimal ( value . split ( ":" ) [ 0 ] ) ;
          self . contingency_tables = new DecimalFormat ( "###.##" ) ;
        }
        else if ( varName . contains ( "_" ) ) {
          self . contingency_tables . put ( varName , new Integer ( value . split ( ":" ) [ 0 ] ) ) ;
        }
      }
    }
        private void doFinally() {
        log.debug("~doFinally() : Closing connection");
    
        if (ftpClient != null && ftpClient.isConnected()) {
          try {
            final String msg = "Disconnecting FTPClient"; 
            log.debug("~ftp.doFinally() : [" + msg + "]");
            ftpClient.logout();
            ftpClient.disconnect();
          } catch (IOException ioe) {
            final String errMsg = "IOException disconnecting FTPClient [" + ioe.getMessage() + "]"; 
            log.warn("~ftp.doFinally() : [" + errMsg + "]");
          }
        }
      }
    }
}