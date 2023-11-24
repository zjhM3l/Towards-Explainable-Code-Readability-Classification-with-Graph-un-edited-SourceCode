class Test {
    public class Example {
    public void registerProjectHelper(Class helperClass) throws BuildException {
            try {
                registerProjectHelper(helperClass.getConstructor(NO_CLASS));
            } catch (NoSuchMethodException e) {
                throw new BuildException("Couldn't find no-arg constructor in "
                        + helperClass.getName());
            }
        }
        private static void addLogFile ( File file ) {
      FileHandler handler = new FileHandler ( file ) ;
      handler . setLevel ( Level . ALL ) ;
      Formatter formatter = new Formatter ( ) ;
      formatter . setFormatter ( new Formatter ( ) {
        @ Override public String format ( LogRecord record ) {
          return record . getMessage ( ) ;
        }
      }
      ) ;
      handler . setFormatter ( formatter ) ;
      LogManager . getLogManager ( ) . addAppender ( handler ) ;
    }
        private JButton getBtCancelarCronologia() {
    		if (btCancelarCronologia == null) {
    			btCancelarCronologia = new JButton();
    			btCancelarCronologia.setBounds(new Rectangle(630, 560, 150, 24));
    			btCancelarCronologia.setMnemonic('v');
    			btCancelarCronologia.setText("Volver al Menu");
    			btCancelarCronologia.addActionListener(new java.awt.event.ActionListener() {
    				public void actionPerformed(java.awt.event.ActionEvent e) {
    					ControladorPrincipal.mostrarMenuEditarProyecto();
    				}
    			});
    		}
    		return btCancelarCronologia;
    	}
    }
}