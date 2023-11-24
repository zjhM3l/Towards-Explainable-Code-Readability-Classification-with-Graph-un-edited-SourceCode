class Test {
    public class Example {
    public void addExternalJar(File path) {
            if (path.exists()) {
                if (path.isDirectory()) {
                    File[] mFiles = path.listFiles();
                    for (int bFile = 0; bFile < mFiles.length; bFile++) {
                        addExternalJar(mFiles[bFile]);
                    }                
                }
                else if (path.getName().endsWith(".jar")){
                    cExternalJars.add(path);
                }
            }
        }
        public void setDestinatario_Log__r(com.sforce.soap.enterprise.sobject.Destinatario_Log__c param){
                                
                                           if (param != null){
                                              //update the setting tracker
                                              localDestinatario_Log__rTracker = true;
                                           } else {
                                              localDestinatario_Log__rTracker = true;
                                                  
                                           }
                                       
                                                this.localDestinatario_Log__r=param;
                                        
    
                                   }
        public static final Parcelable . Creator < ID > CREATOR = new Parcelable . Creator < ID > ( ) {
      public ID createFromParcel ( Parcel in ) {
        ID id = new ID ( ) ;
        id . readFromParcel ( in ) ;
        String value = in . readString ( ) ;
        if ( value . contains ( ":" ) ) {
          id . type = value . toUpperCase ( ) ;
        }
        return id ;
      }
      public ID [ ] newArray ( int size ) {
        return new ID [ size ] ;
      }
    }
    }
}