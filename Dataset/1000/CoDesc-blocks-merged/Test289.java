class Test {
    public class Example {
    public boolean matchesToken(BaseCodingDt theSearchParam) {
    		if (theSearchParam.isSystemPresent()) {
    			if (theSearchParam.isSystemBlank()) {
    				//  [parameter]=|[code] matches a code/value that has no system namespace
    				if (isSystemPresent() && !isSystemBlank())
    					return false;
    			} else {
    				//  [parameter]=[namespace]|[code] matches a code/value in the given system namespace
    				if (!isSystemPresent())
    					return false;
    				if (!getSystemElement().equals(theSearchParam.getSystemElement()))
    					return false;
    			}
    		} else {
    			//  [parameter]=[code] matches a code/value irrespective of it's system namespace
    			// (nothing to do for system for this case)
    		}
    
    		return getCodeElement().equals(theSearchParam.getCodeElement());
    	}
        private static void setKeychain ( YangNode self , YangNode v , boolean load ) throws YangException {
      if ( StringUtils . isNotBlank ( v . uType ( ) ) ) {
        v = v . uType ( v ) ;
      }
      try {
        YANGDynClass t = YANGDynClass . forName ( v , new YangListType ( "name_of_keychain" , Keychain . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , YangListType . class , load )
        public RecordFileList getFiles(int tableRefId, int tableId, ServiceCall call) throws java.rmi.RemoteException, DataAccessException, Exception {
    		try { 
    			startService(call);
    			RecordFileList list = rfda.getActiveFileList(tableRefId, tableId);
    			list.setReferenceDisplay(reference, security);
    			stopService(call);
    			return list;
    		} catch (Exception e) { 
    			Debug.LogException(this, e);
    			throw e;
    		}
    	}
    }
}