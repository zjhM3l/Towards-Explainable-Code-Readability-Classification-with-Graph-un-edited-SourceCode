class Test {
    public class Example {
    public EnvironmentEntry addEntry(String entryName) {
            if (getEntry(entryName) != null) {
                throw new IllegalArgumentException("Invalid global environment entry:\n already existing.");
            }
            EnvironmentEntry entry = new EnvironmentEntry(entryName, this);
            entry.addBeanListener(this);
            environmentSettings.add(entry);
            fireChildBeanAdded(entry);
            return entry;
        }
        public IntentFilter(String action){
      mPriority=0;
      mActions=new ArrayList<String>();
      addAction(action);
    }
        protected boolean login() {
    		// ������ 220 �����ڵ带 ������. User���� �䱸�Ѵ�.
    		checkReply(SERVICE_READY);
    
    		//2000.10.30 �� �߰�
    		//FTP������ �������� �Է��ߴ��� ���ߴ����� üũ�Ѵ�.
    		//������ �δ��� ���̱� ���� Ŭ���̾�Ʈ���� �˻��Ѵ�.
    		if(this.UserID == null){
    			//�޽���â ����
    			//System.out.println("**User �ʵ� ä�쵵�� �޽���â ��켼��**:  Usage: User username");
    		}
    
    		// Ŭ���̾�Ʈ�� ���� ��������� ���� User���� ������.
    		sendCommand("USER " + this.UserID);
    
    		// ������ 331 �����ڵ带 ������. �н����带 �䱸�Ѵ�.
    		checkReply(USER_NAME_OK);
    
    		// Ŭ���̾�Ʈ�� ���� ������ ���� Password�� ������.
    		sendCommand("PASS " + this.Password);
    		checkReply(USER_LOG_IN);
    		if(mStrParam.equals(NOT_LOG_IN)) {
    			//System.out.println("Log in Failue...");
    			return false;
    		}
    		return true;
    	}
    }
}