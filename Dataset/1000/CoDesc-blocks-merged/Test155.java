class Test {
    public class Example {
    public void setBiblioXML(java.lang.String biblioXML) {
            try{
                //  System.out.println("setBiblioXML "+biblioXML);
                if(!biblioXML.trim().equals("")){
                    org.jdom.Element root=newgen.presentation.component.NewGenXMLGenerator.getInstance().getRootElement(biblioXML);
                    tfAffilitaion.setText(utility.getTestedString(root.getChildText("Affliation")));
                    cbRelatorTermMEPN.setSelectedItem(utility.getTestedString(root.getChildText("RelatorTerm")));
                    //System.out.println("in ifjkjksd sdf      "+ utility.getTestedString(root.getChildText("Affliation")));
                }
                
            }catch(Exception e){e.printStackTrace();}
            
            
            
        }
        @Override public boolean visit(boolean ignoreLastVisited,Visitor v) throws IgniteCheckedException {
      if (!state.compareAndSet(State.READING_WRITING,State.VISITING)) {
        assert state.get() != State.CLOSING;
        return false;
      }
      AtomicLongArray tbl0=oldTbl;
      for (int i=0; i < tbl0.length(); i++) {
        long meta=tbl0.get(i);
        while (meta != 0) {
          long valPtr=value(meta);
          long lastVisited=ignoreLastVisited ? 0 : lastVisitedValue(meta);
          if (valPtr != lastVisited) {
            v.onKey(key(meta),keySize(meta));
            lastVisitedValue(meta,valPtr);
            do {
              v.onValue(valPtr + 12,valueSize(valPtr));
              valPtr=nextValue(valPtr);
            }
     while (valPtr != lastVisited);
          }
          meta=collision(meta);
        }
      }
      state(State.VISITING,State.READING_WRITING);
      return true;
    }
        public boolean accept(File f){
      if (f != null) {
        if (f.isDirectory()) {
          return true;
        }
        String extension=getExtension(f);
        if ((extension != null) && (filters.get(getExtension(f)) != null)) {
          return true;
        }
      }
      return false;
    }
    }
}