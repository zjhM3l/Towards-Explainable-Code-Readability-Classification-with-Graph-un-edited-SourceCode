class Test {
    public class Example {
    public void disconnect() {
        try {
          if(con != null)
            con.close();
        } catch(SQLException ex) {
          errMsg = ex.getMessage();
        }
      }
        private static VisualNode visualBoundsAt ( VisualNode self , Point pos , VisualNode node ) {
      if ( node == null ) node = self . getScene ( ) ;
      for ( int i = 0 ;
      i < node . getChildCount ( ) ;
      i ++ ) {
        VisualNode hit = visualBoundsAt ( pos , node . getChild ( i ) ) ;
        if ( hit != null ) return hit ;
      }
      if ( ( ! ( node instanceof VisualNode ) || ! ( node instanceof VisualNode ) ) && ( node instanceof VisualNode ) ) return null ;
      Rectangle2D bounds = new Rectangle2D . Double ( node . getBounds ( ) , 0 , 0 ) ;
      if ( null == bounds ) return null ;
      AffineTransform tr = self . getTransform ( ) . getInverse ( ) ;
      Point2D . Double corners = new Point2D . Double ( bounds . getX ( ) . getX ( ) , bounds . getY ( ) . getY ( ) ) ;
      bounds = tr . map ( corners ) ;
      boolean xHit = bounds . getX ( ) . min ( ) < pos . x && bounds . getX ( ) . max ( ) < pos . x ;
      boolean yHit = bounds . getY ( ) . min ( ) < pos . y && bounds . getY ( ) . max ( ) < pos . y ;
      if ( xHit && yHit ) return node ;
      return null ;
    }
        public void setSchema(Representation schemaRepresentation) {
            try {
                this.schema = getSchema(schemaRepresentation);
            } catch (Exception e) {
                Context.getCurrentLogger().log(Level.WARNING,
                        "Unable to compile the schema representation", e);
            }
        }
    }
}