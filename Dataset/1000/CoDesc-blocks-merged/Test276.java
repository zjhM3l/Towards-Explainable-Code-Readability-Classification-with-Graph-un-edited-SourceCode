class Test {
    public class Example {
    public void mouseReleased(MouseEvent event ) {
    		try {
    			JTable table = (JTable) event.getSource();
    			if( table.getSelectedRowCount() == 1 ) {
    				FileSetTableModel tableModel = (FileSetTableModel) table.getModel();
    				selectedFile = tableModel.getRow( table.getSelectedRow() );
    				super.setEnabled( isReady() );
    			} else {
    				selectedFile = null;
    				super.setEnabled( false );
    			}
    		} catch (ClassCastException ccx) {
    			LogFactory.getLog( this.getClass() ).warn("MouseListener applies to JTable with FileSetTableModel only");
    		}
    	}
        public void ejbRemove() throws RemoveException{
            log.debug("ejbRemove project="+this.getName());
    
            try{
                ProjectDAO.delete(this.getName());
    	    deleteNodes(nodes);
    	    deleteEdges(edges);
            }catch (java.sql.SQLException se1) {
                throw new RemoveException ("SQL Exception in remove: " + se1);
    	}
    	jms.sendProjectEvent(REMOVEPROJECT, this.getName());
        }
        private boolean linkFirst(Node<E> node) {
    
            // assert lock.isHeldByCurrentThread();
    
            if (count >= capacity)
    
                return false;
    
            Node<E> f = first;
    
            node.next = f;
    
            first = node;
    
            if (last == null)
    
                last = node;
    
            else
    
                f.prev = node;
    
            ++count;
    
            notEmpty.signal();
    
            return true;
    
        }
    }
}