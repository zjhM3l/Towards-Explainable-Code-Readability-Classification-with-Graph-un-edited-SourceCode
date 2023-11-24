class Test {
    public class Example {
    public void setDisplayTransposed(boolean transposed) {
            if (getModel() instanceof JSCAbstractTableModel)
                ((JSCSArrayTableModel) getModel()).setTransposed(transposed);
            isTransposed = transposed;
        }
        private static List < ModCondition > mapAgentSites ( ModContext self , Agent agent ) {
      if ( agent == null || agent . mods == null ) {
        return Collections . emptyList ( ) ;
      }
      ModCondition newAgent = deepCopy ( agent ) ;
      List < ModCondition > mappedSites = new ArrayList < ModCondition > ( ) ;
      for ( int idx = 0 ;
      idx < agent . mods . size ( ) ;
      idx ++ ) {
        ModCondition modCondition = agent . mods . get ( idx ) ;
        ModCondition mappedSite = self . mapAgentMod ( agent , modCondition ) ;
        if ( mappedSite == null || mappedSite . notInvalid ( ) ) {
          continue ;
        }
        if ( mappedSite . hasMapping ( ) ) {
          ModCondition mc = new ModCondition ( modCondition . getModType ( ) , mappedSite . getMappedRes ( ) , mappedSite . getMappedPos ( ) , modCondition . isModified ( ) ) ;
          newAgent . mods . set ( idx , mc ) ;
        }
        mappedSites . add ( mappedSite ) ;
      }
      return mappedSites ;
    }
        public void updateValueText(byte val){
      if (isDisposed() || position.isDisposed())   return;
      String valBinText="0000000" + Long.toBinaryString(val);
      String valText=CoreMessages.editor_binary_hex_status_line_value + val + " (dec) = "+ Integer.toHexString(0x0ff & val)+ " (binary) = "+ valBinText.substring(valBinText.length() - 8)+ " (bin)";
      value.setText(valText);
    }
    }
}