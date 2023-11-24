class Test {
    public class Example {
    public ContainsExpression (Element e, ComparableResourcesPool requestedResourcesPool) throws InvalidQueryException {
            super(e, requestedResourcesPool);
            System.out.println("createing contains expr ");
            searchedText = e.getTextTrim();
        }
        public static void hasPerm ( Service self , Service service , String permName , Object obj , String callName ) throws ServiceException {
      User user = service . getUser ( ) ;
      if ( ! ( permName == null ) ) {
        if ( ! user . hasPerm ( permName , obj ) ) {
          LOG_PERM . warn ( String . format ( "User %s has no permission %s. Access to %s with obj=%s" , user , permName , callName , obj ) ) ;
          throw new ServiceException ( String . format ( "User %s has no permission %s for object %s" , service . getUser ( ) , permName , obj ) ) ;
        }
        LOG_PERM . debug ( String . format ( "User %s was authorized to access %s with permission %s with obj=%s" , user , callName , permName , obj ) ) ;
      }
    }
        protected void jbInit() throws Exception {
      mainPanel.setLayout(new java.awt.BorderLayout());
      setLayout(new java.awt.BorderLayout());
      southPanel.setLayout(southLayout);
      southPanel.add(confirmPanel,BorderLayout.CENTER);
      southPanel.add(statusBar,BorderLayout.SOUTH);
      mainPanel.add(southPanel,BorderLayout.SOUTH);
      mainPanel.add(parameterPanel,BorderLayout.NORTH);
      mainPanel.add(scrollPane,BorderLayout.CENTER);
      scrollPane.getViewport().add(p_table,null);
      confirmPanel.addActionListener(this);
      confirmPanel.getResetButton().setVisible(hasReset());
      confirmPanel.getCustomizeButton().setVisible(hasCustomize());
      confirmPanel.getHistoryButton().setVisible(hasHistory());
      confirmPanel.getZoomButton().setVisible(hasZoom());
      JButton print=ConfirmPanel.createPrintButton(true);
      print.addActionListener(this);
      confirmPanel.addButton(print);
      popup.add(calcMenu);
      calcMenu.setText(Msg.getMsg(Env.getCtx(),"Calculator"));
      calcMenu.setIcon(new ImageIcon(org.compiere.Adempiere.class.getResource("images/Calculator16.gif")));
      calcMenu.addActionListener(this);
      p_table.getSelectionModel().addListSelectionListener(this);
      enableButtons();
    }
    }
}