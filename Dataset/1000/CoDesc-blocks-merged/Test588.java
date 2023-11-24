class Test {
    public class Example {
    public synchronized void loadKeys(){
      try {
        PropertyInfo props=_coordinator.getPropertyInfo();
        String internalApiAlgoOverride=null;
        if (props != null) {
          internalApiAlgoOverride=props.getProperty(SYSTEM_PROPERTY_INTERNAL_API_ALGO);
        }
        _log.debug("Internal Api algo override property: " + internalApiAlgoOverride);
        if (internalApiAlgoOverride != null && internalApiAlgoOverride.equals(SYSTEM_PROPERTY_INTERNAL_API_ALGO_VALUE_NEW)) {
          _internalApiCurrentKey=getSignatureKey2(NEW_SIGNATURE_INTERNALAPI_KEY,NEW_INTERNAL_API_SIGN_ALGO);
          deleteSignatureKey(CURRENT_SIGNATURE_INTERNALAPI_KEY);
        }
     else {
          _internalApiCurrentKey=getSignatureKey2(CURRENT_SIGNATURE_INTERNALAPI_KEY,CURRENT_INTERNAL_API_SIGN_ALGO);
        }
        _interVDCCurrentKey=getSignatureKey2(SIGNATURE_INTERVDC_KEY,CURRENT_INTERVDC_API_SIGN_ALGO);
      }
     catch (  Exception e) {
        throw new IllegalStateException("Exception while retrieving key",e);
      }
      if (_internalApiCurrentKey == null) {
        throw new IllegalStateException("Key was null / Unable to get current internal api key.");
      }
      if (_interVDCCurrentKey == null) {
        throw new IllegalStateException("Key was null / Unable to get current inter vdc api key.");
      }
      _initialized=true;
      _lastUpdated.set(System.currentTimeMillis());
      return;
    }
        private static MethodHandle nan_minmax_object ( MethodHandle mh , Class < ? > type , Object value , int offset , int length ) {
      int validCount = count ( length , offset ) ;
      Object filledValue = fillObject ( value , offset ) ;
      Object data = ( ( Number ) mh . invoke ( filledValue , type ) ) . intValue ( ) ;
      if ( ! type . isPrimitive ( ) ) {
        data = type . isPrimitive ( ) ? data : type . cast ( data ) ;
        return mh . asType ( data ) ;
      }
      return whereMethod ( data , validCount != 0 ) ;
    }
        public void removeResource(Resource res) throws XMLDBException {
    
            if (res == null || res.getId() == null || res.getId().length() == 0) {
                // Query result resource will have null ID
                throw new XMLDBException(ErrorCodes.INVALID_RESOURCE,
                                         "Resource passed is null or its ID is empty.");
            }
    
            checkOpen();
            try {
                col.remove(res.getId());
            } catch (Exception e) {
                throw FaultCodes.createXMLDBException(e);
            }
        }
    }
}