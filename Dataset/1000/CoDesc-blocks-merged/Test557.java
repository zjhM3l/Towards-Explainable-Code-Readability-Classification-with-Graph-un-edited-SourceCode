class Test {
    public class Example {
    private void removeCumulatedStats(ProducerDecoratorBean decorator) {
            if (decorator == null) {
                LOGGER.warn("Decorator is empty");
                return;
            }
    
            for (ProducerAO producer : decorator.getProducers()) {
                for (Iterator<StatLineAO> statLineIterator = producer.getLines().listIterator(); statLineIterator.hasNext(); ) {
                    if (CUMULATED_STAT_NAME_VALUE.equals(statLineIterator.next().getStatName())) {
                        statLineIterator.remove();
                    }
                }
            }
        }
        public void completeDraw( Graphics2D g2d ) {
            coosy.updateDiagramAxis();
            coosy.drawDiagramCoosy( g2d );
            if ( graph != null ) {
                graph.updateDiagramAxis();
                graph.drawDiagramGraph( g2d );
            }
        }
        private void buildST33HeaderEnd(byte[] theBuffer) throws JpxiException {
    	
    	System.arraycopy(
    		theBuffer,
    		0,
    		getST33Header(),
    		getScanHeaderOffSet(),
    		getST33Header().length - getScanHeaderOffSet());
    
    }
    }
}