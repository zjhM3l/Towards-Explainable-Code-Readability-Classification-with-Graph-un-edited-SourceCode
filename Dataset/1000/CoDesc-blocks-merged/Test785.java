class Test {
    public class Example {
    public void setSubscriptions(java.util.Collection<Subscription> subscriptions) {
            if (subscriptions == null) {
                this.subscriptions = null;
                return;
            }
    
            this.subscriptions = new com.amazonaws.internal.SdkInternalList<Subscription>(subscriptions);
        }
        public void transform(Matrix4f m){
    		m.transform(p1, p1t);
    		m.transform(p2, p2t);
    		m.transform(p3, p3t);
    		computePlane();
    	}
        public double sample(final PixelMatrix pixelMatrix) {
            if (pixelMatrix == null) {
                throw new IllegalArgumentException("pixelMatrix must not be null");
            }
            Image image = pixelMatrix.view(receptiveField);
            BufferedImage bufferedImage = toBufferedImage(image);
            sample = filter.filter(bufferedImage);
            return sample;
        }
    }
}