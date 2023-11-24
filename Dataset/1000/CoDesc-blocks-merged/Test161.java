class Test {
    public class Example {
    public static void showSummaries ( final Collection < ? extends String > keys , final int indent , final String ... lines ) {
      final FindSummary findSummary = new FindSummary ( ) {
        @ Override public String getKey ( String keyTxt , String doc ) {
          return StringUtil . join ( wrapper . wrap ( doc . substring ( 0 , doc . indexOf ( "\n\n" ) ) ) , "\n" ) ;
        }
      };
      final String strIndent = " " ;
      final TextWrapper wrapper = new TextWrapper ( ) {
        @ Override public int getWidth ( ) {
          return 80 ;
        }
        @ Override public void setText ( String text ) {
          wrapper . setText ( text ) ;
        }
      };
      showDoc ( findSummary , keys , indent , lines ) ;
    }
        private WebDocumentInfo createWebDocumentInfoFromPage(){
      WebDocumentInfo info=new WebDocumentInfo();
      WebDocumentBuilder documentBuilder=new WebDocumentBuilder();
      NodeList<Element> mobileViewport=DomUtil.querySelectorAll(documentElement,"meta[name=\"viewport\"][content*=\"width=device-width\"]");
      DomConverter converter=new DomConverter(documentBuilder);
      converter.setIsMobileFriendly(mobileViewport.getLength() > 0);
      Element walkerRoot=DomUtil.getArticleElement(documentElement);
      converter.setHasArticleElement(walkerRoot != null);
      if (walkerRoot != null) {
        if (LogUtil.isLoggable(LogUtil.DEBUG_LEVEL_BOILER_PIPE_PHASES)) {
          LogUtil.logToConsole("Extracted article element: " + walkerRoot);
        }
      }
     else {
        walkerRoot=documentElement;
      }
      new DomWalker(converter).walk(walkerRoot);
      info.document=documentBuilder.toWebDocument();
      ensureTitleInitialized();
      info.hiddenElements=converter.getHiddenElements();
      return info;
    }
        public void fireTreeChanged(Object source) {
    		for (ITreeModifierListener l : this.listeners) {
    			l.treeModified(new TreeModifiedEvent(source, this));
    		}
    	}
    }
}