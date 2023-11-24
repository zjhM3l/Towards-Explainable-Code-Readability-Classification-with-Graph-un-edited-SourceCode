class Test {
    public class Example {
    public void run() {
          while (true) {
            try {
              delimiter = (delimiter != ":") ? ":" : " ";
              repaint();
              sleep(500);
            }
            catch (InterruptedException e){}
          }
        }
        public void dispose(){
      m_manager.removeListener(m_internalListener);
      for (  final DebuggerTemplate debuggerTemplate : m_debuggerTemplates) {
        debuggerTemplate.dispose();
      }
    }
        public Boolean deleteProductCategory(EntityManager em,String productCategory){
      Boolean status=true;
      ProductCategory prodcat=null;
      try {
        if (!em.getTransaction().isActive()) {
          em.getTransaction().begin();
        }
        prodcat=em.find(ProductCategory.class,productCategory);
        em.remove(prodcat);
        em.getTransaction().commit();
      }
     catch (  Exception e) {
        status=false;
        logger.error("Error occured during delete of Product category. Detailed info: " + e);
      }
      return status;
    }
    }
}