class Test {
    public class Example {
    public String submitShortMessage(String serviceType,
                TypeOfNumber sourceAddrTon, NumberingPlanIndicator sourceAddrNpi,
                String sourceAddr, TypeOfNumber destAddrTon,
                NumberingPlanIndicator destAddrNpi, String destinationAddr,
                ESMClass esmClass, byte protocolId, byte priorityFlag,
                String scheduleDeliveryTime, String validityPeriod,
                RegisteredDelivery registeredDelivery, byte replaceIfPresentFlag,
                DataCoding dataCoding, byte smDefaultMsgId, byte[] shortMessage,
                OptionalParameter... optionalParameters) throws PDUException,
                ResponseTimeoutException, InvalidResponseException,
                NegativeResponseException, IOException {
        	
            ensureTransmittable("submitShortMessage");
        	
            SubmitSmCommandTask submitSmTask = new SubmitSmCommandTask(
                    pduSender(), serviceType, sourceAddrTon, sourceAddrNpi,
                    sourceAddr, destAddrTon, destAddrNpi, destinationAddr,
                    esmClass, protocolId, priorityFlag, scheduleDeliveryTime,
                    validityPeriod, registeredDelivery, replaceIfPresentFlag,
                    dataCoding, smDefaultMsgId, shortMessage, optionalParameters);
        	
            SubmitSmResp resp = (SubmitSmResp)executeSendCommand(submitSmTask, getTransactionTimer());
        	return resp.getMessageId();
        }
        @ VisibleForTesting static void parseMultiple ( SoftwarePackage self , List < Map < String , String >> resultMaps ) {
      int status = RDFClient . SoftwarePackage . InstallState . INSTALLED ;
      List < RDFClient . SoftwarePackage > packages = new ArrayList < > ( ) ;
      for ( Map < String , String > resultMap : resultMaps ) {
        packages . add ( RDFClient . SoftwarePackage . newBuilder ( ) . setName ( resultMap . get ( "Name" ) ) . setDescription ( resultMap . get ( "Description" ) ) . setVersion ( resultMap . get ( "Version" ) ) . setInstallState ( status ) . build ( ) ) ;
      }
      if ( packages . size ( ) > 0 ) {
        new SoftwarePackages ( ) . setPackages ( packages ) ;
      }
    }
        public void setDropEnabled(boolean enabled) {
    
            if ((m_dropEnabled != null) && (m_dropEnabled.booleanValue() == enabled)) {
                return;
            }
            m_dropEnabled = Boolean.valueOf(enabled);
        }
    }
}