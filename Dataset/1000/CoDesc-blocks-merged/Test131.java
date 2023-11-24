class Test {
    public class Example {
    public int decrease(double extrp, int decrease)
        {
            final int remain = getCurrent();
            final double decreased = remain - decrease * extrp;
            set(decreased);
            if (decreased < 0)
            {
                return remain;
            }
            return decrease;
        }
        @Override
        public UpdateSnapshotScheduleResult updateSnapshotSchedule(UpdateSnapshotScheduleRequest request) {
            request = beforeClientExecution(request);
            return executeUpdateSnapshotSchedule(request);
        }
        protected float getFloat(String field) throws InvalidLogEntryException {
            float result = 0.0F;
            try {
                if (field == null) {
                    // check for null explicitly because Sun classes don't
                    throw new InvalidLogEntryException("Invalid Float Numerical Field");
                
                } else if (!"-".equals(field)) {
                    result = Float.parseFloat(field);
                }
    
            } catch (NumberFormatException nfe) {
                throw new InvalidLogEntryException("Invalid Float Numerical Field: " + field);
            }
            return result;
        }
    }
}