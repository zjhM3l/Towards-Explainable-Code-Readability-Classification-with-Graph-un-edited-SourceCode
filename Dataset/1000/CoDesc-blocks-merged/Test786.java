class Test {
    public class Example {
    int specialFind(int startPos, int position)
      {
              // We have to look all the way up the ancestor chain
              // to make sure we don't have an ancestor.
              int ancestor = startPos;
              while(ancestor > 0)
              {
                    // Get the node whose index == ancestor
                    ancestor*=slotsize;
                    int chunkpos = ancestor >> lowbits;
                    int slotpos = ancestor & lowmask;
                    int[] chunk = chunks.elementAt(chunkpos);
                                                            
                    // Get that node's parent (Note that this assumes w[1]
                    // is the parent node index. That's really a DTM feature
                    // rather than a ChunkedIntArray feature.)
                    ancestor = chunk[slotpos + 1];
    
                    if(ancestor == position)
                             break;
              }
    
              if (ancestor <= 0) 
              {
                      return position;
              }
              return -1;
      }
        public static String toSepList(Iterator stringIter,String sep){
      StringBuilder sb=new StringBuilder();
      if (stringIter.hasNext()) {
        sb.append((String)stringIter.next());
      }
      while (stringIter.hasNext()) {
        sb.append(sep);
        sb.append((String)stringIter.next());
      }
      return sb.toString();
    }
        private void initialize() {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setTitle(Messages.getString("ChannelSearchInputDialog.0")); //$NON-NLS-1$
        this.setSize(400, 282);
        this.setContentPane(getJContentPane());
      }
    }
}