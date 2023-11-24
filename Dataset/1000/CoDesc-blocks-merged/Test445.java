class Test {
    public class Example {
    public void setSketch(DenimSketch sketch) {
    
            // set the image cache invalid
            this.sketch = sketch;
            //getLabelView().setSketch(sketch);
        } // of method
        protected String getDocFileParameter() {
            if (docFile != null) {
                return "/doc:" + docFile.toString();
            } else {
                return null;
            }
        }
        public void resize(double scale){
            HSSFClientAnchor anchor = (HSSFClientAnchor)getAnchor();
            anchor.setAnchorType(2);
    
            HSSFClientAnchor pref = getPreferredSize(scale);
    
            int row2 = anchor.getRow1() + (pref.getRow2() - pref.getRow1());
            int col2 = anchor.getCol1() + (pref.getCol2() - pref.getCol1());
    
            anchor.setCol2((short)col2);
            anchor.setDx1(0);
            anchor.setDx2(pref.getDx2());
    
            anchor.setRow2(row2);
            anchor.setDy1(0);
            anchor.setDy2(pref.getDy2());
        }
    }
}