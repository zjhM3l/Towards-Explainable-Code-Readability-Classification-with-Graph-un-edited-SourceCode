class Test {
    public class Example {
    @Override public void onPaymentProductCallComplete(PaymentProduct paymentProduct){
      paymentRequest.setPaymentProduct(paymentProduct);
      inputDataPersister.setPaymentItem(paymentProduct);
      showDrawableInEditText(paymentProduct.getId());
      renderInputFieldsLayout.removeAllViews();
      renderInputFields(true);
    }
        public void run(){	
    		synchronized (waitBuff) {
    			try {
    				while ( state.equalsIgnoreCase(RECORDING))
    					waitBuff.wait();
    			} catch (Exception e) {}
    		}								
    		recorderThread=null;									
    	}
        public boolean setDebug(String... value) {
    
            for (String s : value) {
                try {
                    if ("all".equals(s)) {
                        for (ExBibDebug d : ExBibDebug.values()) {
                            debug.add(d);
                        }
                    } else if ("none".equals(s)) {
                        debug.clear();
                    } else {
                        setDebug(ExBibDebug.valueOf(s.toUpperCase(Locale.ENGLISH)));
                    }
                } catch (IllegalArgumentException e) {
                    return logBanner("debug.mode.unknown", s);
                }
            }
            return true;
        }
    }
}