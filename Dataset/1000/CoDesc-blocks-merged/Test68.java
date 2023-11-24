class Test {
    public class Example {
    private void flipScrollBar() {
        int newVal
          = vScroll.getMaximum() - vScroll.getValue() - vScroll.getVisibleAmount();
        vScroll.setValue(newVal);
      }
        public IEditorInput getEditorInput() {
            if (input == null) {
                IPluginAdapter adapter = getPluginAdapter();
                if (adapter != null)
                    input = adapter.createInput(item);
            }
    
            return input;
        }
        public OutputChannelMapping withInputChannels(Integer... inputChannels) {
            if (this.inputChannels == null) {
                setInputChannels(new java.util.ArrayList<Integer>(inputChannels.length));
            }
            for (Integer ele : inputChannels) {
                this.inputChannels.add(ele);
            }
            return this;
        }
    }
}