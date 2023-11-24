class Test {
    public class Example {
    public String nextTokenAsString() throws XPathException {
                String s = getTokenString(nextToken());
                if(s==null)     throw new XPathException("c-xpath-general");
                return s;
            }
        public Binding loadBinding(QName qName, MutablePicoContainer context) {
            ComponentAdapter adapter = container.getComponentAdapter(qName);
    
            if (adapter == null) {
                return null;
            }
    
            return (Binding) adapter.getComponentInstance(context);
        }
        public int getFindDirection() {
        if (backwardRadioButton.isSelected()) {
          return TextArea.DIRECTION_BACKWARD;
        }
        return TextArea.DIRECTION_FORWARD;
      }
    }
}