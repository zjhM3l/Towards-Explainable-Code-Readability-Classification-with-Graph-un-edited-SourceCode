class Test {
    public class Example {
    private JButton getJButtonCancel() {
    		if (jButtonCancel == null) {
    			jButtonCancel = new JButton();
    			jButtonCancel.setText(Messages.getString("QueryExportFrame.12")); //$NON-NLS-1$
    			jButtonCancel.setEnabled(false);
    			jButtonCancel.addActionListener(new ActionListener() {
    
    				public void actionPerformed(ActionEvent e) {
    			        if ((exportThread != null) && exportThread.isAlive()) {
    			        	exportThread.interrupt();
    			        }
    				}
    				
    			});
    		}
    		return jButtonCancel;
    	}
        protected void setLocale(HttpServletRequest request, Locale locale) {
    
            HttpSession session = request.getSession();
            if (locale == null) {
                locale = Locale.getDefault();
            }
            session.setAttribute(Globals.LOCALE_KEY, locale);
    
        }
        public boolean equals(final AbstractIdentifiedObject object, final boolean compareMetadata) {
            if (object == this) {
                // Slight optimization
                return true;
            }
    
            if (super.equals(object, compareMetadata)) {
                final DefaultParameterDescriptorGroup that = (DefaultParameterDescriptorGroup) object;
    
                return Arrays.equals(this.parameters, that.parameters);
            }
    
            return false;
        }
    }
}