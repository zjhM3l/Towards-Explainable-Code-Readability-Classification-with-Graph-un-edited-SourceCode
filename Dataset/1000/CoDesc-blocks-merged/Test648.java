class Test {
    public class Example {
    public void expand () {
            Object[] newHistory = new Object[(history.length * 2) - 1];
            int i = 0;
            int newCurr = 0;
            for (int j = start; j != end; j = (j+1) % history.length, ++i) {
                newHistory[i] = history[j];
                if (j == curr)
                    newCurr = i;
            }
            history = newHistory;
            start = 0;
            end = i;
            curr = newCurr;
        }
        static public void addActionListener(ActionListener l, Container container){
    
             int cnt = container.getComponentCount();
             for(int i=0; i<cnt; i++){
               Component c2 = container.getComponent(i);
               if (c2 instanceof Button) {
                     ((Button)c2).addActionListener(l);
               } else if (c2 instanceof ImageButton) {
                     ((ImageButton)c2).addActionListener(l);
               } else if (c2 instanceof Container) {
                   MapUtils.addActionListener(l, (Container)c2);
               }
             }
     }
        @Override
        public ListRolePoliciesResult listRolePolicies(ListRolePoliciesRequest request) {
            request = beforeClientExecution(request);
            return executeListRolePolicies(request);
        }
    }
}