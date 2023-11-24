class Test {
    public class Example {
    protected String processLine(String aLine){
        //use a tokenizer to separate the words 
        StringTokenizer tokenizer = new StringTokenizer(aLine," ,.;:?!",true);
        StringBuilder sb = new StringBuilder();
        while ( tokenizer.hasMoreTokens() ){
            String tk = tokenizer.nextToken();
            if (!tk.matches("[. ,:;!?]")) { // is a word
                sb.append(";;"+ tk + "\n");
                sb.append(Converter.convert(tk)+"\n");
            } else if (!" ".equals(tk)) {
                sb.append("_ 100\n_ 50\n");
            }
        }
        //(no need for finally here, since String is source)
        return (sb.toString());
      }
        private static boolean isSeparator(char character, char... separators)
    
      {
    
        if(separators.length == 0) {
    
          separators = DEFAULT_SEPARATORS;
    
        }
    
        for(int i = 0; i < separators.length; ++i) {
    
          if(character == separators[i]) {
    
            return true;
    
          }
    
        }
    
        return false;
    
      }
        public AllocTypeThreadTraceRef getAllocTypeThreadTrace(TypeRef peer) {
            ListIterator itr =  getAllocTypeThreadTraces().listIterator();
            AllocTypeThreadTraceData obj; 
            
            while (itr.hasNext()) {
                obj =  (AllocTypeThreadTraceData) itr.next();
                if ( obj.getType().equals( peer ) )
                    return obj;
            }
            return null;
        }
    }
}