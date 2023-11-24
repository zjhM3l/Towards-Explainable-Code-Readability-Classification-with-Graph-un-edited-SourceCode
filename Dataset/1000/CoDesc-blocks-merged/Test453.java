class Test {
    public class Example {
    protected void addValuePropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_UserAttributeValue_value_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_UserAttributeValue_value_feature", "_UI_UserAttributeValue_type"),
    				 UserattributesPackage.Literals.USER_ATTRIBUTE_VALUE__VALUE,
    				 true,
    				 false,
    				 false,
    				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
    				 null,
    				 null));
    	}
        @Override synchronized protected void sendMessage(AbstractMRMessage m,AbstractMRListener reply){
      msgQueue.addLast(m);
      listenerQueue.addLast(reply);
      if (m != null) {
        log.debug("just notified transmit thread with message " + m.toString());
      }
    }
        private Expr parseNewExpression(EnclosingScope scope, boolean terminated) {
    		int start = index;
    		// try to match a lifetime
    		Identifier lifetime = parseOptionalLifetimeIdentifier(scope, terminated);
    		if (lifetime != null) {
    			scope.mustBeLifetime(lifetime);
    			match(Colon);
    		} else {
    			// FIXME: this should really be null
    			lifetime = new Identifier("*");
    		}
    		match(New);
    		Expr e = parseExpression(scope, terminated);
    		return annotateSourceLocation(new Expr.New(Type.Void, e, lifetime), start);
    	}
    }
}