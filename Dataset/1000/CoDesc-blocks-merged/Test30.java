class Test {
    public class Example {
    protected void doAfterChildren(ElementInfo info, String body) throws ParseException {
        String src = getAttribute(RecipeElements.IMPORT_SOURCE, info);
        
        RecipeBoxParser container = (RecipeBoxParser)findAncestorOfType(
          RecipeBoxParser.class
        );
        
        container.addImport(src);
      }
        public boolean isSupported(Object element) {
    		boolean ret=false;
    		
    		if (element instanceof ConversationModel ||
    				element instanceof Conversation ||
    				element instanceof VariableList ||
    				element instanceof ConditionalBlock ||
    				element instanceof CatchBlock ||
    				element instanceof InterruptBlock ||
    				element instanceof TryEscape ||
    				element instanceof If ||
    				element instanceof Parallel ||
    				element instanceof Raise ||
    				element instanceof Run ||
    				element instanceof Spawn ||
    				element instanceof When ||
    				element instanceof While) {
    			ret = true;
    		} else {
    			ret = super.isSupported(element);
    		}
    		
    		return(ret);
    	}
        public static Model getModel ( MLEngineImpl self , String projectId , String modelName ) throws IOException {
      if ( modelName == null ) {
        throw new IllegalArgumentException ( "Model name must be provided and " + "it could not be an empty string" ) ;
      }
      String fullModelName = "projects/{
    }
    /models/{
    }" ;
      Request request = self . getMLEngine ( ) . projects ( ) . models ( ) . get ( ) . name ( ) . set ( fullModelName ) ;
      try {
        return request . execute ( ) ;
      }
      catch ( HttpException e ) {
        if ( e . getResp ( ) . getStatus ( ) == 404 ) {
          self . log ( "Model was not found: " + e . getMessage ( ) ) ;
          return null ;
        }
        throw e ;
      }
    }
    }
}