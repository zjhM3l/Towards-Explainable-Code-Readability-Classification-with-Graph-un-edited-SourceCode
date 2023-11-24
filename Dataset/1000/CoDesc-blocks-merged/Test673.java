class Test {
    public class Example {
    public Boolean getRenderBack(){
    		if (cPath == 0) {
    			return false;
    		}
    		else {
    			return true;
    		}
    	}
        private JButton getJButtonCancel() {
    		if (jButtonCancel == null) {
    			jButtonCancel = new JButton();
    			jButtonCancel.setText("Cancelar");
    			jButtonCancel.setPreferredSize(new Dimension(90, 26));
    		}
    		return jButtonCancel;
    	}
        private void init(){
        Broadcaster.addChangePanelListener(new ChangePanelListener(){
          public void changePanel(ChangePanelEvent e){      	
            if(!e.getSource().equals(JFMView.this)){
              JFMView.this.requestFocus();          
            }
          }
        });    
        statusLabel=new javax.swing.JLabel();
        statusLabel.setOpaque(false);
      }
    }
}