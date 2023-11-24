class Test {
    public class Example {
    protected IPath getAbsolutePath(IPath parent, String refinement) {
    		// get the path from the refinement
    		IPath path = new Path(refinement);
    		if (path.isAbsolute() == false) {
    			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
    			IFile file = root.getFile(parent);
    			path = file.getParent().getFullPath().append(path);
    		}
    
    		return path;
    	}
        public TemplateModel exec( List<TemplateModel> arguments ) throws TemplateModelException {
            if( arguments.size() != 1 ) {
                throw new TemplateModelException( "FilterTransform takes exactly one argument" );
            }
    
            TemplateModel model = arguments.get( 0 );
    
            if( model instanceof TemplateMethodModel ) {
                return new FilterTransform1( (TemplateMethodModel) model );
            } else if( model instanceof TemplateMethodModel2 ) {
                return new FilterTransform2( (TemplateMethodModel2) model );
            } else {
                throw new TemplateModelException( "FilterTransform takes a method model" );
            }
        }
        public Named getAnyNamedObject(String name) {
        if (name == "") return null;
        Named object = (Named)findOwnObject(name);
        if (object != null) return object;
        else {//find an original that has not changed
          //Debug.noteln("AUISetEd: looking in originals for",name);
          object = getStringOriginal(name);
          if (!isCurrentNamedObject(object)) //!name.equals(object.getName())
    	object = null;
          //Debug.noteln(" found", object);
          return object;
        }
      }
    }
}