class Test {
    public class Example {
    @SuppressWarnings("deprecation")
        protected Throwable getNestedException(Throwable t) {
            Throwable root = t;
            for (;;) {
                if (root instanceof RemoteException) {
                    RemoteException re = (RemoteException) root;
                    if (re.detail == null)
                        break;
                    root = re.detail;
                } else if (root instanceof NamingException) {
                    NamingException ne = (NamingException) root;
                    if (ne.getRootCause() == null)
                        break;
                    root = ne.getRootCause();
                } else if (root instanceof com.ibm.ws.exception.WsNestedException) { //d121522
                    com.ibm.ws.exception.WsNestedException ne = (com.ibm.ws.exception.WsNestedException) root;
                    if (ne.getCause() == null)
                        break;
                    root = ne.getCause();
                } else {
                    break;
                }
            }
            return root;
        }
        public void clearPassword() {
            if (password != null) {
                for (int i = 0; i < password.length; i++) {
                    password[i] = ' ';
                }
                password = null;
            }
        }
        private void afterSend() {
          // TODO refresh sent folder
          mediator.updateSentFolder();
          if (mode == MODE_EDITING_SAVED) {
             mediator.reselectFolder();
          }
          // TODO if ok then call cancelAction() else show sending/validation errors
          cancelAction();
       }
    }
}