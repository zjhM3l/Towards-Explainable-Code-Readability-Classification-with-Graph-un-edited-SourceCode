class Test {
    public class Example {
    protected Instances determineOutputFormat(Instances inputFormat) throws Exception {
      int i;
      int[] indices;
      StringBuilder order;
      Instances output;
      m_AttributeIndices.setUpper(inputFormat.numAttributes() - 1);
      order=new StringBuilder();
      indices=m_AttributeIndices.getSelection();
      if (indices.length == 0)   throw new WekaException("No attributes defined as class attributes!");
      for (i=0; i < indices.length; i++) {
        if (i > 0)     order.append(",");
        order.append("" + (indices[i] + 1));
      }
      for (i=0; i < inputFormat.numAttributes(); i++) {
        if (m_AttributeIndices.isInRange(i))     continue;
        order.append(",");
        order.append("" + (i + 1));
      }
      m_Reorder.setAttributeIndices(order.toString());
      m_Reorder.setInputFormat(inputFormat);
      output=m_Reorder.getOutputFormat();
      output.setClassIndex(indices.length);
      output.setRelationName("-C " + indices.length);
      return output;
    }
        public static void appendChild(Node parent,Node child){
      Document ownerDoc=getOwnerDocument(parent);
      if (child.getOwnerDocument() != ownerDoc) {
        parent.appendChild(ownerDoc.importNode(child,true));
      }
     else {
        parent.appendChild(child);
      }
    }
        public Vector getRowVector() {
        Vector v = new Vector(20);
        v.addElement( toString( voucherNo));
        v.addElement( toString( voucherDate));
        v.addElement( toString( entryDate));
        v.addElement( toString( entryText));
        v.addElement( toString( account));
        if ( toString( debitHabet).compareTo( "S") == 0) {
          v.addElement( toString( amount));
          v.addElement( "");
        } else {
          v.addElement( "");
          v.addElement( toString( amount));
        }
        v.addElement( toString( currency));
        return v;
      }
    }
}