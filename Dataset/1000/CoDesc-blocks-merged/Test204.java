class Test {
    public class Example {
    public static ReturnInfo parseReturn ( String returnLine , boolean includeDesc ) {
      String retDef = returnLine . substring ( 0 , returnLine . indexOf ( ':' ) ) , _colon = returnLine . substring ( returnLine . indexOf ( ':' ) + 1 ) , desc = null ;
      if ( _colon . equals ( "" ) ) {
        throw new ValidationException ( "Invalid return declaration in javadoc, missing colon" , declaration ) ;
      }
      if ( ! includeDesc ) {
        desc = null ;
      }
      if ( "show-as" . equals ( retDef ) ) {
        String retType = retDef . substring ( "show-as" . length ( ) ) , _showas = retDef . substring ( "show-as" . length ( ) ) , showType = retDef . substring ( "show-as" . length ( ) ) ;
        retType = retType . trim ( ) ;
        showType = showType . trim ( ) ;
        if ( showType != "string" && showType != "context" ) {
          throw new ValidationException ( "Unkown show-as formatting specifier" , found , showType , new String [ ] {
            "string" , "context" }
            ) ;
          }
          if ( showType . equals ( "string" ) ) {
            return new ReturnInfo ( null , String . class , true , desc ) ;
          }
          return new ReturnInfo ( null , null , false , desc ) ;
        }
        if ( "format-as" . equals ( retDef ) ) {
          String retType = retDef . substring ( "format-as" . length ( ) ) , _showas = retDef . substring ( "format-as" . length ( ) ) , formatter = retDef . substring ( "format-as" . length ( ) ) ;
          retType = retType . trim ( ) ;
          formatter = formatter . trim ( ) ;
          return new ReturnInfo ( retType , formatter , true , desc ) ;
        }
        return new ReturnInfo ( retDef , null , true , desc ) ;
      }
        public void redraw (int x, int y, int width, int height, boolean all) {
    	checkWidget();
    	if (!OS.GTK_WIDGET_VISIBLE (topHandle ())) return;
    	if ((style & SWT.MIRRORED) != 0) x = getClientWidth () - width - x;
    	redrawWidget (x, y, width, height, false, all, false);
    }
        public void testIsSame3() {
            OMByteArray array1 = new OMByteArray("1234");
            OMByteArray array2 = new OMByteArray("4321");
            
            assertTrue(!array1.isSame(array2));
        }
    }
}