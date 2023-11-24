class Test {
    public class Example {
    public static void deleteNode(Element compViewNode, IPerson person) throws PortalException {
            String ID = compViewNode.getAttribute(Constants.ATT_ID);
    
            if (ID.startsWith(Constants.FRAGMENT_ID_USER_PREFIX)) // ilf node
            DeleteManager.addDeleteDirective(compViewNode, ID, person);
            else {
                // plf node
                Document plf = (Document) person.getAttribute(Constants.PLF);
                Element node = plf.getElementById(ID);
    
                if (node == null) return;
                Element parent = (Element) node.getParentNode();
                if (parent == null) return;
                parent.removeChild(node);
            }
        }
        public int get(DateTime fd, DateTime td) {
        setFromDate(fd);
        setToDate(td);
        return get();
      }
        public int getLigature(int cp1, int cp2) {
    
            TfmCharInfoWord[] ciwArray = charinfo.getCharinfoword();
            if (cp1 < 0 || cp1 >= ciwArray.length) {
                return -1;
            }
            TfmCharInfoWord ciw = ciwArray[cp1];
            if (ciw == null || !foundLigKern(ciw) || ligKernTable == null) {
                return -1;
            }
    
            return ciw.getLigature(cp2);
        }
    }
}