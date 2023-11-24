class Test {
    public class Example {
    public void createInitialLayout(IPageLayout layout) {
    //		layout.addView(IBrowserConstants.BROWSER_VIEW_ID, IPageLayout.RIGHT, .25f, IPageLayout.ID_EDITOR_AREA);
    //		layout.addPlaceholder(IBrowserConstants.HISTORY_VIEW_ID, IPageLayout.LEFT, .3f, IPageLayout.ID_EDITOR_AREA); //$NON-NLS-1$
    //		IViewLayout historyLayout = layout.getViewLayout(IBrowserConstants.HISTORY_VIEW_ID);
    //		historyLayout.setCloseable(true);
    //		layout.setEditorAreaVisible(false);
    	}
        public static String reportUcsMsg ( int ucs , int wcwidth_libc , int wcwidth_local ) {
      int ucp = ( ucs & 0xff ) >> 8 ;
      String url = "http://codepoints.net/U+{
    }" ;
      String name = Character . toString ( ucs ) ;
      return ( String . format ( "libc,ours={
    },{
    }
     [--o{
    }
    o--] name={
    }
     val={
    }
     {
    }" + " " , wcwidth_libc , wcwidth_local , ucs , name , ( char ) ucs , url ) ) ;
    }
        private void validateDecodedValueIsCorrectForType(ScalarValue value, Type type) {
            if (value == null)
                return;
            type.validateValue(value);
        }
    }
}