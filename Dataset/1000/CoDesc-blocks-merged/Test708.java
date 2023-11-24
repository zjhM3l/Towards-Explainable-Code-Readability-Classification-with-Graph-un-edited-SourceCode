class Test {
    public class Example {
    public List findByExample(User instance) {
            log.debug("finding User instance by example");
            try {
                List results = HibernateUtil.currentSession()
                        .createCriteria("com.ndss.pet.core.test.common.pet.domain.User")
                        .add(Example.create(instance))
                .list();
                log.debug("find by example successful, result size: " + results.size());
                return results;
            }
            catch (RuntimeException re) {
                log.error("find by example failed", re);
                throw re;
            }
        }
        public boolean equals(Object o) {
    		if (!(o instanceof UInt8)) {
    			return false;
    		}
    		return (((UInt8) o).value.equals(this.value));
    	}
        public void setIssue(int newIssue) {
    		issue = newIssue;
    	  
          
    	}
    }
}