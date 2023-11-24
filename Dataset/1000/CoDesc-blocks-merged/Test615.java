class Test {
    public class Example {
    public boolean equals(Object other) {
            if (!(other instanceof PropertyNode)) {
                return false;
            }
            PropertyNode otherPropertyNode = (PropertyNode) other;
    
            if (this.property.equals(otherPropertyNode.property)) {
                return true;
            }
            return false;
        }
        @Override
        public String parseUniqueKey(String url) {
            boolean illegal = false;
            if (StringUtils.isBlank(url)) {
                illegal = true;
            }
    
            String uniqueKey = StringUtils.EMPTY;
            String addr = url.trim();
            String[] sectors = StringUtils.split(addr, QUES);
            if (!illegal && sectors.length == 2 && StringUtils.isNotBlank(sectors[0])) {
                uniqueKey = sectors[0].trim();
            } else {
                illegal = true;
            }
    
            if (illegal) {
                throw new IllegalArgumentException("Illegal format address string: " + url);
            }
            return uniqueKey;
        }
        public static Map < String , Double > FierzToBern_chrom ( Map < String , Double > C , String dd , Parameters parameters ) {
      double e = Math . sqrt ( 4 * Math . PI * parameters . alphaE ) ;
      double gs = Math . sqrt ( 4 * Math . PI * parameters . alphaS ) ;
      if ( dd . equals ( "sb" ) || dd . equals ( "db" ) ) {
        double mq = parameters . mB ;
        if ( mq == 0 ) {
          return new HashMap < String , Double > ( ) ;
        }
        else if ( mq == 1 ) {
          return new HashMap < String , Double > ( ) ;
        }
        else {
          throw new IllegalArgumentException ( "Not sure what to do with quark mass for flavour {
    }" , dd ) ;
        }
      }
      return new HashMap < String , Double > ( ) ;
    }
    }
}