class Test {
    public class Example {
    private void toggleFilterArea() {
          Point windowSize = getShell().getSize();
          Point oldSize = getShell().computeSize(SWT.DEFAULT,
                                                 SWT.DEFAULT);
          if(filterAreaCreated) {
             fFilterPanel.dispose();
             filterAreaCreated = false;
             detailsButton.setText(IDialogConstants.SHOW_DETAILS_LABEL);
          } else {
             createFilterPanel((Composite)getContents());
             detailsButton.setText(IDialogConstants.HIDE_DETAILS_LABEL);
          }
          Point newSize = getShell().computeSize(SWT.DEFAULT,
                                                 SWT.DEFAULT);
          getShell().setSize(new Point(windowSize.x,
                                       windowSize.y + (newSize.y - oldSize.y)));
       }
        public void closeMessageUI() {
        try {
          this.setClosed(true);
        } catch (java.beans.PropertyVetoException e) {
        }
      }
        private void getLoggerStatus(){
                String st = sendAndReceive("config");
                if(st==null){
                    showErrorMessage("The configuration information was not received from the " +
                            "\nlogger.  You can get the information manually by pushing " +
                            "\nthe get configuration button.","Error Downloading Configuration");
                } else {
                    loggerStatus.parseConfig(st);
                    if(!loggerStatus.isConfigKnown()) {
                        showErrorMessage("Error Parsing Logger Status.", "Parsing Error");
                    }
                }
                setConnectionMode();
                updateClock();
        }
    }
}