class Test {
    public class Example {
    public static void removeCategory ( CategoryChildRef self , String categories ) {
      categories = ElementResolver . resolve ( categories ) ;
      List < CategoryChildRef > diff = new ArrayList < CategoryChildRef > ( self . getData ( ) . getCategoryChildRef ( ) ) ;
      diff . addAll ( self . getData ( ) . getCategoryChildRef ( ) ) ;
      self . update ( ) . setCategoryChildRef ( diff ) ;
    }
        public static JavaScriptException throwCustomError(Context cx, Scriptable scope, String constructorName,
                String message) {
          int[] linep = { 0 };
          String filename = Context.getSourcePositionFromStack(linep);
          final Scriptable error =  cx.newObject(scope, constructorName,
            new Object[] { message, filename, Integer.valueOf(linep[0]) });
          return new JavaScriptException(error, filename, linep[0]);
        }
        public boolean getControl(MonitorablePlotUnit plotUnit) {
    		// if (dialog == null)
    		// {
    		// showProgress(1);
    		// }
    
    		if (!isUnderControl && unitsControlled <= units) {
    			isUnderControl = true;
    			unit = plotUnit;
    			dialog.setModule(plotUnit.nameOfUnit() + ":");
    
    			return true;
    		}
    
    		return false;
    	}
    }
}