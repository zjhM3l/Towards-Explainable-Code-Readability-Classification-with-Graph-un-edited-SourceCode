class Test {
    public class Example {
    private void generateAppsXML(Sequences p) throws NullEntity, NotFound, NotInitialised {
    		GraphEntity[] apps = Utils.generateEntitiesOfType("Application",getBrowser());
    		Hashtable appcomponents = this.getComponents();
    		for (int k = 0; k < apps.length; k++) {
    			this.generateApp(p, apps[k], appcomponents);
    		}
    		apps = Utils.generateEntitiesOfType("InternalApplication",getBrowser());
    		for (int k = 0; k < apps.length; k++) {
    			this.generateApp(p, apps[k], appcomponents);
    		}
    		apps = Utils.generateEntitiesOfType("EnvironmentApplication",getBrowser());
    		for (int k = 0; k < apps.length; k++) {
    			this.generateApp(p, apps[k], appcomponents);			
    		}
    	}
        public TokenScanner(IScanner scanner,Document document){
      fScanner=scanner;
      fEndPosition=fScanner.getSource().length - 1;
      fDocument=document;
    }
        private JPanel getJPanel1() {
    		if (jPanel1 == null) {
    			jPanel1 = new JPanel();
    			jPanel1.setLayout(null);
    			jPanel1.setBounds(new Rectangle(13, 77, 240, 136));
    			jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Time", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
    			jPanel1.add(getJPanel(), null);
    			jPanel1.add(getRateSlider(), null);
    			jPanel1.add(getRealTimeButton(), null);
    		}
    		return jPanel1;
    	}
    }
}