class Test {
    public class Example {
    public void printToFile(String s, boolean append) {
            try {
                FileWriter fstream = new FileWriter("out.txt", append);
                BufferedWriter out = new BufferedWriter(fstream);
                out.write(s);
                out.close();
            } catch (Exception e) {//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
        }
        @Deprecated
      public void addEvent(String packageName, long timeStamp, int eventType) {
        EventBuilder eventBuilder =
            EventBuilder.buildEvent()
                .setPackage(packageName)
                .setTimeStamp(timeStamp)
                .setEventType(eventType);
        if (eventType == Event.CONFIGURATION_CHANGE) {
          eventBuilder.setConfiguration(new Configuration());
        }
        addEvent(eventBuilder.build());
      }
        public void testDoCheckWithNotEmptyText(){
      LOGGER.debug("doCheckWithNotEmptyText");
      elements.add(element);
      mockTestSolutionHandler.addTestSolution(TestSolution.PASSED);
      expectLastCall().once();
      expect(mockTextElementBuilder.buildTextFromElement(element)).andReturn("something");
      TextEmptinessChecker instance=new TextEmptinessChecker(mockTextElementBuilder,TEXT_EMPTY_MSG,null);
      instance.setProcessRemarkService(mockProcessRemarkService);
      replay(mockTextElementBuilder,mockSSPHandler,mockTestSolutionHandler,mockProcessRemarkService);
      instance.doCheck(mockSSPHandler,elements,mockTestSolutionHandler);
      verify(mockTextElementBuilder,mockSSPHandler,mockTestSolutionHandler,mockProcessRemarkService);
    }
    }
}