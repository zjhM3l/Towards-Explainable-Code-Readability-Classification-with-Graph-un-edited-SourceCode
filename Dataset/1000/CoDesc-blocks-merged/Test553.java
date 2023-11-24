class Test {
    public class Example {
    public static String durationToN1qlFormat(long duration, TimeUnit unit) {
            switch (unit) {
                case NANOSECONDS:
                    return duration + "ns";
                case MICROSECONDS:
                    return duration + "us";
                case MILLISECONDS:
                    return duration + "ms";
                case SECONDS:
                    return duration + "s";
                case MINUTES:
                    return duration + "m";
                case HOURS:
                    return duration + "h";
                case DAYS:
                default:
                    return unit.toHours(duration) + "h";
            }
        }
        public void setParameter(it.businesslogic.ireport.crosstab.CrosstabParameter tmpParameter) {
            this.jTextFieldName.setText( new String(tmpParameter.getName()));
            this.jComboBoxType.setSelectedItem( new String(tmpParameter.getClassType()));
            this.jRTextExpressionAreaDefaultExpression.setText( new String(tmpParameter.getParameterValueExpression()));                       
        }
        public void testretObject() throws java.lang.Exception {
    
            OMFactory factory = OMAbstractFactory.getOMFactory();
            // lets create the namespace object of the Article element
            OMNamespace ns = factory.createOMNamespace("http://www.serverside.com/articles/introducingAxiom", "article");
            // now create the Article element with the above namespace
            OMElement articleElement = factory.createOMElement("Article", ns);
    
            // comment out this test case since adb now uses an object to represents the any type
            // OMElement ret = stub.retObject(articleElement);
            // assertNotNull(ret);
            // assertEquals(ret.toString(), articleElement.toString());
        }
    }
}