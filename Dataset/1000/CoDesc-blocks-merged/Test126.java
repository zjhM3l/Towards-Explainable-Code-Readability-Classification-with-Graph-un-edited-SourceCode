class Test {
    public class Example {
    @Deprecated
        public static <T extends Comparable<?>> ComparableTemplate<T> comparableTemplate(Class<? extends T> cl,
                                                                                         String template, ImmutableList<?> args) {
            return comparableTemplate(cl, createTemplate(template), args);
        }
        private void revertToDefault(String token) {
          if (template.dataElementExists(token)) {
             if (!this.dataElementExists(token)) {
                setDataElement(token, template.getDataElement(token).clone());
             } else {
                this.getDataElement(token).setContent(template.getDataElement(token).getContent());
             }
          }
       }
        public static Array<FileHandle> sortFiles (FileHandle[] files, Comparator<FileHandle> comparator, boolean descending) {
    		Array<FileHandle> directoriesList = new Array<FileHandle>();
    		Array<FileHandle> filesList = new Array<FileHandle>();
    
    		for (FileHandle f : files) {
    			if (f.isDirectory()) {
    				directoriesList.add(f);
    			} else {
    				filesList.add(f);
    			}
    		}
    
    		Sort sorter = new Sort();
    		sorter.sort(directoriesList, comparator);
    		sorter.sort(filesList, comparator);
    
    		if (descending) {
    			directoriesList.reverse();
    			filesList.reverse();
    		}
    
    		directoriesList.addAll(filesList); // combine lists
    		return directoriesList;
    	}
    }
}