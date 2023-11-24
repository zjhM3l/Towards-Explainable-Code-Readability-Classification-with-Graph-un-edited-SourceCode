class Test {
    public class Example {
    public LOCOMQueryResultImpl queryLOCompDef(Set<CompetencyGapImpl> compGap) {
    
            RetrieveLOImpl rLO = new RetrieveLOImpl();
            return rLO.getLOByCompetencyDef(compGap, _rep.getcLomont(),
                    _rep.getGcoont(), _rep.getsLomont());
    
        }
        private List getArgs(Node root) {
            List args = new ArrayList();
            NodeList children = root.getChildNodes();
    
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                String name = child.getNodeName();
                
                if (child.getNodeType() == Node.ELEMENT_NODE) {
                    if (name.equals("string")) {
                        args.add(child.getFirstChild().getNodeValue());
                    } else if (name.equals("list")) {
                        args.add(getArgs(child));
                    } else {
                        throw new IllegalArgumentException("unkown arg type: " +
                                                           name);
                    }
                }
            }
    
            return args;
        }
        private LZWDecode(ByteBuffer buf) throws PDFParseException {
      for (int i=0; i < 256; i++) {
        dict[i]=new byte[1];
        dict[i][0]=(byte)i;
      }
      dictlen=258;
      bitspercode=9;
      this.buf=buf;
      bytepos=0;
      bitpos=0;
    }
    }
}