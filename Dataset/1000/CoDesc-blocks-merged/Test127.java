class Test {
    public class Example {
    @DSGenerator(tool_name="Doppelganger",tool_version="2.0",generated_on="2013-12-30 12:56:52.475 -0500",hash_original_method="610737304108759554633F933F40913E",hash_generated_method="550FDCCC3D0D68E65A1A01B4F9B772A4") public boolean hasListeners(String propertyName){
      for (  PropertyChangeListener p : listeners) {
        if (!(p instanceof PropertyChangeListenerProxy) || Objects.equal(propertyName,((PropertyChangeListenerProxy)p).getPropertyName())) {
          return true;
        }
      }
      return false;
    }
        public Reader getReader() throws IOException {
           // we want to remove the BOM windows adds from a file if the encoding is UTF-8
           // in other cases we depend on the charsets 
           Charset cs = Charset.forName(configuration.getSourceEncoding());
           InputStream in = new BufferedInputStream(new FileInputStream(file));
           if (UTF8.name().equalsIgnoreCase(cs.name())) {
               in.mark(3);
               boolean hasBOM = true;
               try {
                   int i = in.read();
                   hasBOM &= i == 0xEF;
                   i = in.read();
                   hasBOM &= i == 0xBB;
                   i = in.read();
                   hasBOM &= i == 0xFF;
               } catch (IOException ioe) {
                   hasBOM= false;
               }
               if (!hasBOM) in.reset();
           }
           return new InputStreamReader( in, cs );
        }
        public void onRemove(Object objKey) {
            Long sz = (Long)sizeContribMap.get(objKey);
            if (null != sz) {
                sizeInBytes -= sz.longValue();
            }
        }
    }
}