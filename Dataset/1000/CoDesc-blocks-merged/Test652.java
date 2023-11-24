class Test {
    public class Example {
    public boolean check() throws Exception {
            if (this.id == null) {
                throw new Exception("id == null");
            }
            if (this.startDate == null) {
                throw new Exception("startDate == null");
            }
            /*
            if (this.end == null)
            {
                throw new Exception("end == null");
            }
             */
            return true;
        }
        public static double [ ] [ ] labelsToMatrix ( Iio . ANTsImage image , Iio . ANTsImage mask , int [ ] targetLabels , double missingVal ) {
      if ( ( image == null ) || ( mask == null ) ) {
        throw new IllegalArgumentException ( "image and mask must be ANTsImage types" ) ;
      }
      double [ ] vec = image . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask > 0 ? mask . get ( mask ) : mask . get ( mask ) ) : mask . get ( mask ) ) ) : null ) ) ) ;
      if ( targetLabels != null ) {
        int [ ] theLabels = targetLabels ;
        if ( theLabels != null ) {
          theLabels = Arrays . copyOf ( Arrays . copyOf ( vec , theLabels . length ) , theLabels . length ) ;
        }
        int nLabels = theLabels . length ;
        double [ ] labels = new double [ nLabels ] ;
        for ( int i = 0 ;
        i < nLabels ;
        i ++ ) {
          double lab = ( double ) theLabels [ i ] ;
          double filler = ( vec [ i ] == lab ) ? missingVal : ( vec [ i ] == lab ) ? 0 : 1 ;
          if ( Double . isNaN ( filler ) ) {
            filler = Double . NaN ;
          }
          labels [ i ] = filler ;
        }
      }
      return labels ;
    }
        public Observable<GalleryImageInner> updateAsync(String resourceGroupName, String labAccountName, String galleryImageName, GalleryImageFragment galleryImage) {
            return updateWithServiceResponseAsync(resourceGroupName, labAccountName, galleryImageName, galleryImage).map(new Func1<ServiceResponse<GalleryImageInner>, GalleryImageInner>() {
                @Override
                public GalleryImageInner call(ServiceResponse<GalleryImageInner> response) {
                    return response.body();
                }
            });
        }
    }
}