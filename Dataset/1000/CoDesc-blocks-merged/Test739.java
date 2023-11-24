class Test {
    public class Example {
    public static void addInput ( Input self , Input input_ ) {
      if ( input_ == null ) {
        throw new NullPointerException ( "`input_` must not be null" ) ;
      }
      self . inputs . add ( input_ ) ;
    }
        public void onSurfaceChanged(GL10 gl, int width, int height) {
    		gl.glViewport(0, 0, width, height);
    
    		/*
    		 * set up projection matrix (frustum-definition)
    		 */
    		float ratio = (float) width / height;
    		gl.glMatrixMode(GL10.GL_PROJECTION);
    		gl.glLoadIdentity();
    		gl.glFrustumf(-ratio, ratio, -1, 1, l.getZNear(), l.getZFar());
    
    	}
        protected void addStartNodePropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_Arc_startNode_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_Arc_startNode_feature", "_UI_Arc_type"),
    				 ModelsPackage.Literals.ARC__START_NODE,
    				 true,
    				 false,
    				 true,
    				 null,
    				 null,
    				 null));
    	}
    }
}