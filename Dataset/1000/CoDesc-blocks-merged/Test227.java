class Test {
    public class Example {
    public void testSecondDomainLevelCookie() throws Exception {
            BasicClientCookie cookie = new BasicClientCookie("name", null);
            cookie.setDomain(".sourceforge.net");
            cookie.setAttribute(ClientCookie.DOMAIN_ATTR, cookie.getDomain());
            cookie.setPath("/");
            cookie.setAttribute(ClientCookie.PATH_ATTR, cookie.getPath());
    
            CookieSpec cookiespec = new RFC2109Spec();
            CookieOrigin origin = new CookieOrigin("sourceforge.net", 80, "/", false);
            try {
                cookiespec.validate(cookie, origin);
                fail("MalformedCookieException should have been thrown");
            } catch (MalformedCookieException e) {
                // Expected
            }
        }
        public static void configure ( String service , String key , String auth , boolean useSyslogAuth ) throws IOException {
      addKey ( service , key ) ;
      createKeyStore ( service , key ) ;
      String [ ] hosts = getCertificateHosts ( ) ;
      try ( FileOutputStream cephOut = new FileOutputStream ( "/etc/ceph/ceph.conf" ) ) {
        cephOut . write ( CEPH_CONF . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" . getBytes ( ) ) ;
        cephOut . write ( "\n" .
        public ComboBoxArrowButtonPainter(Which state){
      super();
      this.state=state;
      this.ctx=new PaintContext(CacheMode.FIXED_SIZES);
      type=getButtonType(state);
    }
    }
}