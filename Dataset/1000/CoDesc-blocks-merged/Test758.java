class Test {
    public class Example {
    public void exportTopics(Iterator it, DocumentHandler dh) throws SAXException {
        while (it.hasNext()) {
          TopicIF topic = (TopicIF) it.next();
          if (filterOk(topic))
            writeTopic(topic, dh);
        }
      }
        public static Object forward ( CriterionForward self , Object input , Object target ) {
      int jinput = Layer . checkInput ( input ) ;
      int jtarget = Layer . checkInput ( target ) ;
      Object output = callBigDlFunc ( bigdl_type , "criterionForward" , self . value , jinput , jtarget , jinput ) ;
      return output ;
    }
        public void testCreate() throws Exception {
    
          /*
           * Attempt to create with null Question.
           */
          try {
             new TestAnswer(null);
             fail("Answer created with null Question");
          } catch (NullPointerException e) {
          }
    
          /*
           * Create valid Answer.
           */
          Answer testAnswer = new TestAnswer(question);
          assertEquals("Question inconsistent", question, testAnswer.getQuestion());
          assertEquals("Value inconsistent", questionType.getDefaultValue(), testAnswer.getValue());
       }
    }
}