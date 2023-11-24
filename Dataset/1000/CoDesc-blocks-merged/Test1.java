class Test {
    public class Example {
    public Criteria example(Criteria criteria, T example, Attribute<T, ?>... usingAttributes) {
    
            if (criteria == null) {
                criteria = criteria();
            }
    
            if (usingAttributes == null || usingAttributes.length == 0) {
                throw new RuntimeException("Please provide attributes to example criteria.");
            }
    
            for (Attribute<T, ?> usingAttribute : usingAttributes) {
                if (usingAttribute instanceof SingularAttribute) {
                    addEqExampleRestriction(criteria, example, usingAttribute);
                } else if (usingAttribute instanceof PluralAttribute) {
                    addInExampleRestriction(criteria, example, usingAttribute);
                }
    
            }
    
            return criteria;
        }
        public void setActiveEditor(final IMainTracer part) {
    		if (part instanceof IMainTracer) {
    			mainTracer = (IMainTracer) part;
    			evaluateState();
    		} else { // shouldn't happen
    			mainTracer = null;
    		}
    
    	}
        public void register(Page page) {
            super.register(page);
            page.setVisibleDefault(m_noSelection, true);
            page.setVisibleDefault(m_categoryPanel, false);
            page.addActionListener(this);
        }
    }
}