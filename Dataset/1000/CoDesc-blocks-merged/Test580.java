class Test {
    public class Example {
    public void onDescriptorWriteRequest(String address,int transId,int offset,int length,boolean isPrep,boolean needRsp,int srvcType,int srvcInstId,ParcelUuid srvcId,int charInstId,ParcelUuid charId,ParcelUuid descrId,byte[] value){
      UUID srvcUuid=srvcId.getUuid();
      UUID charUuid=charId.getUuid();
      UUID descrUuid=descrId.getUuid();
      if (DBG)   Log.d(TAG,"onDescriptorWriteRequest() - " + "service=" + srvcUuid + ", characteristic="+ charUuid+ "descriptor="+ descrUuid);
      BluetoothDevice device=mAdapter.getRemoteDevice(address);
      BluetoothGattService service=getService(srvcUuid,srvcInstId,srvcType);
      if (service == null)   return;
      BluetoothGattCharacteristic characteristic=service.getCharacteristic(charUuid);
      if (characteristic == null)   return;
      BluetoothGattDescriptor descriptor=characteristic.getDescriptor(descrUuid);
      if (descriptor == null)   return;
      try {
        mCallback.onDescriptorWriteRequest(device,transId,descriptor,isPrep,needRsp,offset,value);
      }
     catch (  Exception ex) {
        Log.w(TAG,"Unhandled exception: " + ex);
      }
    }
        public void setReplyto(Address[] param){
                                  
                                       validateReplyto(param);
    
                                   
                                              if (param != null){
                                                 //update the setting tracker
                                                 localReplytoTracker = true;
                                              } else {
                                                 localReplytoTracker = false;
                                                     
                                              }
                                          
                                          this.localReplyto=param;
                                  }
        public boolean isStored(String aFilePath) {
    		//fLogger.debug(aFilePath);
    		File lFile = new File( getBaseDirectoryPath() + aFilePath );
    		return lFile.exists(); 
    	}
    }
}