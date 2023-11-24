class Test {
    public class Example {
    public Object invoke(Invocation mi) throws Throwable {
            Object value = null;
            try {
                value = getNext().invoke(mi);
            } catch (NamingException e) {
                throw e;
            } catch (IOException e) {
                CommunicationException ce = new CommunicationException("Operation failed");
                ce.setRootCause(e);
                throw ce;
            } catch (Throwable t) {
                ServiceUnavailableException sue = new ServiceUnavailableException("Unexpected failure");
                sue.setRootCause(t);
                throw sue;
            }
    
            return value;
        }
        protected String printMethodArgs(List<Type> args, boolean varArgs, Locale locale) {
            if (!varArgs) {
                return visitTypes(args, locale);
            } else {
                StringBuilder buf = new StringBuilder();
                while (args.tail.nonEmpty()) {
                    buf.append(visit(args.head, locale));
                    args = args.tail;
                    buf.append(',');
                }
                if (args.head.hasTag(TypeTag.ARRAY)) {
                    buf.append(visit(((ArrayType) args.head).elemtype, locale));
                    if (args.head.getAnnotationMirrors().nonEmpty()) {
                        buf.append(' ');
                        buf.append(args.head.getAnnotationMirrors());
                        buf.append(' ');
                    }
                    buf.append("...");
                } else {
                    buf.append(visit(args.head, locale));
                }
                return buf.toString();
            }
        }
        public static void gatherBy ( Cursor self , Runnable runnable ) {
      for ( int i = rotateRange ( self . rows . length , self . cursorRowIndex ) ;
      i < self . rows . length ;
      i ++ ) {
        try {
          Row r = self . rows [ i ] ;
          if ( runnable . run ( ) ) {
            runnable . run ( ) ;
          }
        }
        catch ( Exception e ) {
          e . printStackTrace ( ) ;
        }
      }
    }
    }
}