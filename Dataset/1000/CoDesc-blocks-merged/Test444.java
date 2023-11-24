class Test {
    public class Example {
    public long getClipsTotalSize(Vector oids) {
            long size = 0;
            MP3Meta meta;
            DataPool dp = this.getDataPool();
    
            for (Iterator iter = oids.iterator(); iter.hasNext();) {
                meta = dp.getMeta((Long) iter.next());
                if (meta != null) {
                    size += meta.getFilesize();
                }
            }
    
            logger.fine("summarized size of " + oids.size() + " clips was " + size);
    
            return size;
        }
        public String toString() {
            String _qNameAsString = qNameAsString;
            if (_qNameAsString == null) {
                final int nsLength = namespaceURI.length();
                if (nsLength == 0) {
                    _qNameAsString = localPart;
                }
                else {
                    StringBuffer buffer = new StringBuffer(nsLength + localPart.length() + 2);
                    buffer.append('{');
                    buffer.append(namespaceURI);
                    buffer.append('}');
                    buffer.append(localPart);
                    _qNameAsString = buffer.toString();
                }
                qNameAsString = _qNameAsString;
            }
            return _qNameAsString;
        }
        private int addView( DMatrixRMaj P , Point2D_F64 a , int index ) {
    
    		final double sx = stats.stdX, sy = stats.stdY;
    //		final double cx = stats.meanX, cy = stats.meanY;
    
    
    		// Easier to read the code when P is broken up this way
    		double r11 = P.data[0], r12 = P.data[1], r13 = P.data[2],  r14=P.data[3];
    		double r21 = P.data[4], r22 = P.data[5], r23 = P.data[6],  r24=P.data[7];
    		double r31 = P.data[8], r32 = P.data[9], r33 = P.data[10], r34=P.data[11];
    
    		// These rows are derived by applying the scaling matrix to pixels and camera matrix
    		// px = (a.x/sx - cx/sx)
    		// A[0,0] = a.x*r31 - r11            (before normalization)
    		// A[0,0] = px*r31 - (r11-cx*r31)/sx (after normalization)
    
    		// first row
    		A.data[index++] = (a.x*r31-r11)/sx;
    		A.data[index++] = (a.x*r32-r12)/sx;
    		A.data[index++] = (a.x*r33-r13)/sx;
    		A.data[index++] = (a.x*r34-r14)/sx;
    
    		// second row
    		A.data[index++] = (a.y*r31-r21)/sy;
    		A.data[index++] = (a.y*r32-r22)/sy;
    		A.data[index++] = (a.y*r33-r23)/sy;
    		A.data[index++] = (a.y*r34-r24)/sy;
    
    		return index;
    	}
    }
}