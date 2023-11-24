class Test {
    public class Example {
    private static void endSessions ( Client self , String ... sessionIds ) {
      try {
        try ( Socket socket = self . socketForReads ( ReadPreference . PRIMARY_PREFERRED , null ) ) {
          if ( ! socket . supportsSessions ( ) ) return ;
          for ( int i = 0 ;
          i < sessionIds . length ;
          i += CommonConstants . MAX_END_SESSIONS ) {
            SON spec = new SON ( new byte [ ] {
              ( byte ) ']' }
              ) ;
              spec . writeBytes ( sessionIds [ i ] ) ;
              sockInfo . command ( "admin" , spec , new SlaveHandshake ( socket ) , self ) ;
            }
          }
        }
        catch ( Py4JIOException e ) {
          e . printStackTrace ( ) ;
        }
      }
        private String stringHelper(GenTreeNode node) {
            if (node == null) {
                return null;
            }
    
            String s1 = stringHelper(node.leftNode);
            String s2 = node.data.toString();
            String s3 = stringHelper(node.rightNode);
    
            StringBuilder s = new StringBuilder();
            if (s1 != null) {
                s.append(s1 + " ");
            }
            s.append(s2);
            if (s3 != null) {
                s.append(" " + s3);
            }
            return s.toString();
        }
        private void initializeLiveAttributes(){
      method=createLiveAnimatedEnumeration(null,SVG_METHOD_ATTRIBUTE,METHOD_VALUES,(short)1);
      spacing=createLiveAnimatedEnumeration(null,SVG_SPACING_ATTRIBUTE,SPACING_VALUES,(short)2);
      startOffset=createLiveAnimatedLength(null,SVG_START_OFFSET_ATTRIBUTE,SVG_TEXT_PATH_START_OFFSET_DEFAULT_VALUE,SVGOMAnimatedLength.OTHER_LENGTH,true);
      href=createLiveAnimatedString(XLINK_NAMESPACE_URI,XLINK_HREF_ATTRIBUTE);
    }
    }
}