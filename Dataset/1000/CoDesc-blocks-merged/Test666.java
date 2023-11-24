class Test {
    public class Example {
    public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (g instanceof Graphics2D) {
                paintMethod.paint((Graphics2D) g);
            } else {
                System.err.println(
                    "Error : TreeMap 2.0 requires Java 1.2 " + "or superior.");
                System.exit(1);
            }
        }
        public ConstantInfo getConstant(int index) {
            if (mIndexedConstants == null) {
                throw new IllegalStateException
                    ("Constant pool indexes have not been assigned");
            }
    
            return mIndexedConstants.get(index);
        }
        void storeUserName(NamedBean t,Element elem){
      String uname=t.getUserName();
      if (uname != null && uname.length() > 0) {
        elem.setAttribute("userName",uname);
        elem.addContent(new Element("userName").addContent(uname));
      }
    }
    }
}