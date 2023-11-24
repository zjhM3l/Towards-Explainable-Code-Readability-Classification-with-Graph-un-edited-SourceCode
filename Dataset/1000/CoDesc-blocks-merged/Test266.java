class Test {
    public class Example {
    private void saveStreamInFile(InputStream is, IFile chapterFile) {
    		try {
    			if (chapterFile.exists()) {
    				chapterFile.delete(true, null);
    			}
    			chapterFile.create(is, true, null);
    			try {
    				Thread.sleep(300);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		} catch (CoreException ce) {
    			ce.printStackTrace();
    		}
    	}
        public static <T extends Transform> T multiply (
            double am00, double am01, double am10, double am11, double atx, double aty,
            double bm00, double bm01, double bm10, double bm11, double btx, double bty, T into) {
            into.setTransform(am00 * bm00 + am10 * bm01,
                              am01 * bm00 + am11 * bm01,
                              am00 * bm10 + am10 * bm11,
                              am01 * bm10 + am11 * bm11,
                              am00 *  btx + am10 *  bty + atx,
                              am01 *  btx + am11 *  bty + aty);
            return into;
        }
        private void createStartStopButton() {
          // Start stop Button
          this.m_startStop = new JButton("start");
          this.m_startStop.setBackground(Color.WHITE);
          this.m_startStop.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
              JButton source = (JButton) e.getSource();
              if (Showcase.this.getCollector().isRunning()) {
                Showcase.this.stopData();
                source.setText("start");
              } else {
                Showcase.this.startData();
                source.setText("stop");
              }
              source.invalidate();
              source.repaint();
            }
          });
        }
    }
}