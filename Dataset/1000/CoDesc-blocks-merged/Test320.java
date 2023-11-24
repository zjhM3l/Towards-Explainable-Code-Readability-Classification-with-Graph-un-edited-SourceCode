class Test {
    public class Example {
    private void hookListener(final Composite parent) {
        this.tableViewer.addDoubleClickListener(new /**
         */
        IDoubleClickListener() {
    
          /**
           * Method doubleClick.
           * 
           * @param event
           *          DoubleClickEvent
           * @see org.eclipse.jface.viewers.IDoubleClickListener#doubleClick(DoubleClickEvent)
           */
          public void doubleClick(final DoubleClickEvent event) {
            final Object object = ((StructuredSelection) event.getSelection())
                .getFirstElement();
            if (object instanceof Disziplin) {
              final OpenDisziplinEditorAction action = new OpenDisziplinEditorAction(
                  JtafPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow(),
                  (Disziplin) object);
              action.run();
            }
          }
        });
      }
        public static void parseAll ( Parser self ) throws AllException {
      assert self . current . value . equals ( "__all__" ) ;
      self . consume ( tk . NAME ) ;
      if ( self . current . value != '=' ) throw new AllException ( "Could not evaluate contents of __all__. " ) ;
      self . consume ( tk . OP ) ;
      if ( self . current . value != '(' ) throw new AllException ( "Could not evaluate contents of __all__. " ) ;
      self . consume ( tk . OP ) ;
      self . all = new String [ self . current . value . length ( ) ] ;
      String allContent = "(" ;
      while ( self . current . kind != tk . OP || self . current . value != ')]' ) {
        if ( self . current . kind == tk . NL || self . current . value . equals ( "\n" ) ) {
        }
        else if ( self . current . kind == tk . STRING || self . current . value . equals ( "," ) ) allContent += self . current . value ;
        else throw new AllException ( "Unexpected token kind in  __all__: {
    !r}
    . " , self . current . kind ) ;
          self . stream . move ( ) ;
        }
        self . consume ( tk . OP ) ;
        allContent += ")" ;
        try {
          self . all = new String ( allContent , self . current . value . toCharArray ( ) , self . current . value . length ( ) ) ;
        }
        catch ( Throwable t ) {
          throw new AllException ( "\bThe value was {
    }
    . The exception was:\n{
    }" , allContent , t ) ;
        }
      }
        public boolean contains(IChatSender aSender) {
            boolean result = false;
            result = userList.containsKey(aSender);
            return result;
        }
    }
}