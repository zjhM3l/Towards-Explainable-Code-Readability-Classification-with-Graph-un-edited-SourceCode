class Test {
    public class Example {
    public static void recordOmniboxNavigation(String destinationUrl,int transitionType){
      if ((transitionType & PageTransition.CORE_MASK) == PageTransition.GENERATED) {
        recordAction(ACTION_SEARCHED_USING_OMNIBOX);
      }
     else {
        if (UrlUtilities.nativeIsGoogleHomePageUrl(destinationUrl)) {
          recordAction(ACTION_NAVIGATED_TO_GOOGLE_HOMEPAGE);
        }
     else {
          recordAction(ACTION_NAVIGATED_USING_OMNIBOX);
        }
        recordExplicitUserNavigation(destinationUrl,RAPPOR_ACTION_NAVIGATED_USING_OMNIBOX);
      }
    }
        public boolean isCurrent(String first,char second){
      int start=pos;
      if (!forwardIfCurrent(first))   return false;
      removeSpace();
      boolean rtn=isCurrent(second);
      pos=start;
      return rtn;
    }
        public Matrix4x3f ortho2DLH(float left, float right, float bottom, float top, Matrix4x3f dest) {
            // calculate right matrix elements
            float rm00 = 2.0f / (right - left);
            float rm11 = 2.0f / (top - bottom);
            float rm30 = -(right + left) / (right - left);
            float rm31 = -(top + bottom) / (top - bottom);
    
            // perform optimized multiplication
            // compute the last column first, because other columns do not depend on it
            dest.m30 = m00 * rm30 + m10 * rm31 + m30;
            dest.m31 = m01 * rm30 + m11 * rm31 + m31;
            dest.m32 = m02 * rm30 + m12 * rm31 + m32;
            dest.m00 = m00 * rm00;
            dest.m01 = m01 * rm00;
            dest.m02 = m02 * rm00;
            dest.m10 = m10 * rm11;
            dest.m11 = m11 * rm11;
            dest.m12 = m12 * rm11;
            dest.m20 = m20;
            dest.m21 = m21;
            dest.m22 = m22;
            dest.properties = properties & ~(PROPERTY_IDENTITY | PROPERTY_TRANSLATION | PROPERTY_ORTHONORMAL);
    
            return dest;
        }
    }
}