class Test {
    public class Example {
    private boolean isEqual(Object a, Object b) {
    
            if (a == null) {
                return (b == null);
            }
            if (b == null) {
                return false;
            }
            return a.equals(b);
        }
        public void deleteCategory(Long categoryId) throws DAOException {
            try {
                session = ForumHibernateUtil.currentSession();
                ForumCategory fcat =(ForumCategory)session.load(ForumCategory.class,categoryId);
    			session.delete(fcat);
                
    		} catch (HibernateException e) {
                logger.debug(" category cannot be deleted  "+e.getMessage());
    		}
            ;
        }
        public Model getModel() {
    		if (isModelFile())
    			return (Model) rootElement;
    		else
    			return null;
    	}
    }
}