class Test {
    public class Example {
    @Override public boolean load(Element sharedBlocks,Element perNodeBlocks) throws JmriConfigureXmlException {
      boolean result=true;
      try {
        if (sharedBlocks.getChild("defaultspeed") != null) {
          String speed=sharedBlocks.getChild("defaultspeed").getText();
          if (speed != null && !speed.equals("")) {
            InstanceManager.getDefault(jmri.BlockManager.class).setDefaultSpeed(speed);
          }
        }
      }
     catch (  IllegalArgumentException ex) {
        log.error(ex.toString());
      }
      List<Element> list=sharedBlocks.getChildren("block");
      if (log.isDebugEnabled()) {
        log.debug("Found " + list.size() + " objects");
      }
      for (int i=0; i < list.size(); i++) {
        Element block=list.get(i);
        loadBlock(block);
      }
      return result;
    }
        public static Map parsInGroups ( Parameter self ) {
      Parameter [ ] pargp = self . getParGroups ( ) ;
      Map allpars = Maps . newHashMap ( ) ;
      for ( Parameter cpg : pargp ) {
        allpars . put ( cpg , new ArrayList < Integer > ( ) ) ;
      }
      return allpars ;
    }
        private JPanel getJComboBoxPanel() {
    		if (jComboBoxPanel == null) {
    			GridBagConstraints gridBagConstraints = new GridBagConstraints();
    			gridBagConstraints.fill = GridBagConstraints.VERTICAL;
    			gridBagConstraints.weightx = 1.0;
    			jComboBoxPanel = new JPanel();
    			jComboBoxPanel.setLayout(new GridBagLayout());
    			jComboBoxPanel.add(jLabelEvents, new GridBagConstraints());
    			jComboBoxPanel.add(getJComboBoxViewSelect(), gridBagConstraints);
    			
    		}
    		return jComboBoxPanel;
    	}
    }
}