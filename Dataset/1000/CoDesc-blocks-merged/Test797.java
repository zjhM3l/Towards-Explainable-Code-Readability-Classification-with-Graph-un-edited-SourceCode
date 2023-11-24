class Test {
    public class Example {
    public void store(String enclosingType, AbstractMethodDeclaration method) {
        if (method.binding == null) {
          // Compile problem with this method, skip
          return;
        }
        int n = method.arguments.length;
        String[] argNames = new String[n];
        for (int i = 0; i < n; ++i) {
          argNames[i] = StringInterner.get().intern(
              String.valueOf(method.arguments[i].name));
        }
        StringBuilder buf = new StringBuilder();
        buf.append(enclosingType).append('.').append(method.selector);
        buf.append(method.binding.signature());
        String key = StringInterner.get().intern(buf.toString());
        methodArgs.put(key, argNames);
      }
        protected final void populateIdAccessorMethods(EntityMetadata metadata, Class<?> clazz, Field f)
    
        {
    
            try
    
            {
    
                BeanInfo info = Introspector.getBeanInfo(clazz);
    
    
    
                for (PropertyDescriptor descriptor : info.getPropertyDescriptors())
    
                {
    
                    if (descriptor.getName().equals(f.getName()))
    
                    {
    
                        metadata.setReadIdentifierMethod(descriptor.getReadMethod());
    
                        metadata.setWriteIdentifierMethod(descriptor.getWriteMethod());
    
                        return;
    
                    }
    
                }
    
            }
    
            catch (IntrospectionException e)
    
            {
    
                throw new RuntimeException(e);
    
            }
    
        }
        public void setFormBeanClass(String formBeanClass) {
    
            this.formBeanClass = formBeanClass;
    
        }
    }
}