class Test {
    public class Example {
    @Override public void onBatchComplete(){
      int batchId=mBatchId;
      mBatchId++;
      SystraceMessage.beginSection(Systrace.TRACE_TAG_REACT_JAVA_BRIDGE,"onBatchCompleteUI").arg("BatchId",batchId).flush();
      try {
        mUIImplementation.dispatchViewUpdates(batchId);
      }
      finally {
        Systrace.endSection(Systrace.TRACE_TAG_REACT_JAVA_BRIDGE);
      }
    }
        protected InputStream retrievePersistanceInStream() throws IOException, CancelledException {
            javax.swing.JFileChooser jfcChooser = getChooser();
    
            do {
                jfcChooser.getSelectedFile();
    
                if (jfcChooser.showOpenDialog(null) == javax.swing.JFileChooser.CANCEL_OPTION) {
                    throw new CancelledException("File choosing cancelled.");
                }
    
            }
            while (!jfcChooser.getSelectedFile().exists());
    
            return new java.io.FileInputStream(jfcChooser.getSelectedFile());
        }
        protected final void fastPathOrderedEmit(U value, boolean delayError, Disposable disposable) {
            final Observer<? super V> observer = downstream;
            final SimplePlainQueue<U> q = queue;
    
            if (wip.get() == 0 && wip.compareAndSet(0, 1)) {
                if (q.isEmpty()) {
                    accept(observer, value);
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    q.offer(value);
                }
            } else {
                q.offer(value);
                if (!enter()) {
                    return;
                }
            }
            QueueDrainHelper.drainLoop(q, observer, delayError, disposable, this);
        }
    }
}