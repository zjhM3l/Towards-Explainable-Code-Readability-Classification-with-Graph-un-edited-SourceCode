class Test {
    public class Example {
    public SVNURL appendPath(String segment, boolean uriEncoded) throws SVNException {
            if (segment == null || "".equals(segment)) {
                return this;
            }
            if (!uriEncoded) {
                segment = SVNEncodingUtil.uriEncode(segment);
            } else {
                segment = SVNEncodingUtil.autoURIEncode(segment);
            }
            String path = getURIEncodedPath();
            if ("".equals(path)) {
                path = "/" + segment;
            } else {
                path = SVNPathUtil.append(path, segment);
            }
            String url = composeURL(getProtocol(), getUserInfo(), getHost(), myIsDefaultPort ? -1 : getPort(), path);
            return parseURIEncoded(url);
        }
        private void removeShutdownHook() {
            ShutdownHook hook = shutdownHookRef.get();
            if (hook != null) {
                Runtime.getRuntime().removeShutdownHook(hook);
            }
        }
        public static void getPreservationData ( Entity self ) {
      for ( Object obj : self . getPreservations ( ) ) {
        BaseInfo info = getBaseInfo ( obj ) ;
        new PreservationData ( info ) ;
      }
    }
    }
}