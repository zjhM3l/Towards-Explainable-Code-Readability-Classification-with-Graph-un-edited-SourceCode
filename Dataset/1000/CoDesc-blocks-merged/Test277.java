class Test {
    public class Example {
    @SuppressWarnings("unchecked") private void findNext() throws IgniteCheckedException {
      curr=null;
      while (idx < docs.length) {
        Document doc;
        try {
          doc=searcher.doc(docs[idx++].doc);
        }
     catch (    IOException e) {
          throw new IgniteCheckedException(e);
        }
        ClassLoader ldr=null;
        if (ctx != null && ctx.deploy().enabled())     ldr=ctx.cache().internalCache(spaceName).context().deploy().globalLoader();
        K k=unmarshall(org.apache.commons.codec.binary.Base64.decodeBase64(doc.get(KEY_FIELD_NAME)),ldr);
        V v=type.valueClass() == String.class ? (V)doc.get(VAL_STR_FIELD_NAME) : this.<V>unmarshall(doc.getBinaryValue(VAL_FIELD_NAME),ldr);
        assert v != null;
        if (!filter(k,v))     continue;
        curr=new IgniteBiTuple<>(k,v);
        break;
      }
    }
        public String toString(){
    
        //Give as much information as possible about this exception in string format
        StringBuffer infoString = new StringBuffer("Exception:");
        infoString.append(super.toString());
        infoString.append("\n");
        infoString.append("UserMessage:");
        infoString.append(getUserErrorMessage());
        infoString.append("\n");
    
        //Give Info if internal exception has anything useful...
        if ((internalException!=null)&&(!(internalException instanceof NoUnitException))) {
          infoString.append("Original Exception:");
          infoString.append(internalException.toString());
          infoString.append("\n");
        }
    
        return infoString.toString();
    
       }
        public RFCReply get(int index) {
        boundsCheck(index);
    
        return (RFCReply) replies.get(index);
      }
    }
}