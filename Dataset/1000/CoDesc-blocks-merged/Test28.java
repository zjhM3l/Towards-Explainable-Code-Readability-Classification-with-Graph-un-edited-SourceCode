class Test {
    public class Example {
    public void shutdown() {
            if (tm != null) {
                tm.shutdown();
                tm = null;
            }
        }
        public void run() {
    		for (ChangeEffect e: effects) {
    			ChangeEffect runned = Game.replaceEffect(e);
    			runned.run();
    		}
    	}
        private JTextField getJTextField() {
    		if (null == m_JTextField) {
    			m_JTextField = new JFormattedTextField();
    		}
    
    		return m_JTextField;
    	}
    }
}