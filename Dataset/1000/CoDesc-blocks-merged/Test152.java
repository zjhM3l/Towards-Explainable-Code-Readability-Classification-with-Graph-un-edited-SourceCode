class Test {
    public class Example {
    public ProductContainer findByName(final String name) {
    		return finder
    			(new ProductSelector() { 
    					public boolean select(Product product) {
    						return name.equals(product.getName());
    					}
    			});
    							
    	}
        public void highLightText(Color color, int lineNumber) {
            try {
                String codigo = editArea.getDocument().getText(0,
                        editArea.getDocument().getLength());
                int currentLine = 0;
                int pos = 0;
                while ((currentLine < lineNumber) && (pos != -1)) {
                    pos = codigo.indexOf('\n', pos + 1);
                    if (pos != -1) {
                        currentLine++;
                    }
                }
                highLightText(color, pos, 1);
            } catch (BadLocationException e) {
            }
        }
        private void selectValue(@NotNull final String result) {
            if (input != null) {
                input.setText(" " + result);
            }
            assert frame != null;
            frame.setVisible(false);
        }
    }
}