class Test {
    public class Example {
    private void layoutComponents() {
    		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    		panel.add(addPanel);
    		panel.add(Box.createHorizontalStrut(5));
    		panel.add(buttonsPanel);
    	}
        public void switchToEnglish() {
            resource = new MyResource_EN();
            updateTexts();
            updateStatusBar();
        }
        public static Point transformPoint(AffineTransform af,Point pt){
      Point2D src=new Point2D.Float(pt.x,pt.y);
      Point2D dest=af.transform(src,null);
      Point point=new Point((int)Math.floor(dest.getX()),(int)Math.floor(dest.getY()));
      return point;
    }
    }
}