class Test {
    public class Example {
    public void testEquals() { 
            Stroke stroke = new BasicStroke(2.0f);
            XYLineAnnotation a1 = new XYLineAnnotation(
                10.0, 20.0, 100.0, 200.0, stroke, Color.blue
            );
            XYLineAnnotation a2 = new XYLineAnnotation(
                10.0, 20.0, 100.0, 200.0, stroke, Color.blue
            );
            assertTrue(a1.equals(a2));
        }
        private CategoryDataset CategoryModelToCategoryDataset(CategoryModel model) {
    		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    		for (final Iterator it = model.getSeries().iterator(); it.hasNext();) {
    			final Comparable series = (Comparable) it.next();
    			for(final Iterator itc = model.getCategories(series).iterator(); itc.hasNext();) {
    				Comparable category = (Comparable) itc.next();
    				Number value = model.getValue(series, category);
    				dataset.setValue(value, series, category);
    			}
    		}
    		return dataset;
    	}
        public NearestNeighbour(int k,boolean weighted,DistanceMetric distanceMetric,VectorCollectionFactory<VecPaired<Vec,Double>> vcf){
      this.mode=null;
      this.vcf=vcf;
      this.k=k;
      this.weighted=weighted;
      this.distanceMetric=distanceMetric;
    }
    }
}