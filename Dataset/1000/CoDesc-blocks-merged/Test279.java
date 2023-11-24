class Test {
    public class Example {
    public static void setConcurrencyOptions ( ClientConnection self , boolean threadSafe , boolean handlerThread ) {
      if ( handlerThread ) {
        assert threadSafe : "handlerThread=true requires threadSafe=true" ;
      }
      self . _server . clientConnectionFactory = ( threadSafe ? new ThreadsafeClientConnection ( ) : new ClientConnection ( ) ) ;
      if ( handlerThread ) {
        self . _handlerThread = new MessageHandlerThread ( self . handleMessage , self . createLogInform , self . _logger ) ;
        self . onMessage = self . _handlerThread . onMessage ;
      }
      else {
        self . onMessage = returnFuture ( self . handleMessage ) ;
        self . _handlerThread = null ;
      }
      self . _concurrencyOptions = ObjectUtil . newMap ( threadSafe , handlerThread ) ;
    }
        public void setSaveNeeded(boolean b) {
            _saveNeeded = b;
            updateEnabledStates();
    
            // fire a change event for the edit state
            _imageChangeEvent.setEditStateChanged(true);
            fireChange(_imageChangeEvent);
        }
        public FormKey displayCriteria() throws ApplicationExceptions, FrameworkException {
            // .//GEN-END:_displayCriteria_1_be
            // Add custom code before processing the method //GEN-FIRST:_displayCriteria_1
    
    
            // .//GEN-LAST:_displayCriteria_1
            // .//GEN-BEGIN:_displayCriteria_2_be
            initCriteriaScreen();
            return new FormKey(ChangeHistoryFinderCriteriaForm.NAME, getComponentId());
        }
    }
}