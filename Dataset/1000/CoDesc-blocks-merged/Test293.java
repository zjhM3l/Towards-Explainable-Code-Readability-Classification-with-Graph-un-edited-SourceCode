class Test {
    public class Example {
    protected RotateTreeStateNode getLastVisibleNode() {
          RotateTreeStateNode node = this;
    
          while (node.isExpanded() && node.getChildCount() > 0)
            node = (RotateTreeStateNode) node.getLastChild();
          return node;
        }
        public JScrollPane getAvailableLayersScrollPane() {
            if (availableLayersScrollPane == null) {
                availableLayersScrollPane = new JScrollPane();
                availableLayersScrollPane.setBounds(new java.awt.Rectangle(10, 20,
                        471 - 34, 123 - 8));
            }
    
            return availableLayersScrollPane;
        }
        @SafeVarargs
        public final EventHandlerGroup<T> handleEventsWith(final EventProcessorFactory<T>... eventProcessorFactories)
        {
            final Sequence[] barrierSequences = new Sequence[0];
            return createEventProcessors(barrierSequences, eventProcessorFactories);
        }
    }
}