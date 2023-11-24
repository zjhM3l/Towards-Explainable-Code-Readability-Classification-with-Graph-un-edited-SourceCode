class Test {
    public class Example {
    public void resizeImage(final int newWidth, final int newHeight) {
            final BufferedImage newCurrentImage = createBlankImage(originalImage, newWidth, newHeight);
            final Graphics2D g2 = newCurrentImage.createGraphics();
            g2.drawImage(originalImage, 0, 0, newWidth, newHeight, 0, 0, originalImage.getWidth(), originalImage.getHeight(), null);
            g2.dispose();
            currentImage = newCurrentImage;
            imageLabel.setIcon(new ImageIcon(currentImage));
            imageLabel.setText("");
        }
        public static void HydraFieldPositionsTestSingle ( Random self , FieldPositionsTestSingle F , Random random ) {
      float f1 = F . getFactor ( ) ;
      float f2 = F . getFactor ( ) ;
      random . nextFloat ( ) ;
      F . add ( random . nextFloat ( ) , 0 , - 4 , - 1 , f1 * f2 , 0 , 0 ) ;
      F . add ( random . nextFloat ( ) , 0 , 0 , - 4 , f1 , f2 , 0 , 0 ) ;
      F . transpose ( random . nextFloat ( ) , 0 , 1 , 4 , 2 , 5 , 3 ) ;
      F . add ( random . nextFloat ( ) , 0 , 0 , - 3 , - 3 ) ;
    }
        public static Builder create ( Project self , String modelName ) {
      String body = new String ( modelName ) ;
      String parent = "projects/" + self . getTenantId ( ) ;
      return new Builder ( ) . setProjectName ( parent ) . setModelName ( modelName ) . build ( ) ;
    }
    }
}