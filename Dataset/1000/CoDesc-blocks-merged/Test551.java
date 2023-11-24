class Test {
    public class Example {
    public static final < T > boolean extraAction ( T self , String [ ] names , String provider , String action , final Class < T > clazz ) {
      final Map < String , String > mapper = salt . cloud . Map . of ( self . optDefaults ( ) ) ;
      final Map < String , String > providers = mapper . mapProvidersParallel ( ) ;
      if ( provider . contains ( ":" ) ) {
        provider += ":{
    0}" ;
        }
        else {
          return false ;
        }
        if ( names . length == 0 ) {
          return false ;
        }
        final Map < String , String > ret = new HashMap < > ( ) ;
        for ( String name : names ) {
          final Map < String , String > extraMap = clazz . newInstance ( ) ;
          extraMap . put ( "name" , name ) ;
          extraMap . put ( "provider" , provider ) ;
          extraMap . put ( "profile" , null ) ;
          extraMap . put ( "action" , action ) ;
          ret . put ( name , salt . cloud . data . SimpleTypesFilter . filter ( mapper . extras ( extraMap ) ) ) ;
        }
        return ret . isEmpty ( ) ;
      }
        private void setLineColor(Color color) {
            setFigureAttribute(FigureAttributeConstant.FRAME_COLOR, color);
            setFigureAttribute(FigureAttributeConstant.TEXT_COLOR, color);
            lineColorShow.setColor(color);
        }
        private JComboBox getSel_OS() {
    		if (sel_OS == null) {
    			sel_OS = new JComboBox();
    			sel_OS.setBounds(new Rectangle(75, 188, 160, 21));
    			sel_OS.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    			sel_OS.setMaximumRowCount(16);
    			sel_OS.setName("sel_OS");
    			sel_OS.addActionListener(this);
    			sel_OS.setVisible(true);
    		}
    		return sel_OS;
    	}
    }
}