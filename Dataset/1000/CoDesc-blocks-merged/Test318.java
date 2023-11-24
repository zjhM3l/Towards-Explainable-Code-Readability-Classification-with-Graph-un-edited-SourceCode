class Test {
    public class Example {
    private static double wiggleInterval ( double value , double wiggle = 0.5 * 44 ) {
      if ( - wiggle < value && value < wiggle ) {
        return 0.0 ;
      }
      else if ( wiggle <= value && value <= 1.0 - wiggle ) {
        return value ;
      }
      else if ( 1.0 - wiggle < value && value < 1.0 + wiggle ) {
        return 1.0 ;
      }
      else {
        return Double . NaN ;
      }
    }
        public Patient getPatient(int id) {
    		PatientHome ph = new PatientHome();
    		Patient retVal = ph.findById(id);
    		if (retVal == null) {
    			logger.warn("patient with id [" + id
    					+ "] not found in the database");
    		}
    		return retVal;
    	}
        protected void drawSideInteriors(DrawContext dc,ShapeData shapeData){
      super.prepareToDrawInterior(dc,this.getActiveSideAttributes(),defaultSideAttributes);
      GL2 gl=dc.getGL().getGL2();
      for (  ExtrudedBoundaryInfo boundary : shapeData) {
        if (!dc.isPickingMode() && this.mustApplyLighting(dc,this.getActiveSideAttributes()))     gl.glNormalPointer(GL.GL_FLOAT,0,boundary.sideNormalBuffer.rewind());
        if (!dc.isPickingMode() && boundary.sideTextureCoords != null) {
          gl.glEnable(GL.GL_TEXTURE_2D);
          gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
          gl.glTexCoordPointer(2,GL.GL_FLOAT,0,boundary.sideTextureCoords.rewind());
        }
     else {
          gl.glDisable(GL.GL_TEXTURE_2D);
          gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
        }
        gl.glVertexPointer(3,GL.GL_FLOAT,0,boundary.sideVertexBuffer.rewind());
        boundary.sideIndices.rewind();
        for (int j=0; j < boundary.faceCount; j++) {
          if (!dc.isPickingMode() && boundary.sideTextureCoords != null) {
            if (!boundary.sideTextures.get(j).bind(dc))         continue;
            boundary.sideTextures.get(j).applyInternalTransform(dc);
          }
          boundary.sideIndices.position(4 * j);
          boundary.sideIndices.limit(4 * (j + 1));
          gl.glDrawElements(GL.GL_TRIANGLE_STRIP,4,GL.GL_UNSIGNED_INT,boundary.sideIndices);
        }
      }
    }
    }
}