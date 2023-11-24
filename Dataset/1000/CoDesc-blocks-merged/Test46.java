class Test {
    public class Example {
    public List getUsers(List userIds) {
            List lstUsers = new ArrayList();
            for(int i=0;i<userIds.size();i++) {
                lstUsers.add(getUserDetails((Long)userIds.get(i)));
            }
            return lstUsers;
        }
        public static void cleanDirectory(File directory) throws IOException {
        requireNonNull(directory, DIRECTORY_CAN_NOT_BE_NULL);
    
        Path path = directory.toPath();
        if (!path.toFile().exists()) {
          return;
        }
    
        cleanDirectoryImpl(path);
      }
        public void analyseFinalTree(Tree tree){
    		long sizeOfDataset = tree.getTrainingSet().size();
    		
    		double weightedSum = calculateWeigtedAverageTreeDepth(tree, 1, sizeOfDataset);
    		this.weightedAverageTreeDepth = weightedSum - 1;
    	}
    }
}