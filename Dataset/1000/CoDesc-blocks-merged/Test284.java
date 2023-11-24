class Test {
    public class Example {
    public XmlEvaluableContent getCurrentXmlEvaluableContent() {
    		try {
    			return xmlEvaluableContents.peek();
    		} catch (Exception ex) {
    			return null;
    		}
    	}
        public MaryHeader(ByteBuffer input) throws MaryConfigurationException {
      try {
        this.load(input);
      }
     catch (  BufferUnderflowException e) {
        Log.d(Mary.LOG,"Cannot load mary header" + e);
        throw new MaryConfigurationException("Cannot load mary header",e);
      }
      if (!hasLegalMagic() || !hasLegalType()) {
        throw new MaryConfigurationException("Ill-formed Mary header!");
      }
      assert hasLegalMagic();
      assert hasLegalType();
    }
        public Drawable colorDrawable(Context context,@Nullable Drawable drawable,int color){
      if (!(drawable instanceof BitmapDrawable)) {
        Log.w(LOG_TAG,"Original drawable is not a bitmap! Trying with constant state cloning.");
        return colorUnknownDrawable(drawable,color);
      }
      Bitmap original=((BitmapDrawable)drawable).getBitmap();
      Bitmap copy=Bitmap.createBitmap(original.getWidth(),original.getHeight(),original.getConfig());
      Paint paint=new Paint();
      Canvas c=new Canvas(copy);
      paint.setColorFilter(new PorterDuffColorFilter(color,SRC_ATOP));
      c.drawBitmap(original,0,0,paint);
      return new BitmapDrawable(context.getResources(),copy);
    }
    }
}