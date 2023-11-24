class Test {
    public class Example {
    public static int lastIndexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {
            if (str == null || searchStr == null) {
                return INDEX_NOT_FOUND;
            }
            return lastIndexOfIgnoreCase(str, searchStr, str.length());
        }
        public boolean delete(FileRef[] filesToDelete) throws Exception {
    		for(int i = 0; i < filesToDelete.length; i++) {
    			if(filesToDelete[i].isDirectory()) {
    				delete(list(filesToDelete[i])); // recursion into directory
    				FileRef[] files = list(filesToDelete[i]);
    				if(files == null || files.length == 0) // only delete directory when empty
    					delete(filesToDelete[i]);
    			} else 
    				delete(filesToDelete[i]);
    		}
    		return true;
    	}
        public static <T> Observable<T> deferFuture(
            Func0<? extends Future<? extends Observable<? extends T>>> observableFactoryAsync,
            Scheduler scheduler) {
            return OperatorDeferFuture.deferFuture(observableFactoryAsync, scheduler);
        }
    }
}