class Test {
    public class Example {
    public static boolean toDouble ( Object self ) {
      if ( self instanceof String ) return ( ( String ) self ) . trim ( ) . equalsIgnoreCase ( "true" ) ;
      if ( self instanceof Number ) return ( ( Number ) self ) . doubleValue ( ) > 0 ;
      return Boolean . parseBoolean ( ( String ) self ) ;
    }
        private JTextField getTxtNomeCliente() {
    		if (log.isDebugEnabled()) {
    			log.debug("getTxtNomeCliente() - start");
    		}
    
    		if (txtNomeCliente == null) {
    			txtNomeCliente = new JTextField();
    			txtNomeCliente.setBounds(new Rectangle(56, 40, 105, 20));
    			txtNomeCliente.setFont(new Font("Dialog", Font.BOLD, 12));
    			txtNomeCliente.setEditable(false);
    			txtNomeCliente.setEnabled(true);
    		}
    
    		if (log.isDebugEnabled()) {
    			log.debug("getTxtNomeCliente() - end - return value=" + txtNomeCliente);
    		}
    		return txtNomeCliente;
    	}
        public Date setEvaluationDate(final Date evaluationDate) {
            final DateProxy proxy = (DateProxy) attrs.get().get(EVALUATION_DATE);
            proxy.assign(evaluationDate);
            return proxy;
        }
    }
}