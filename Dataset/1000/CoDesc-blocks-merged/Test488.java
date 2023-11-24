class Test {
    public class Example {
    public void moveResource(String source, String destination) throws CmsException {
        CmsResource res = readFileHeader(source);
        I_CmsResourceType rt = getResourceType(res.getType());
        rt.moveResource(this, source, destination);
    }
        public static Section setPidFile ( Section self , String fpath , boolean beforePrivDrop , boolean safe ) {
      String command = "pidfile" ;
      if ( ! beforePrivDrop ) command += "2" ;
      if ( safe ) command = "safe-" + command ;
      self . set ( command , fpath ) ;
      return self . mSection ;
    }
        public void link(Entity from, Entity to) {
    		if (!note2Meta_.containsKey(to)) {
    			note2Meta_.put(to, new HashSet());
    		}
    		if (!meta2Note_.containsKey(from)) {
    			meta2Note_.put(from, new HashSet());
    		}
    		((HashSet) note2Meta_.get(to)).add(from);
    		((HashSet) meta2Note_.get(from)).add(to);
    	}
    }
}