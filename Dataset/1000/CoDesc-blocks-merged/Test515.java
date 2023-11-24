class Test {
    public class Example {
    public static JsonObject toMap ( Macaroon self ) {
      if ( self . getVersion ( ) < VERSION_3 ) {
        if ( self . getCaveatData ( ) . size ( ) > 0 ) {
          throw new IllegalArgumentException ( "cannot serialize pre-version3 macaroon with " + "external caveat data" ) ;
        }
        return new JsonObject ( ) ;
      }
      JsonObject serialized = new JsonObject ( ) ;
      serialized . addProperty ( "m" , new JsonArray ( ) ) ;
      serialized . addProperty ( "v" , self . getVersion ( ) ) ;
      if ( self . getNamespace ( ) != null ) {
        serialized . addProperty ( "ns" , self . getNamespace ( ) . serializeText ( ) . toString ( ) ) ;
      }
      JsonObject caveatData = new JsonObject ( ) ;
      for ( String id : self . getCaveatData ( ) ) {
        String key = Base64 . encodeBase64URLSafeString ( id ) . trim ( ) ;
        String value = Base64 . encodeBase64URLSafeString ( self . getCaveatData ( ) . get ( id ) ) . trim ( ) ;
        caveatData . addProperty ( key , value ) ;
      }
      if ( caveatData . size ( ) > 0 ) {
        serialized . addProperty ( "cdata" , caveatData ) ;
      }
      return serialized ;
    }
        private void unmap(Group group) {
        Set<Role> roles = findRoles(group);
        if ((roles != null) && (roles.size() > 0)) {
          for (Iterator<Role> iterator = roles.iterator(); iterator.hasNext();) {
            Role role = (Role) iterator.next();
            unmap(group, role); // FIXME BUG RESTLET SUR LE UNMAP
          }
        }
      }
        private void createCmpNavigatorRoot() {
            this.cmpNavigatorRoot = new ViewForm(this.sashForm, SWT.BORDER | SWT.FLAT);
            createCmpNavigator();
            this.cmpNavigatorRoot.setContent(this.cmpNavigator);
        }
    }
}