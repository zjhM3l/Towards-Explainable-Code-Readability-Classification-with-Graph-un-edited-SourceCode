class Test {
    public class Example {
    public static boolean structurallyMatch ( Base self , Base o ) {
      if ( self . op != o . op ) return false ;
      if ( self . args . length != o . args . length ) return false ;
      for ( int i = 0 ;
      i < self . args . length ;
      i ++ ) {
        Base argA = self . args [ i ] ;
        Base argB = o . args [ i ] ;
        if ( ! ( argA instanceof Base ) ) {
          if ( Type . compare ( argA . type , argB . type ) != 0 ) return false ;
          if ( argA . type != argB . type ) return false ;
          else continue ;
        }
        if ( argA . op == Operations . leafOperations ) {
          if ( argA != argB ) return false ;
        }
        else {
          if ( ! argA . structurallyMatch ( argB ) ) return false ;
        }
      }
      return true ;
    }
        public void saveObject(XMLControl control, Object obj) {
        DrawableShape drawableShape = (DrawableShape) obj;
        control.setValue("geometry", drawableShape.shapeClass);
        control.setValue("x", drawableShape.x);
        control.setValue("y", drawableShape.y);
        control.setValue("theta", drawableShape.theta);
        control.setValue("fill color", drawableShape.color);
        control.setValue("edge color", drawableShape.edgeColor);
        Shape shape = AffineTransform.getRotateInstance(-drawableShape.theta, drawableShape.x, drawableShape.y).createTransformedShape(drawableShape.shape);
        control.setValue("general path", (GeneralPath) shape);
      }
        private void playNext(){
      if (mediaType == Config.YOUTUBE_MEDIA_TYPE_VIDEO) {
        seekVideo(0);
        restartVideo();
        return;
      }
      if (previousWasCalled) {
        previousWasCalled=false;
        iterator.next();
      }
      if (!iterator.hasNext()) {
        iterator=youTubeVideos.listIterator();
      }
      videoItem=iterator.next();
      nextWasCalled=true;
      playVideo();
    }
    }
}