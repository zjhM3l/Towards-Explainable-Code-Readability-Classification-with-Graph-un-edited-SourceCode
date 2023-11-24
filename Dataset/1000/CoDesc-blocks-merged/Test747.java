class Test {
    public class Example {
    protected void schedule(T task) {
            final Object sequenceIdentifier = sequencingPolicy.getSequenceIdentifierFor(task);
            if (sequenceIdentifier == null) {
                logger.debug("Scheduling task of type [{}] for full concurrent processing",
                             task.getClass().getSimpleName());
                EventProcessingScheduler<T> scheduler = newProcessingScheduler(new NoActionCallback(),
                                                                               this.concurrentEventQueue);
                scheduler.scheduleEvent(task);
            } else {
                logger.debug("Scheduling task of type [{}] for sequential processing in group [{}]",
                             task.getClass().getSimpleName(),
                             sequenceIdentifier.toString());
                assignEventToScheduler(task, sequenceIdentifier);
            }
        }
        public Object getContextValue() {
            if(contextValue != null) {
                return contextValue;
            }
            ValueBinding vb = getValueBinding("contextValue");
            return vb != null ? vb.getValue(getFacesContext()) : null;
        }
        @Deprecated
    
        public static int cuFuncSetBlockShape(CUfunction hfunc, int x, int y, int z)
    
        {
    
            return checkResult(cuFuncSetBlockShapeNative(hfunc, x, y, z));
    
        }
    }
}