class Test {
    public class Example {
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
    		super.collectNewChildDescriptors(newChildDescriptors, object);
    
    		newChildDescriptors.add
    			(createChildParameter
    				(MarkingPackage.eINSTANCE.getIMarkingExtensionNode_Attributes(),
    				 MarkingFactory.eINSTANCE.createIExtensionAttribute()));
    	}
        public boolean isApplicableTo(Influence inf) {
            if (inf == null) 
                return false;
            try {
                @SuppressWarnings("unused") 
                StringMulticastInfluence i = (StringMulticastInfluence)inf;
                return true;
            } 
            catch (ClassCastException e) {
                return false;
            }
        }
        public byte[] createSingleByteArray() {
    
    		byte[] buf = new byte[totalSize];
    
    		int pos = 0;
    
    		for (Triple<byte[],Integer,Integer> t : buffers) {
    
    			System.arraycopy(t.getValue1(), t.getValue2().intValue(), buf, pos, t.getValue3().intValue());
    
    			pos += t.getValue3().intValue();
    
    		}
    
    		return buf;
    
    	}
    }
}