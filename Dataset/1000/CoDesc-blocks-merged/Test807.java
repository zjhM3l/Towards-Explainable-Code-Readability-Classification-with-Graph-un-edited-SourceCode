class Test {
    public class Example {
    public void reset() {
    		SharedPreferences settings = PreferenceManager
    				.getDefaultSharedPreferences(mContext);
    		SharedPreferences.Editor editor = settings.edit();
    		editor.putInt("CalibSlow", CALIB_DEFAULT);
    
    		editor.putInt("CalibFast", CALIB_DEFAULT);
    		editor.commit();
    		mCaliberationValue = CALIB_DEFAULT;
    	}
        public static void enumerateChunks ( String phrase , Sponynlp nlp ) {
      if ( ( phrase . length ( ) > 1 ) && ( phrase . charAt ( 0 ) == ' ' ) ) {
        boolean found = false ;
        String text = " " + phrase ;
        Sponydoc doc = nlp . parse ( text . trim ( ) , Parse . parse ( text ) ) ;
        for ( Nun np : doc . nounChunks ) {
          if ( np . text != text ) {
            found = true ;
            yield ( np . text , findChunk ( phrase , np . text . toCharArray ( ) ) ) ;
          }
        }
        if ( ! found && Arrays . asList ( phrase . split ( " " ) ) . contains ( "v" ) ) yield ( text , phrase ) ;
      }
    }
        public EOCustomObject createSavedObject(String anEntityName) {
            EOEntity entity = EOUtilities.entityNamed(this, anEntityName);
            EOEnterpriseObject object = entity.classDescriptionForInstances().createInstanceWithEditingContext(this, null);
            if (!(object instanceof EOCustomObject))
                throw new IllegalArgumentException("The entity is not an EOCustomObject and can't be used with createSavedObject().");
            return insertSavedObject((EOCustomObject)object);
        }
    }
}