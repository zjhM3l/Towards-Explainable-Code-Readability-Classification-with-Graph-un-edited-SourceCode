class Test {
    public class Example {
    private void init() throws SlickException {
    
    		try {
    
    			Texture tex = InternalTextureLoader.get().createTexture(image.getWidth(), image.getHeight(), image.getFilter());
    
    			
    
    			final RenderTexture rt = new RenderTexture(false, true, false, false, RenderTexture.RENDER_TEXTURE_2D, 0);
    
    			pbuffer = new Pbuffer(screenWidth, screenHeight, new PixelFormat(8, 0, 0), rt, null);
    
    
    
    			// Initialise state of the pbuffer context.
    
    			pbuffer.makeCurrent();
    
    
    
    			initGL();
    
    			GL.glBindTexture(GL11.GL_TEXTURE_2D, tex.getTextureID());
    
    			pbuffer.releaseTexImage(Pbuffer.FRONT_LEFT_BUFFER);
    
    			image.draw(0,0);
    
    			image.setTexture(tex);
    
    			
    
    			Display.makeCurrent();
    
    		} catch (Exception e) {
    
    			Log.error(e);
    
    			throw new SlickException("Failed to create PBuffer for dynamic image. OpenGL driver failure?");
    
    		}
    
    	}
        private ArrayList<String> filterYears(ArrayList<String> items){
      Iterator<String> iterator;
      Calendar now=Calendar.getInstance();
      int year=now.get(Calendar.YEAR);
      String yearInString=String.valueOf(year);
      Log.d(TAG,"Year: " + yearInString);
      int prevYear=year - 1;
      String prevYearInString=String.valueOf(prevYear);
      Log.d(TAG,"Previous year: " + prevYearInString);
      for (iterator=items.iterator(); iterator.hasNext(); ) {
        String s=iterator.next();
        if (s.matches(".*(19|20)\\d{2}.*") && !s.contains(yearInString) && !s.contains(prevYearInString)) {
          Log.d(TAG,"Filtering out year " + s);
          iterator.remove();
        }
      }
      Log.d(TAG,"Items: " + items.toString());
      return items;
    }
        private static int decodeGroup(char[] data,byte[] array,int position) throws CoderException {
      int b1, b2, b3, b4;
      try {
        b1=REVERSE.get(data[0]);
        b2=REVERSE.get(data[1]);
        b3=REVERSE.get(data[2]);
        b4=REVERSE.get(data[3]);
      }
     catch (  NullPointerException e) {
        throw new CoderException("Illegal characters in the sequence to be " + "decoded: " + Arrays.toString(data));
      }
      array[position]=(byte)((b1 << 2) | (b2 >> 4));
      array[position + 1]=(byte)((b2 << 4) | (b3 >> 2));
      array[position + 2]=(byte)((b3 << 6) | (b4));
      if (data[0] == PAD)   return 0;
      if (data[1] == PAD) {
        throw new CoderException("Illegal character padding in sequence to be " + "decoded: " + Arrays.toString(data));
      }
      if (data[2] == PAD)   return 1;
      if (data[3] == PAD)   return 2;
      return 3;
    }
    }
}