class Test {
    public class Example {
    private JMenuItem getJMenuItemHelp() {
    		if (jMenuItemHelp == null) {
    			jMenuItemHelp = new JMenuItem();
    			jMenuItemHelp.setText(Messages.getString("MainFrame.menu.helpImpl")); //$NON-NLS-1$
    			jMenuItemHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
    			registerAction(jMenuItemHelp, Actions.HELP);
    		}
    		return jMenuItemHelp;
    	}
        public static Status createStatus ( API self , String sha , String state , String targetUrl , String description , String context ) {
      String json = null ;
      if ( sha != null && state != null ) {
        JSONObject jsonObject = null ;
        jsonObject = new JSONObject ( ) ;
        jsonObject . put ( "state" , state ) ;
        jsonObject . put ( "targetUrl" , targetUrl ) ;
        jsonObject . put ( "description" , description ) ;
        jsonObject . put ( "context" , context ) ;
        String url = buildUrl ( "statuses" , sha , baseUrl ) ;
        removeNull ( jsonObject ) ;
        json = self . json ( self . post ( url , jsonObject ) , 201 ) ;
      }
      return json == null ? null : Status . valueOf ( json ) ;
    }
        public static String generateAccessCode ( ) {
      int length = 6 ;
      char [ ] chars = Strings . toUpperCase ( Strings . toString ( 1 ) ) . toCharArray ( ) ;
      return getRandomString ( length , chars ) ;
    }
    }
}