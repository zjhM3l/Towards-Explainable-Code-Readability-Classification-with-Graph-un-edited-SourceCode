public class Test {
    protected final void fastPathOrderedEmit(U value, boolean delayError, Disposable disposable) {
            final Observer<? super V> observer = downstream;
            final SimplePlainQueue<U> q = queue;
    
            if (wip.get() == 0 && wip.compareAndSet(0, 1)) {
                if (q.isEmpty()) {
                    accept(observer, value);
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    q.offer(value);
                }
            } else {
                q.offer(value);
                if (!enter()) {
                    return;
                }
            }
            QueueDrainHelper.drainLoop(q, observer, delayError, disposable, this);
        }
    public FormKey viewObject(java.lang.String formName) throws ApplicationExceptions, FrameworkException {
            FormUsageViewerComponent viewComponent = (FormUsageViewerComponent) run("Jaffa.Printing.FormUsageViewer");
            viewComponent.setReturnToFormKey(FormKey.getCloseBrowserFormKey());
            viewComponent.setFormName(formName);
            // .//GEN-END:_viewObject_1_be
            // Add custom code before invoking the component //GEN-FIRST:_viewObject_1
    
    
            // .//GEN-LAST:_viewObject_1
            // .//GEN-BEGIN:_viewObject_2_be
            return viewComponent.display();
        }
    protected FontPeer createFontPeer(String name, int style, int size, int logicalIndex){
            FontPeer peer;
            if (logicalIndex != -1){
                peer = createLogicalFontPeer(name, style, size);
            }else {
                peer = createPhysicalFontPeer(name, style, size);
            }
            
            return peer;
        }
}