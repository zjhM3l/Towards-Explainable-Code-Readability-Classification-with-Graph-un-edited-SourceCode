class Test {
    public class Example {
    public void setTriggeredByParent(boolean value) {
    
    		triggeredByParent = value;
    
    		/*
    		 * if (value && isTriggerParent()) { setTriggerParent(false); }
    		 */
    		updateArmedTrigger(TRIGGERED_BY_PARENT, triggeredByParent);
    
    	}
        private final void initRecursively(ProjectTypeDef myType,String typeId) throws ProjectTypeConstraintException {
      ProjectTypeDef type=validatedData.get(typeId);
      for (  String superTypeId : type.getParents()) {
        myType.addAncestor(superTypeId);
        ProjectTypeDef supertype=validatedData.get(superTypeId);
        for (    Attribute attr : supertype.getAttributes()) {
          for (      Attribute attr2 : myType.getAttributes()) {
            if (attr.getName().equals(attr2.getName()) && !attr.getProjectType().equals(attr2.getProjectType())) {
              throw new ProjectTypeConstraintException("Attribute name conflict. Project type " + myType.getId() + " could not be registered as attribute declaration "+ attr.getName()+ " is duplicated in its ancestor(s).");
            }
          }
          myType.addAttributeDefinition(attr);
        }
        initRecursively(myType,superTypeId);
      }
    }
        public <Original, E> OnCloseIterator<E> start(Address origin, Supplier<Stream<Original>> streamSupplier,
             Iterable<IntermediateOperation> intOps, Object requestId) {
          if (trace) {
             log.tracef("Iterator requested from %s using requestId %s", origin, requestId);
          }
          BaseStream stream = streamSupplier.get();
          for (IntermediateOperation intOp : intOps) {
             stream = intOp.perform(stream);
          }
    
          OnCloseIterator<E> iter = new IteratorCloser<>((CloseableIterator<E>) Closeables.iterator(stream));
          // When the iterator is closed make sure to clean up
          iter.onClose(() -> closeIterator(origin, requestId));
          currentRequests.put(requestId, iter);
          // This will be null if there have been no iterators for this node.
          // If the originating node died before we start this iterator this could be null as well. In this case the
          // iterator will be closed on the next view change.
          Set<Object> ids = ownerRequests.computeIfAbsent(origin, k -> ConcurrentHashMap.newKeySet());
          ids.add(requestId);
          return iter;
       }
    }
}