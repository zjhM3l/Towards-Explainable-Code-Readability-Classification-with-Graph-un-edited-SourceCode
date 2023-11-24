class Test {
    public class Example {
    public void warning(TransformerException exception) throws TransformerException {
    
            LOG.info(exception);
            // ACKing should handle the exception here.
            // But, even if not, do not re-throw a warning.
        }
        public void add (Texture texture, float[] vertices, int offset, int length) {
    		if (currentCache == null) throw new IllegalStateException("beginCache must be called before add.");
    
    		int verticesPerImage = mesh.getNumIndices() > 0 ? 4 : 6;
    		int count = length / (verticesPerImage * VERTEX_SIZE) * 6;
    		int lastIndex = textures.size() - 1;
    		if (lastIndex < 0 || textures.get(lastIndex) != texture) {
    			textures.add(texture);
    			counts.add(count);
    		} else
    			counts.set(lastIndex, counts.get(lastIndex) + count);
    
    		mesh.getVerticesBuffer().put(vertices, offset, length);
    	}
        public JButton getNextButton() {
    		if (nextButton == null) {
    			nextButton = new JButton();
    			nextButton.setBounds(new Rectangle(191, 273, 165, 69));
    			nextButton.setText(UIHelper.getText("dummy1.nextbutton"));
    		}
    		return nextButton;
    	}
    }
}