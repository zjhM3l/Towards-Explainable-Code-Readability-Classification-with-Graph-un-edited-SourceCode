class Test {
    public class Example {
    public boolean putNull(int row, int col) {
            acquireReference();
            try {
                return putNull_native(row - mStartPos, col);
            } finally {
                releaseReference();
            }
        }
        public PrintItemBarcode(String type,String position,String code,double scale){
      m_sCode=code;
      this.scale=1.5;
      if (DevicePrinter.BARCODE_CODE128.equals(type)) {
        m_barcode=new Code128Bean();
      }
     else {
        m_barcode=new EAN13Bean();
      }
      if (m_barcode != null) {
        m_barcode.setModuleWidth(1.0);
        m_barcode.setBarHeight(40.0);
        m_barcode.setFontSize(10.0);
        m_barcode.setQuietZone(10.0);
        m_barcode.doQuietZone(true);
        if (DevicePrinter.POSITION_NONE.equals(position)) {
          m_barcode.setMsgPosition(HumanReadablePlacement.HRP_NONE);
        }
     else {
          m_barcode.setMsgPosition(HumanReadablePlacement.HRP_BOTTOM);
        }
        BarcodeDimension dim=m_barcode.calcDimensions(m_sCode);
        m_iWidth=(int)dim.getWidth(0);
        m_iHeight=(int)dim.getHeight(0);
      }
    }
        protected boolean isPresentInheritedCmdHandler(final String cmdName) {
            final String inheritedModule = getInheritedModule(cmdName);
            if (null==inheritedModule) {
                throw new FrameworkResourceException(cmdName + " not an inherited command", this);
            }
            logger.debug(cmdName + " command inherited from module : " + inheritedModule);
            if (moduleLookup.existsCmdModule(inheritedModule)) {
                final CmdModule m = moduleLookup.getCmdModule(inheritedModule);
                return m.existsCmdHandler(cmdName);
            } else {
                logger.warn(cmdName + " command inherited from module '"
                        + inheritedModule + "' but the module was not found");
                return false;
            }
        }
    }
}