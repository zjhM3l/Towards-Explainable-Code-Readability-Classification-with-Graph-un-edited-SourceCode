class Test {
    public class Example {
    public void assignTemplate(PageState s, Template t) {
                ContentItem item = m_itemModel.getSelectedItem(s);
                Assert.assertNotNull(item, "item");
    
                TemplateManagerFactory.getInstance().addTemplate(item, t, getUseContext(s));
    
                showDisplayPane(s);
            }
        public void incrementCurrentCount(boolean store) throws GenericEntityException {
            if (store) {
                info.set("recurrenceCount", getCurrentCount() + 1);
                info.store();
            }
        }
        public static <T> CloseableIterable<T> chain(final Iterable<? extends CloseableIterable<? extends T>> iterables) {
            requireNonNull(iterables);
    
            //Don't use CloseableIterators here, as Iterables can reiterate over their data
            //and don't want to close it on them.
            return new FluentCloseableIterable<T>() {
                @Override
                protected void doClose() {
                    for (CloseableIterable<? extends T> curr : iterables)
                        curr.closeQuietly();
                }
    
                @Override
                protected Iterator<T> retrieveIterator() {
                    return Iterators.concat(iterators(iterables));
                }
            };
        }
    }
}