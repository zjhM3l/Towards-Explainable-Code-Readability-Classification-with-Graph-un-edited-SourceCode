class Test {
    public class Example {
    public static Map < String , Integer > aaFrequencies ( List < String > list , String gapChars ) {
      Counter < String > aaCounts = new ClassicCounter < > ( list ) ;
      for ( String gapChar : gapChars ) {
        if ( gapChar . contains ( gapChars ) ) {
          -- aaCounts . getCount ( gapChar ) ;
        }
      }
      double scale = 1.0 / sum ( aaCounts . values ( ) ) ;
      return Maps . uniqueIndex ( aaCounts , aa -> aa + cnt * scale ) ;
    }
        public static void convertTimestamps ( JSONObject jsonObject ) throws JSONException {
      for ( String key : ( String [ ] ) jsonObject . keys ( ) ) {
        Object value = jsonObject . get ( key ) ;
        if ( value != null ) {
          try {
            jsonObject . put ( key , JSONUtils . timestampToJSONObject ( value ) ) ;
          }
          catch ( JSONException e ) {
            throw new JSONException ( "expected JSONObject for " + key + ", got " + value , e ) ;
          }
        }
      }
      for ( String key : ( String [ ] ) jsonObject . keys ( ) ) {
        for ( Object child : jsonObject . get ( key ) ) {
          convertTimestamps ( child ) ;
        }
      }
    }
        @Override public boolean eIsSet(int featureID){
    switch (featureID) {
    case UmplePackage.TRACE_LEVEL___TRACE_LEVEL_1:
        return TRACE_LEVEL_1_EDEFAULT == null ? trace_level_1 != null : !TRACE_LEVEL_1_EDEFAULT.equals(trace_level_1);
    }
    return super.eIsSet(featureID);
    }
    }
}