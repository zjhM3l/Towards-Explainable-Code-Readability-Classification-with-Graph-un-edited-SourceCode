class Test {
    public class Example {
    public static List<Method> getPublicMethods(Class<?> clazz, Filter<Method> filter) {
    
    		if (null == clazz) {
    
    			return null;
    
    		}
    
    
    
    		final Method[] methods = getPublicMethods(clazz);
    
    		List<Method> methodList;
    
    		if (null != filter) {
    
    			methodList = new ArrayList<>();
    
    			for (Method method : methods) {
    
    				if (filter.accept(method)) {
    
    					methodList.add(method);
    
    				}
    
    			}
    
    		} else {
    
    			methodList = CollectionUtil.newArrayList(methods);
    
    		}
    
    		return methodList;
    
    	}
        public List getPropertyDescriptors(Object object) {
    		if (itemPropertyDescriptors == null) {
    			super.getPropertyDescriptors(object);
    
    			addDecisionInputPropertyDescriptor(object);
    		}
    		return itemPropertyDescriptors;
    	}
        public void addGraphic(Object graphic) {
    		AssertUtils.assertNonNullArg(graphic);
    
    		_graphics.add(graphic);
    	}
    }
}