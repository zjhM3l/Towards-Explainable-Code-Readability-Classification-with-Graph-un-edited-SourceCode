class Test {
    public class Example {
    public void testCheckParams01() {
        jcc.setJcHome(jcHome);
        jcc.setPackageName("my.package");
        jcc.setPackageAID(aid1);
        jcc.setVersion("1.0");
        jcc.checkParams();
      }
        private boolean fieldIsOk(final Field field) {
            return field.getType().equals(MethodOverrider.class)
                    && Modifier.isPublic(field.getModifiers())
                    && Modifier.isStatic(field.getModifiers())
                    && !Modifier.isFinal(field.getModifiers());
        }
        @Override
        protected Measurement[] getModelMeasurementsImpl() {
            Measurement[] measurements = new Measurement[this.maxStoredCount];
    
            for (int m = 0; m < this.maxMemberCount; m++) {
                measurements[m] = new Measurement("Member weight " + (m + 1), -1);
            }
    
            for (int s = this.maxMemberCount; s < this.maxStoredCount; s++) {
                measurements[s] = new Measurement("Stored member weight " + (s + 1), -1);
            }
    
            if (this.storedWeights != null) {
                int storeSize = this.storedWeights.length;
    
                for (int i = 0; i < storeSize; i++) {
                    if (i < this.ensemble.length) {
                        measurements[i] = new Measurement("Member weight " + (i + 1), this.storedWeights[storeSize - i - 1][0]);
                    } else {
                        measurements[i] = new Measurement("Stored member weight " + (i + 1), this.storedWeights[storeSize - i - 1][0]);
                    }
                }
            }
            return measurements;
        }
    }
}