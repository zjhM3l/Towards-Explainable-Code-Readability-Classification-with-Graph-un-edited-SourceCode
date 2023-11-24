class Test {
    public class Example {
    public void addQualifier(CIMQualifier pQualifier) {
    		if (pQualifier == null) throw new IllegalArgumentException("null qualifier argument");
    
    		if (getQualifier(pQualifier.getName()) == null) Utils.addSorted(iQualifiers, pQualifier);
    	}
        public void pageStarted(Document aDocument, Page aPage, int aPageNumber) {
                GraphicsEngine ge = aPage.createGraphics();
                String font = aDocument.createFont("/Times-Roman");
                aPage.addFont(font);
                ge.setFont(font, 8);
                String s = String.valueOf(aPageNumber);
                double w = BaseMetrics.getInstance().getFont("/Times-Roman").getStringLength(s, 8);
                Rect media = aPage.getMediaBox();
                ge.setTextPos(media.getX2()-w-20, media.getY1()+30);
                ge.writeText(s);
                ge.close();
            }
        public String namesPackages (Set listPackages) {
        Iterator iterator = listPackages.iterator();
        String packages = new String();
        while (iterator.hasNext()) {
          String currentPackage = (String)iterator.next();
          if ((!currentPackage.equals("gate.*"))&&
             (!currentPackage.equals("gate.creole.*"))&&
             (!currentPackage.equals("gate.util.*"))&&
             (!currentPackage.equals("java.util.*")))
              packages = packages + newLine + "import "+ currentPackage+";";
        }// while
        return packages;
      }
    }
}