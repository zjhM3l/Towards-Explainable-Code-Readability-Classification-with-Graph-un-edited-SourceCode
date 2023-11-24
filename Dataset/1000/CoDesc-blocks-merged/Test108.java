class Test {
    public class Example {
    private void setPreferredWidth() {
            Element root = component.getDocument().getDefaultRootElement();
            int lines = root.getElementCount();
            int digits = Math.max(String.valueOf(lines).length(), minimumDisplayDigits);
    
            //  Update sizes when number of digits in the line number changes
    
            if (lastDigits != digits) {
                lastDigits = digits;
                FontMetrics fontMetrics = getFontMetrics(getFont());
                int width = fontMetrics.charWidth('0') * digits;
                Insets insets = getInsets();
                int preferredWidth = insets.left + insets.right + width;
    
                Dimension d = getPreferredSize();
                d.setSize(preferredWidth, H);
                setPreferredSize(d);
                setSize(d);
            }
        }
        public static void createWorker ( StoppableWorkerThread self , Runnable runnable , long interval , TimeUnit timeUnit ) {
      StoppableWorkerThread thread = new StoppableWorkerThread ( runnable , interval , timeUnit ) ;
      self . getWorkers ( ) . add ( thread ) ;
      if ( self . isStarted ( ) ) {
        thread . start ( ) ;
      }
    }
        public void execute() throws Exception {
            // Save the release state to the database.
            ReleaseDAO releaseDAO = new ReleaseDAO(false);
            if (release.isNew() & release.getId() == null) {
                releaseDAO.insert(release);
            } else {
                releaseDAO.update(release);
            }
        }
    }
}