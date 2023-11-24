class Test {
    public class Example {
    public void send(String fromIdentity, String message) {
    		// Connect to the device and deliver the message.
    		System.out.println("Delivering message to address " + _address + ":" + _port);
    		try {
    			IBEHelper.deliverMessageToClient(fromIdentity, message, _address, _port);
    		} catch (UnknownHostException e) {
    			e.printStackTrace();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		System.out.println("Succesfully delivered message to address " + _address + ":" + _port);
    	}
        private static Map<String, Method> createOperationMethods(BeanInfo beanInfo) throws ManagementException {
            Set<Method> allAccessors = allAccessors(beanInfo);
            Map<String, Method> operationMethods = new HashMap<String, Method>();
            for (MethodDescriptor descriptor : beanInfo.getMethodDescriptors()) {
                Method method = descriptor.getMethod();
                ManagedOperation operationAnnotation = method.getAnnotation(ManagedOperation.class);
                if (operationAnnotation != null && allAccessors.contains(method)) {
                    throw new ManagementException(
                            String.format("Accessor method %s is annotated as an @%s", method, ManagedOperation.class.getName()));
                }
                /* consider the Method an automatic operation if it satisfies all of:
                 * 1. its class is annotated with @MBean(automatic=OPERATION)
                 * 2. it is a public instance (non static) method
                 * 3. it is NOT considered a bean accessor (getter/setter)
                 */
                boolean isAutomatic = isAutomatic(method.getDeclaringClass(), AutomaticType.OPERATION);
                boolean autoOperation = (isAutomatic && isPublicInstance(method) && !allAccessors.contains(method));
                if (operationAnnotation != null || autoOperation) {
                    // This method is an operation
                    Method old = operationMethods.put(method.getName(), method);
                    if (old != null) {
                        //TODO support multiple identically named operation methods
                        throw new ManagementException(format("Multiple Operation annotations for operation %s of %s",
                                method.getName(), old.getDeclaringClass()));
                    }
                }
            }
            return operationMethods;
        }
        public void keyPressed(int keyCode)
      { //if(DEBUG) Debug.println("FileSelectorPanel.keyPressed("+keyCode+")");
        switch(keyCode)
        { case KEY.SELECT: //if(DEBUG) Debug.println("SELECT, code="+keyCode);
                	   browse();
                       break;
          case KEY.DOWN: //if(DEBUG) Debug.println("DOWN, code="+keyCode);
                     currentList.down();
                     break;
          case KEY.UP: //if(DEBUG) Debug.println("UP, code="+keyCode);
                   currentList.up();
                   break;
        }
      }
    }
}