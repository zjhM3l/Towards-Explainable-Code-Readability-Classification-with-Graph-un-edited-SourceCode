class Test {
    public class Example {
    private final static TypeDecl mostSpecificSuperClass(final TypeDecl t){
      HashSet superTypes=new HashSet();
      addSuperClasses(t,superTypes);
      if (superTypes.isEmpty())   return t.typeObject();
      ArrayList result=new ArrayList(superTypes.size());
      result.addAll(superTypes);
      greatestLowerBounds(result);
      if (result.size() == 1)   return (TypeDecl)result.get(0);
     else   return (TypeDecl)t.typeObject();
    }
        public boolean hasFacet(String name) {
            if (name == null) return false;
            for (int i = 0; i < facets.size(); i++) {
                Facet facet = (Facet) facets.get(i);
                if (name.equals(facet.getName())) return true;
            }
            return false;
        } //-- hasFacet
        public boolean checkParameter() {
    		boolean good = true;
    
    		// out
    		File tmp = new File(outField.getText());
    		if (tmp.exists())
    		{
    			outPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
    			outPanel.setBorder(BorderFactory.createTitledBorder(outPanel.getBorder(), PARAMETER_TITLE));
    			good = false;
    		}
    
    		return good;
    	}
    }
}