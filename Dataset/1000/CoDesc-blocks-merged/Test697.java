class Test {
    public class Example {
    public void testBasicCreation() throws Exception {
            GenericMessage gm = new GenericMessage(GenericMessageMessageCreator.class.getMethod("toString", new Class[0]), new Object[0]);
            instance.setGenericMessage(gm);
            Message message = instance.createMessage( new MockSession(null, false, 0) {
                    public ObjectMessage createObjectMessage() throws JMSException {
                        return new MockObjectMessage();
                    }
                });
                    
            assertNotNull("JMS Message was null", message);
            GenericMessage encoded = instance.convertJmsMessage(message);
                    
            assertEquals("encoded message not equal to original", gm, encoded);
        }
        public Object loadObject(XMLControl xmlControl, Object obj) {
          OSPApplication app = (OSPApplication) obj;
          XMLControlElement cControl = (XMLControlElement) xmlControl.getChildControl("control");
          if(cControl!=null) {
            // autoimport data from cControl even if mismatched classes
            cControl.loadObject(app.control, true, true);
          	// eliminate "model" property from app.control
          	//app.control.setValue("model", null);
          }
          XMLControl modelControl = xmlControl.getChildControl("model");
          if(modelControl!=null) {
            modelControl.loadObject(app.model);
          }
          return app;
        }
        public void testSetInvoker() {
            System.out.println("setInvoker");
            GUITypeWrapper instance = new GUITypeWrapper(new GUIType());
            ComponentTypeWrapper expResult = new ComponentTypeWrapper(new ComponentType());
            instance.setInvoker(expResult);
            ComponentTypeWrapper result =  instance.invoker;
            assertEquals(expResult, result);
        }
    }
}