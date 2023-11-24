class Test {
    public class Example {
    public static void close ( File self ) {
      if ( self . tmpdir != null ) {
        delete ( self . tmpdir ) ;
        self . tmpdir = null ;
      }
      self . contents = null ;
    }
        public static void gaussianFilter ( DenseMatrix64F mat , int M , int axis ) {
      for ( int i = 0 ;
      i < mat . numRows ;
      i ++ ) {
        if ( axis == 1 ) {
          mat . set ( i , 0 , filters . gaussianFilter ( mat . get ( i ) , sigma / 2. ) ) ;
        }
        else if ( axis == 0 ) {
          mat . set ( i , 0 , filters . gaussianFilter ( mat . get ( i ) , sigma / 2. ) ) ;
        }
      }
    }
        public static Iterator < Genotypes > iterateGenotypes ( VariantData self ) {
      for ( VariantData v : self . getVvcData ( ) ) {
        Set < Allele > alleles = new HashSet < Allele > ( v . getRef ( ) ) ;
        alleles . addAll ( v . getAlt ( ) ) ;
        if ( self . getQualityField ( ) != null ) {
          ImputedVariant variant = new ImputedVariant ( v . getID ( ) , v . getCHROM ( ) , v . getPOS ( ) , alleles , ( VariantData ) v ) ;
          if ( v . getVariantField ( ) != null ) {
            for ( String codedAllele : makeGenotypes ( v . getAlt ( ) , v . getGenotypes ( ) ) ) {
              yield ( variant , v , v . getRef ( ) , codedAllele , multiAllelic ( v . getAlt ( ) . size ( ) > 1 ) ) ;
            }
          }
        }
      }
      return new Iterator < Genotypes > ( ) {
        @ Override public boolean hasNext ( ) {
          return true ;
        }
        @ Override public Genotypes next ( ) {
          Genotypes gen = makeGenotypes ( v . getAlt ( ) , v . getGenotypes ( ) ) ;
          if ( gen == null ) {
            throw new NoSuchElementException ( ) ;
          }
          gen . setVariant ( variant ) ;
          gen . setGenotypes ( v . getRef ( ) ) ;
          gen . setMultiAllelic ( multiAllelic ( v . getAlt ( ) . size ( ) > 1 ) ) ;
          return gen ;
        }
      };
    }
    }
}