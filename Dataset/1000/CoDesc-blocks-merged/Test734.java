class Test {
    public class Example {
    private static PlotDataSolverFactory instance(){
      if (null == singleton) {
        createSingleton();
      }
      return singleton;
    }
        public void actionPerformed( ActionEvent e ) {
    			String keywords = textInputUrlTextField.getText().replaceAll( " ", "+" );
    			String queryUrl = (String) newsFeed.textInputElements.get( "link" ) + '?'
    				 + (String) newsFeed.textInputElements.get( "name" ) + '='
    				 + keywords;
    			try {
    				BrowserLauncher.openURL( queryUrl );
    			}
    			catch ( Exception ex ) {
    				ex.printStackTrace();
    			}
    		}
        public Object exec(List arguments) {
            StringBuilder  aResults = new StringBuilder( "Arguments are:<br />" );
            Iterator    iList = arguments.iterator();
    
            while( iList.hasNext() ) {
                aResults.append( (String)iList.next() );
                aResults.append( "<br />" );
            }
    
            return new SimpleScalar( aResults.toString() );
        }
    }
}