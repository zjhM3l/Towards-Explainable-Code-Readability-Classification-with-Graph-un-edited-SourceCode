class Test {
    public class Example {
    public void setIsotopeListRef(String value) throws RuntimeException {
            StringSTAttribute att = null;
            if (_att_isotopelistref == null) {
                _att_isotopelistref = (StringSTAttribute) attributeFactory.getAttribute("isotopeListRef", "atom");
                if (_att_isotopelistref == null) {
                    throw new RuntimeException("BUG: cannot process attributeGroupName : isotopeListRef probably incompatible attributeGroupName and attributeName");
                }
            }
            att = new StringSTAttribute(_att_isotopelistref);
            super.addRemove(att, value);
        }
        protected Element writeIntToXML(Element parent,int o,String name) throws Exception {
      Element node;
      if (DEBUG) {
        trace(new Throwable(),name);
      }
      m_CurrentNode=parent;
      node=addElement(parent,name,Integer.TYPE.getName(),true);
      node.appendChild(node.getOwnerDocument().createTextNode(new Integer(o).toString()));
      return node;
    }
        public void start() {
            System.out.println("***** "+getDescription());
            DomoMessage msg = getRuleDomoMessage(rule);
            scheduler.schedule(new RuleTask(brain, msg), new DailyIterator(hourOfDay, minute, second));
    
        }
    }
}