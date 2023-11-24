class Test {
    public class Example {
    public int indexOf(PopupMenuItemWidget item) {
    	if (item == null) {
    	    return -1;
    	}
    
    	// check visible items first
    	for (int i = firstItem; i <= lastItem; i++) {
    	    if (getItem(i) == item) {
    		return i;
    	    }
    	}
    
    	// item not found, let's ask the class that uses this menu
    	return ((SparseDropDownListBoxWidget)user).getValueIndex(item.getText());
        }
        public static LUDecomposition<FloatMatrix> lu(FloatMatrix A) {
          int[] ipiv = new int[min(A.rows, A.columns)];
          FloatMatrix result = A.dup();
          NativeBlas.sgetrf(A.rows, A.columns, result.data, 0, A.rows, ipiv, 0);
    
          // collect result
          FloatMatrix l = new FloatMatrix(A.rows, min(A.rows, A.columns));
          FloatMatrix u = new FloatMatrix(min(A.columns, A.rows), A.columns);
          decomposeLowerUpper(result, l, u);
          FloatMatrix p = Permutations.permutationFloatMatrixFromPivotIndices(A.rows, ipiv);
          return new LUDecomposition<FloatMatrix>(l, u, p);
      }
        public void put(Object o) {
            if (o == null) {
                throw new IllegalArgumentException("SyncQueue: object to put is null");
            }
            synchronized (takeLock) {
                long startTime = System.currentTimeMillis();
                while (element != null && System.currentTimeMillis() - startTime < TIMEOUT) {
                    waitSilently(takeLock, TIMEOUT - (System.currentTimeMillis() - startTime));
                }
                if (element != null) {
                    throw new IllegalStateException("Queue is too busy. Can't put an object: " + o);
                }
                element = o;
                takeLock.notifyAll();
            }
        }
    }
}