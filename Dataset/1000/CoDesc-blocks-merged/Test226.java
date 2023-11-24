class Test {
    public class Example {
    public String toSQL(String columnPrefix, Map<String, String> typeReplacement) {
        	String theType = type;
        	if (typeReplacement != null && typeReplacement.containsKey(theType)) {
        		theType = typeReplacement.get(theType);
        	}
            return (columnPrefix == null? "": columnPrefix) + name + " " + theType + (length == 0? "" : 
            	"(" + length + (precision >= 0? ", " + precision : "") + ")");
        }
        @DSGenerator(tool_name="Doppelganger",tool_version="2.0",generated_on="2014-09-03 15:01:22.959 -0400",hash_original_method="51BAA3E17EE281D8C69C752DD3177A5C",hash_generated_method="762D67DB16D12CF9875B7202BDE6AA91") public Phaser(Phaser parent,int parties){
      if (parties >>> PARTIES_SHIFT != 0)   throw new IllegalArgumentException("Illegal number of parties");
      int phase=0;
      this.parent=parent;
      if (parent != null) {
        final Phaser root=parent.root;
        this.root=root;
        this.evenQ=root.evenQ;
        this.oddQ=root.oddQ;
        if (parties != 0)     phase=parent.doRegister(1);
      }
     else {
        this.root=this;
        this.evenQ=new AtomicReference<QNode>();
        this.oddQ=new AtomicReference<QNode>();
      }
      this.state=(parties == 0) ? (long)EMPTY : ((long)phase << PHASE_SHIFT) | ((long)parties << PARTIES_SHIFT) | ((long)parties);
    }
        public SIMPIterator getRemoteMessageRequestIterator()
      {
        if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled())
          SibTr.entry(tc, "getRemoteMessageRequestIterator");
          
        // Create the iterator over the AIStream
        AIStreamIterator aiStreamIterator = new AIStreamIterator(aiStream);
        
        if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled())
              SibTr.exit(tc, "getRemoteMessageRequestIterator", aiStreamIterator);
                  
        return aiStreamIterator;
      }
    }
}