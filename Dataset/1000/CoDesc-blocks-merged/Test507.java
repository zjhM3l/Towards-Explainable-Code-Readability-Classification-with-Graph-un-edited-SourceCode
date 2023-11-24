class Test {
    public class Example {
    public String getBluetoothAddress() {
            try {
                if (bdAddrString == null) {
                    long bdAddr = bluetoothManager.send_HCI_IP_Read_BD_ADDR();
                    bdAddrString = Long.toHexString(bdAddr).toUpperCase();
                    while (bdAddrString.length() < 12) { bdAddrString = "0" + bdAddrString; }
                }
                return bdAddrString;
            }
            catch (HCIException e) {
    			Debug.println(BCC.DEBUG_LEVEL_ERROR,"HCIException: LocalDevice.getBluetoothAddress(): " + e);
                return "000000000000";
            }
        }
        public static Map < String , Object > getObservableMethodMap ( ObservableProperty < ? > self , String propName , String method ) {
      if ( ( propName == null ) || ( method == null ) ) {
        return null ;
      }
      if ( method . contains ( "." ) ) {
        propName = propName . substring ( 0 , method . indexOf ( '.' ) ) ;
      }
      return self . getObservableMethodMap ( propName , method ) ;
    }
        private GenericCriteriaPrompt getPromptValue(FieldType field, byte[] block)
       {
          int textOffset = getPromptOffset(block);
          String value = MPPUtility.getUnicodeString(m_criteriaData, m_criteriaTextStart + textOffset);
          GenericCriteriaPrompt prompt = new GenericCriteriaPrompt(field.getDataType(), value);
          if (m_prompts != null)
          {
             m_prompts.add(prompt);
          }
          return prompt;
       }
    }
}