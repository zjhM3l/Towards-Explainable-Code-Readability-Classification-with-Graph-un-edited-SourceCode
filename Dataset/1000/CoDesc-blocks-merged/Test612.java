class Test {
    public class Example {
    public RebalancePlan getPlan(Cluster finalCluster,
                                     List<StoreDefinition> finalStoreDefs,
                                     int batchSize) {
            RebalanceUtils.validateClusterStores(finalCluster, finalStoreDefs);
            // If an interim cluster is needed, then currentCluster should be an
            // interim cluster! I.e., it should include new nodes/zones without any
            // partitions assigned to them.
            RebalanceUtils.validateInterimFinalCluster(currentCluster, finalCluster);
    
            String outputDir = null;
            return new RebalancePlan(currentCluster,
                                     currentStoreDefs,
                                     finalCluster,
                                     finalStoreDefs,
                                     batchSize,
                                     outputDir);
        }
        @Nonnull
    	public <V1 extends T1, V2 extends T2> LBiObjFltConsumerBuilder<T1, T2> aCase(Class<V1> argC1, Class<V2> argC2, LBiObjFltConsumer<V1, V2> function) {
    		PartialCase.The pc = partialCaseFactoryMethod((a1, a2, a3) -> (argC1 == null || argC1.isInstance(a1)) && (argC2 == null || argC2.isInstance(a2)));
    
    		pc.evaluate(function);
    		return self();
    	}
        public void start() {
    			try {
    				this.getContext();
    				System.out.println("Client start(): Started: waiting for connections ");
    			} catch (Exception e) {
    				System.out.println("Client start(): Exception thrown " + e);
    			}
    		}
    }
}