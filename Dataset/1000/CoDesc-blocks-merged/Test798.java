class Test {
    public class Example {
    public static String toString(String format,double[]... v){
      StringBuffer str=new StringBuffer();
      for (int i=0; i < v.length; i++) {
        for (int j=0; j < v[i].length - 1; j++)     str.append(String.format(format + " ",v[i][j]));
        str.append(String.format(format,v[i][v[i].length - 1]));
        if (i < v.length - 1)     str.append("\n");
      }
      return str.toString();
    }
        @Override public Object pushBut(final FormObject form){
      final JButton pushBut=new JButton();
      setupButton(pushBut,form);
      setupUniversalFeatures(pushBut,form);
      final boolean[] flags=form.getFieldFlags();
      if ((flags != null) && (flags[FormObject.READONLY_ID])) {
        pushBut.setEnabled(false);
        pushBut.setDisabledIcon(pushBut.getIcon());
        pushBut.setDisabledSelectedIcon(pushBut.getSelectedIcon());
      }
      return pushBut;
    }
        public QueryResult getPublished(String inQuestionID) throws VException, SQLException {
    		KeyObject lKey = new KeyObjectImpl();
    		lKey.setValue(KEY_QUESTION_ID, new Integer(inQuestionID));
    		lKey.setValue(BOMHelper.getKeyPublished(KEY_STATE));
    		OrderObject lOrder = new OrderObjectImpl();
    		lOrder.setValue(KEY_ID, 0);
    		return select(lKey, lOrder);
    	}
    }
}