class Test {
    public class Example {
    public boolean validateHardcore(long time) {
    		if (hardcore) {
    			System.out.println("File timestamp: " + time);
    			System.out.println("Hardcore stamp: " + hardcoreTime);
    			long diff = Math.abs(time - hardcoreTime);
    			if (diff > 100) {
    				hardcore = false;
    				return false;
    			}
    		}
    		return true;
    	}
        public List<TaskInstance> getSubtaskInstances(Long masterTaskInstId) throws DataAccessException {
            try {
                db.openConnection();
                String query = "select " + getTaskInstanceSelect() +
                        " from TASK_INSTANCE ti where TASK_INST_SECONDARY_OWNER = ? and TASK_INST_SECONDARY_OWNER_ID = ?";
                Object[] args = new Object[2];
                args[0] = OwnerType.TASK_INSTANCE;
                args[1] = masterTaskInstId;
                ResultSet rs = db.runSelect(query, args);
                List<TaskInstance> taskInsts = new ArrayList<TaskInstance>();
                while (rs.next()) {
                    taskInsts.add(getTaskInstanceSub(rs, false));
                }
                return taskInsts;
            } catch (Exception e) {
                throw new DataAccessException(0, "failed to get task instances", e);
            } finally {
                db.closeConnection();
            }
        }
        public void setResynthesiscount(Long newVal) {
            if ((newVal != null && this.resynthesiscount != null && (newVal.compareTo(this.resynthesiscount) == 0)) ||
                (newVal == null && this.resynthesiscount == null && resynthesiscount_is_initialized)) {
                return;
            }
            this.resynthesiscount = newVal;
            resynthesiscount_is_modified = true;
            resynthesiscount_is_initialized = true;
        }
    }
}