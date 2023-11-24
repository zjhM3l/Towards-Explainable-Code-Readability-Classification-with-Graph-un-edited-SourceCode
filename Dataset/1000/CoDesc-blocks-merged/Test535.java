class Test {
    public class Example {
    public static Predicate<Field> isAnnotatedWith(Class<? extends Annotation>... annotations) {
            return field -> {
                for (Class<? extends Annotation> annotation : annotations) {
                    if (field.isAnnotationPresent(annotation)) {
                        return true;
                    }
                }
                return false;
            };
        }
        public SubscriptionStateExceptionBean(ApplicationExceptionBean sup,Reason reason,String member){
      super(sup);
      setReason(reason);
      setMember(member);
    }
        public void testLabelWithMixedContentFails() throws Exception {
            checkValidationFailsFromFile("validation-xml/label-with-mixed-content-fails.xml",
                    "validation-error-invalid-content", new Object[] {
                    XFormElements.LABEL, "((PCDATA))?", XHTML2Elements.SPAN
            });
        }
    }
}