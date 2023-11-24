class Test {
    public class Example {
    public static void scanBinary ( File patchFile , Project project , String sha256hash , String apikey ) throws IOException {
      VirusTotal vApi = new VirusTotal ( ) ;
      while ( true ) {
        BinaryReport binaryReport = vApi . binaryReport ( sha256hash , apikey ) ;
        int responseCode = binaryReport . getResponseCode ( ) ;
        if ( responseCode == 0 ) {
          logger . info ( "Performing new scan of " + patchFile + "." ) ;
          ScanFile scanFile = vApi . scanFile ( patchFile , apikey ) ;
          logger . info ( "VirusTotal Response: " + scanFile . getVerboseMsg ( ) ) ;
          logger . info ( "Report will be rendered at: " + scanFile . getPermalink ( ) ) ;
          binaryReport = vApi . binaryReport ( sha256hash , apikey ) ;
        }
        if ( responseCode == - 2 ) {
          logger . info ( "Report job still queued.." ) ;
        }
        if ( responseCode == 1 ) {
          logger . info ( "Report found, job complete." ) ;
          break ;
        }
      }
      int positives = binaryReport . getPrespositives ( ) ;
      if ( positives == 0 ) {
        negativeReport ( binaryReport , sha256hash , project , patchFile ) ;
      }
      else {
        positiveReport ( binaryReport , sha256hash , project , patchFile ) ;
      }
    }
        public boolean updateEntry(String packagename, int permission){
    		if(packagename==null){
        		throw new IllegalArgumentException("Table " + TABLE_PERMISSIONS);
        	}
        	
    		String[] projection = {FIELD_PACKAGEID, FIELD_PERMISSION};
    		String selection = FIELD_PACKAGEID + " = ? ";
    		String[] selectionArgs = {packagename}; 
    		boolean bContains = contains(TABLE_PERMISSIONS, projection, selection, selectionArgs, null);
    
    		ContentValues cv = new ContentValues();
    		cv.put(FIELD_PERMISSION, permission);
    		
    		SQLiteDatabase db = null;
    		try{
    			db = mDatabaseHelper.getWritableDatabase();
    			if(bContains){
    				db.update(TABLE_PERMISSIONS, cv, selection, selectionArgs);
    			} else {	
    				cv.put(FIELD_PACKAGEID, packagename);
    				db.insert(TABLE_PERMISSIONS, new String(), cv);
    			}
    
    		} finally {
    /*			if(db!=null){
    				db.close();
    			}*/
    		}
    		return true;
    	}
        private AnimatedProgressBar getAnimatedProgressBar() {
    		if (animatedProgressBar == null) {
    			animatedProgressBar = new AnimatedProgressBar();
    			animatedProgressBar.setVisible(false);
    		}
    		return animatedProgressBar;
    	}
    }
}