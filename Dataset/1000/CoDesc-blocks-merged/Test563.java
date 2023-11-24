class Test {
    public class Example {
    public void save() throws IOException {
            Writer out = getOutputWriter();
    
            Iterator i = groups.values().iterator();
    
            while (i.hasNext()) {
                NNTPNewsrcGroup group = (NNTPNewsrcGroup) i.next();
                group.save(out);
            }
    
            out.close();
        }
        public void createPackageContents() {
    		if (isCreated) return;
    		isCreated = true;
    
    		// Create classes and their features
    		accountEClass = createEClass(ACCOUNT);
    		createEAttribute(accountEClass, ACCOUNT__NAME);
    		createEAttribute(accountEClass, ACCOUNT__DESCRIPTION);
    		createEReference(accountEClass, ACCOUNT__TRANSACTIONS);
    		createEAttribute(accountEClass, ACCOUNT__BALANCE);
    
    		mandateEClass = createEClass(MANDATE);
    		createEAttribute(mandateEClass, MANDATE__NAME);
    		createEAttribute(mandateEClass, MANDATE__DESCRIPTION);
    		createEReference(mandateEClass, MANDATE__ACCOUNTS);
    
    		transactionEClass = createEClass(TRANSACTION);
    		createEAttribute(transactionEClass, TRANSACTION__DESCRIPTION);
    		createEAttribute(transactionEClass, TRANSACTION__AMOUNT);
    		createEAttribute(transactionEClass, TRANSACTION__CATEGORY);
    	}
        public double getScore(Context context, Criteria criteria) throws Exception {
          Signature match = signature.getSignature(context);
          
          for(String name : criteria) {
             Label label = criteria.resolve(name);
             
             if(label != null) {
                Parameter value = match.getParameter(name);
                Contact contact = label.getContact();
    
                   if(value == null) {
                   Collection<String> options = label.getNames(context);
                   
                   for(String option : options) {
                      value = match.getParameter(option);
                      
                      if(value != null) {
                         break;
                      }
                   }
                }
                if(contact.isReadOnly()) {
                   if(value == null) {
                      return -1.0;
                   }               
                }
             }
          }
          return getPercentage(context, criteria);
       }
    }
}