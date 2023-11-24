class Test {
    public class Example {
    @DSComment("Private Method") @DSBan(DSCat.PRIVATE_METHOD) @DSGenerator(tool_name="Doppelganger",tool_version="2.0",generated_on="2013-12-30 12:32:18.368 -0500",hash_original_method="D9B7EDD91437C9CF7E31BD236F25B8F3",hash_generated_method="069FA18CB3D91513A755E62D6A4898A5") private void measureAndAdjustDown(View child,int childIndex,int numChildren){
      int oldHeight=child.getHeight();
      measureItem(child);
      if (child.getMeasuredHeight() != oldHeight) {
        relayoutMeasuredItem(child);
        final int heightDelta=child.getMeasuredHeight() - oldHeight;
        for (int i=childIndex + 1; i < numChildren; i++) {
          getChildAt(i).offsetTopAndBottom(heightDelta);
        }
      }
    }
        public void clearTexs(String basePath) {
    		File bp = new File(output_path, basePath);
    		File[] files = bp.listFiles();
    		if(files!=null)
    			for(File f : files)
    				f.delete();
    		bp.delete();
    	}
        protected void setDescribedType(Class<?> type) {
            if (type.getSuperclass() != null && "java.lang.Enum".equals
                (type.getSuperclass().getName()))
                throw new MetaDataException(_loc.get("enum", type));
            _type = type;
            _typeString = _type.getName();
            _hashCode = _typeString.hashCode();
            if (PersistenceCapable.class.isAssignableFrom(type))
                setIntercepting(true);
        }
    }
}