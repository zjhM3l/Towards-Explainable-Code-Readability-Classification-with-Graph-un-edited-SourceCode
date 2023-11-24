class Test {
    public class Example {
    public synchronized void setDeviceName(String name) {
            if (name.getBytes().length > DEVICE_NAME_LENGTH) {
                throw new IllegalArgumentException("name cannot be more than " + DEVICE_NAME_LENGTH + " bytes long");
            }
            Arrays.fill(announcementBytes, DEVICE_NAME_OFFSET, DEVICE_NAME_LENGTH, (byte)0);
            System.arraycopy(name.getBytes(), 0, announcementBytes, DEVICE_NAME_OFFSET, name.getBytes().length);
        }
        private static < C extends Collection < ? >> C selectLoci ( C c ) {
      Map < String , Integer > lociLen = new HashMap < String , Integer > ( ) ;
      lociLen . putAll ( c . loci2seq . entrySet ( ) ) ;
      logger . debug ( "selectLoci: number of loci " + c . loci2seq . keySet ( ) ) ;
      List < Integer > lociLenSort = new ArrayList < Integer > ( lociLen . entrySet ( ) ) ;
      Collections . sort ( lociLenSort , new Comparator < Integer > ( ) {
        @ Override public int compare ( Integer o1 , Integer o2 ) {
          int maxSize = lociLenSort . get ( o1 ) . intValue ( ) ;
          logger . debug ( "selectLoci: max size " + maxSize ) ;
          return maxSize - lociLenSort . get ( o2 ) . intValue ( ) ;
        }
      }
      ) ;
      Map < String , Integer > lociClean = new HashMap < String , Integer > ( ) ;
      lociClean . putAll ( c . loci2seq . entrySet ( ) ) ;
      for ( Map . Entry < String , Integer > lociClean : lociLenSort . entrySet ( ) ) {
        lociClean . put ( locus , c . loci2seq . get ( locus ) ) ;
      }
      Collection < String > removed = Arrays . asList ( c . idmembers . keySet ( ) ) . stream ( ) . filter ( c :: isIdMember ) . collect ( Collectors . toSet ( ) ) ;
      c . addIdMember ( removed , lociLenSort . get ( 0 ) . intValue ( ) ) ;
      logger . debug ( "selectLoci: number of loci " + c . loci2seq . keySet ( ) + " after cleaning" ) ;
      return c ;
    }
        public void testDateConstructor1() {
    
            TimeZone zone = TimeZone.getTimeZone("GMT");
            Minute m1 = new Minute(new Date(1016729699999L), zone);
            Minute m2 = new Minute(new Date(1016729700000L), zone);
    
            assertEquals(54, m1.getMinute());
            assertEquals(1016729699999L, m1.getLastMillisecond(zone));
    
            assertEquals(55, m2.getMinute());
            assertEquals(1016729700000L, m2.getFirstMillisecond(zone));
    
        }
    }
}