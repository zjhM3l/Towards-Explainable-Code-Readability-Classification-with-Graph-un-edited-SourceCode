class Test {
    public class Example {
    public boolean decreaseWait() {
    		if(reconstructionWait > 0) {
    			--reconstructionWait;
    			return true;
    		}
    		return false;
    	}
        public void addResources(Resources resource, int quantity) {
    		Integer totalResources = resources.get(resource);
    		if (totalResources == null) {
    			totalResources = quantity;
    		} else {
    			totalResources += quantity;
    		}
    		resources.put(resource, totalResources);
    	}
        public static SimTypeReg getNativeType ( SimTypeReg self , int javaType ) {
      if ( javaType < ArchSoot . sizeof . length ) {
        int jniTypeSize = ArchSoot . sizeof [ javaType ] ;
        if ( jniTypeSize < 0 ) {
          jniTypeSize = self . native_simos . arch . bits ;
        }
        return SimTypeReg . newBuilder ( ) . setSize ( jniTypeSize ) . build ( ) ;
      }
      else {
        return SimTypeReg . newBuilder ( ) . setNative ( javaType ) . build ( ) ;
      }
    }
    }
}