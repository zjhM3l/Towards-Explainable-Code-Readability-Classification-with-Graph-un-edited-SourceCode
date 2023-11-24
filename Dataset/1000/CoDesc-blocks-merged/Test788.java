class Test {
    public class Example {
    public void enablePopup(boolean enable ){
            if( enable ){
                final JPopupMenu menu = new JPopupMenu();
    
    			// adds popup menu items from the TextPad
    			ArrayList list = createPopupActions();
    			for (int i = 0; i < list.size(); i++) {
    				menu.add((Action)list.get(i));
    			}
    							
    			// adds the spell checker menu items
                addMouseListener( new TextPadPopupListener(menu) );
            } else {
    			MouseListener[] listeners = getMouseListeners();
                for (int i = 0; i < listeners.length; i++){
                    if(listeners[i] instanceof TextPadPopupListener){
                        removeMouseListener( listeners[i] );
                    }
                }
            }
        }
        public static < K , V , T extends Comparable < T >> ReduceByKey < K , V , T > of ( ReduceByKey < K , V , T > self , Function < ? super T , ? extends K > func , int numPartitions ) {
      if ( numPartitions == 0 ) {
        return self ;
      }
      return self . combineByKey ( new ReduceByKey < K , V , T > ( self , func , func , numPartitions ) ) ;
    }
        public CertificateBody(DERApplicationSpecific certificateProfileIdentifier,CertificationAuthorityReference certificationAuthorityReference,PublicKeyDataObject publicKey,CertificateHolderReference certificateHolderReference,CertificateHolderAuthorization certificateHolderAuthorization,PackedDate certificateEffectiveDate,PackedDate certificateExpirationDate){
      setCertificateProfileIdentifier(certificateProfileIdentifier);
      setCertificationAuthorityReference(new DERApplicationSpecific(EACTags.ISSUER_IDENTIFICATION_NUMBER,certificationAuthorityReference.getEncoded()));
      setPublicKey(publicKey);
      setCertificateHolderReference(new DERApplicationSpecific(EACTags.CARDHOLDER_NAME,certificateHolderReference.getEncoded()));
      setCertificateHolderAuthorization(certificateHolderAuthorization);
      try {
        setCertificateEffectiveDate(new DERApplicationSpecific(false,EACTags.APPLICATION_EFFECTIVE_DATE,new DEROctetString(certificateEffectiveDate.getEncoding())));
        setCertificateExpirationDate(new DERApplicationSpecific(false,EACTags.APPLICATION_EXPIRATION_DATE,new DEROctetString(certificateExpirationDate.getEncoding())));
      }
     catch (  IOException e) {
        throw new IllegalArgumentException("unable to encode dates: " + e.getMessage());
      }
    }
    }
}