class Test {
    public class Example {
    public int getMinorPart() {
            int cdp = getCurrencyUnit().getDecimalPlaces();
            return iAmount.setScale(cdp, RoundingMode.DOWN)
                        .remainder(BigDecimal.ONE)
                        .movePointRight(cdp).intValueExact();
        }
        public void setA(C4 a) {
          this.a = (C4) a;
          if (a == null) {
             a_aId = null;
          }
       }
        public static nnabla_pb2 . Function generateBroadcastTo ( String nodeName , float x , float y , String outName , int axis , String baseName , int funcCounter ) {
      nnabla_pb2 . Function bt = new nnabla_pb2 . Function ( ) ;
      bt . type = "BroadcastTo" ;
      setFunctionName ( bt , nodeName , baseName , funcCounter ) ;
      bt . input . add ( x ) ;
      bt . output . add ( y ) ;
      nnabla_pb2 . BroadcastToParam btp = bt . broadcast_to_param ;
      btp . axis = axis ;
      return bt ;
    }
    }
}