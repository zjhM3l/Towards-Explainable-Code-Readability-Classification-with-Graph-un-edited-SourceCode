class Test {
    public class Example {
    public void selectionChanged(IAction action, ISelection selection) {
            projects.clear();
            if (selection instanceof IStructuredSelection) {
                for (Iterator i = ((IStructuredSelection)selection).iterator(); i.hasNext(); ) {
                    Object object = i.next();
                    if (object instanceof IProject)
                        projects.add(object);
                }
            }
    	}
        @View(name = "by_principal_id_since", map = "function(doc) { emit([doc.principalId, doc.creationTime], doc) }")
        public Collection<CouchDbCasEvent> findByPrincipalSince(final String principalId, final LocalDateTime creationTime) {
            val view = createQuery("by_principal_id_since").startKey(ComplexKey.of(principalId, creationTime))
                .endKey(ComplexKey.of(principalId, LocalDateTime.now()));
            return db.queryView(view, CouchDbCasEvent.class);
        }
        public SimpleWidgetModel getRunAsWM() {
            SimpleWidgetModel w_runAs = (SimpleWidgetModel) getWidgetCache().getModel("runAs");
            if (w_runAs == null) {
                w_runAs = new SimpleWidgetModel(getRunAs());
                getWidgetCache().addModel("runAs", w_runAs);
            }
            return w_runAs;
        }
    }
}