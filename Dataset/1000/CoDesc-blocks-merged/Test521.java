class Test {
    public class Example {
    synchronized public void deregisterListener(Message template, MessageListener listener) {
            
            if (m_MoteIF != null ) {
                m_MoteIF.deregisterListener(template,listener);
            } else {
                if (m_Listener == listener) m_Listener = null;
            }
            
        }
        public RealArray getXY() {
            double[] f = new double[2 * size()];
            int count = 0;
            for (int i = 0; i < size(); i++) {
                Real2 p = getReal2(i);
                f[count++] = p.getX();
                f[count++] = p.getY();
            }
            return new RealArray(f);
        }
        private JButton getJButton3() {
    		if (jButton3 == null) {
    			jButton3 = new JButton();
    			jButton3.setText("Done");
    		}
    		return jButton3;
    	}
    }
}