class Test {
    public class Example {
    public Boolean listen(final Object[] r, final List bindings) {
    		Object[] retobj = new Object[2];
    		if (((String) r[0]).equals("action"))
    			((javax.swing.AbstractButton) r[1]).addActionListener(adaptor);
    		else if (((String) r[0]).equals("change"))
    			((javax.swing.AbstractButton) r[1]).addChangeListener(adaptor);
    		else if (((String) r[0]).equals("mouse"))
    			((java.awt.Component) r[1]).addMouseListener(adaptor);
    		retobj[0] = r[0];
    		retobj[1] = r[1];
    		bindings.add(retobj);
    		return Boolean.TRUE;
    	}
        public static final ACL REPLICATION = new ACL ( ) {
      @ Override public String toString ( ) {
        return "replication" ;
      }
      @ Override public boolean hasPermission ( Authentication self , Permission ... perms ) {
        Map < String , Object > params = new HashMap < String , Object > ( ) ;
        params . put ( "dc" , self . getOwner ( ) ) ;
        return true ;
      }
    }
        public ScrollBar getHorizontalScrollBar() {
    	if (hBar == null)
    		createHorizontalScrollBar();
    	return hBar;
    }
    }
}