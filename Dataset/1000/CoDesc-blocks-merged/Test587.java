class Test {
    public class Example {
    public boolean isRoot_isIn() {
    		if(!this.lstIsInInited) {
    			this.lstIsInInited = true;
    			this.initLstIsIn();
    		}
    		else this.synchronize();
    		
    		return (this.lstIsIn == null || this.lstIsIn.isEmpty());
    	}
        public static < T extends Event > T getEventTags ( T self , String id , final AsyncCallback < T > callback ) {
      callback . onReturnHttpDataOnly ( ) ;
      if ( callback . isAsyncReq ( ) ) {
        return getEventTagsWithHttpInfo ( id , callback ) ;
      }
      else {
        ( ( AsyncCallback < T > ) callback ) . onSuccess ( self ) ;
        return self ;
      }
    }
        public String collapse() {
            String s = "";
            s+=this.getData();
            if(this.getParent() != null) {
                s += this.getParent().collapse();
            }
            for (TreeNode<E> e : this) {
                s += e.getData().toString();
                s += e.getParent().collapse();
            }
            return s;
        }
    }
}