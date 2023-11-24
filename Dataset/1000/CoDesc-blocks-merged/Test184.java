class Test {
    public class Example {
    public StatusBar getJStatusBar() {
    		if (jStatusBar == null) {
    			jStatusBar = new StatusBar(this);
    		}
    		return jStatusBar;
    	}
        protected void doSaveAll() throws IOException {
    		Enumeration files = editor.getModel().roots();
    		while (files.hasMoreElements()) {
    			Object file = files.nextElement();
    			if (file instanceof JGraphEditorFile)
    				doSaveFile((JGraphEditorFile) file, false, false);
    		}
    	}
        public static <T>CopyOnWriteHashSet<T> copyOf(Collection<? extends T> set){
      if (set instanceof CopyOnWriteHashSet) {
        @SuppressWarnings("unchecked") final CopyOnWriteHashSet<T> cowSet=(CopyOnWriteHashSet<T>)set;
        return cowSet;
      }
     else {
        return new CopyOnWriteHashSet<T>().copyAndAddAll(set);
      }
    }
    }
}