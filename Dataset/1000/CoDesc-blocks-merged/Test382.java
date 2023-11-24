class Test {
    public class Example {
    public GridTcpRestNioListener(IgniteLogger log,GridTcpRestProtocol proto,GridRestProtocolHandler hnd,GridKernalContext ctx){
      memcachedLsnr=new GridTcpMemcachedNioListener(log,hnd,ctx);
      this.log=log;
      this.proto=proto;
      this.hnd=hnd;
    }
        public String getFeedback() {
        String returnString = this.feedback;
        this.feedback = "";
        return returnString;
      }
        private void executeDeferredScriptsIfNeeded() {
            if (!getWebClient().isJavaScriptEnabled()) {
                return;
            }
            if (getWebClient().getBrowserVersion().hasFeature(BrowserVersionFeatures.JS_DEFERRED)) {
                final HtmlElement doc = getDocumentElement();
                final List<HtmlElement> elements = doc.getHtmlElementsByTagName("script");
                for (final HtmlElement e : elements) {
                    if (e instanceof HtmlScript) {
                        final HtmlScript script = (HtmlScript) e;
                        if (script.isDeferred()) {
                            script.executeScriptIfNeeded();
                        }
                    }
                }
            }
        }
    }
}