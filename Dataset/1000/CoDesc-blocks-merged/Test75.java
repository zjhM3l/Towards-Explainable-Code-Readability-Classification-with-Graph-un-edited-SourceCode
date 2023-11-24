class Test {
    public class Example {
    public Variation createVariation() {
    
            // Create the resource
            //
            Variation aVar = null;
            try {
                aVar = getSharedFactory().createVariation();
                aVar.setIdentifier (UrnGenerator.genUuidUrn().toString());
            }
            catch (javax.xml.bind.JAXBException jxbe) {
                ;
            }
            return aVar;
    
         }  // end createVariation().
        public void setEClass(EClass newEClass) {
    		EClass oldEClass = eClass;
    		eClass = newEClass;
    		if (eNotificationRequired())
    			eNotify(new ENotificationImpl(this, Notification.SET, DependenciesPackage.ECLASS_CONTEXT__ECLASS, oldEClass, eClass));
    	}
        void appendString(JCTree tree) {
                Type t = tree.type.baseType();
                if (!t.isPrimitive() && t.tsym != syms.stringType.tsym) {
                    t = syms.objectType;
                }
                items.makeMemberItem(getStringBufferAppend(tree, t), false).invoke();
            }
    }
}