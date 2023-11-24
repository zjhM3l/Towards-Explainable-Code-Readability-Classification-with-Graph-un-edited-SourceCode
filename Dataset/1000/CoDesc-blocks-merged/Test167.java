class Test {
    public class Example {
    public int getChildRows() {
    		int i = 0;
    		for (int j = childIdx; j < childIdx + childCount; j++) {
    			i += famMember.get(j).getGraphRowCount();
    		}
    		return i;
    	}
        protected void drawDimmedLayer(@NonNull Canvas canvas){
      canvas.save();
      if (mCircleDimmedLayer) {
        canvas.clipPath(mCircularPath,Region.Op.DIFFERENCE);
      }
     else {
        canvas.clipRect(mCropViewRect,Region.Op.DIFFERENCE);
      }
      canvas.drawColor(mDimmedColor);
      canvas.restore();
      if (mCircleDimmedLayer) {
        canvas.drawCircle(mCropViewRect.centerX(),mCropViewRect.centerY(),Math.min(mCropViewRect.width(),mCropViewRect.height()) / 2.f,mDimmedStrokePaint);
      }
    }
        public String getNameString(){
           StringBuffer str=new StringBuffer();
    
           if(nameString==null){
    	 for(int i=0;i<name.size();i++){
    	   Vector rdn=(Vector)name.elementAt(i);
    
    	   if(i>0) str.append(",");
    	   
    	   for(int j=0;j<rdn.size();j++){
    	     String[] ava=(String[])rdn.elementAt(j);
    
    	     if(j>0) str.append("+");
    	     str.append(ava[0]+"="+ava[1]);
    	   }
    	 }
    
    	 nameString=str.toString();
           }
    
           return nameString;
           
         }
    }
}