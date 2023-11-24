class Test {
    public class Example {
    private void invalidateElementBox(final Element element) {
    
            BlockBox elementBox = (BlockBox) this.findInnermostBox(new IBoxFilter() {
                public boolean matches(Box box) {
                    return box instanceof BlockBox 
                    && box.getElement() != null
                    && box.getStartOffset() <= element.getStartOffset() + 1
                    && box.getEndOffset() >= element.getEndOffset();
                }
            });
            
            if (elementBox != null) {
                elementBox.invalidate(true);
            }
        }
        public InputStream getBinaryStream() throws SQLException {
    
            final byte[] ldata = data;
    
            checkValid(ldata);
    
            return new ByteArrayInputStream(ldata);
        }
        public void onModuleLoad() {
            Editor editor = new Editor();
            editor.setTextPixelSize(400, 300);
            RootPanel.get().add(editor);
            editor.setHTML("This is a sample text that you can edit. If you want edit this text then you need to click on the edit link.");
        }
    }
}