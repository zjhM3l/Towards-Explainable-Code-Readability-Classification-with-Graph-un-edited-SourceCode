class Test {
    public class Example {
    public ByteArrayList grep(TIntProcedure condition){
      ByteArrayList list=new ByteArrayList();
      for (int i=0; i < _pos; i++) {
        if (condition.execute(_data[i])) {
          list.add(_data[i]);
        }
      }
      return list;
    }
        DataResource navigate(String resourcePath, boolean returnNullIfNotExists) {
    
        ResourcePathNode<Void> path = ResourcePathNode.create(resourcePath);
        ClasspathFolder parent = getParent();
        if (parent == null) {
          // in case of root...
          parent = this;
        }
        DataResource result = parent.navigate(path, false);
        if ((result == null) && !returnNullIfNotExists) {
          String parentPath = "";
          if (!isRoot()) {
            parentPath = parent.getPath();
          }
          ResourcePathNode<Void> targetPath = ResourcePathNode.create(parentPath).navigateTo(path);
          String classpath = targetPath.toString();
          if (targetPath.isAbsolute()) {
            classpath = classpath.substring(1);
          }
          return new ClasspathResource(classpath);
        }
        return result;
      }
        public static String toHex(ByteBuffer data){
      StringBuilder result=new StringBuilder();
      int counter=0;
      int b;
      while (data.hasRemaining()) {
        if (counter % 16 == 0) {
          result.append(String.format("%04X: ",counter));
        }
        b=data.get() & 0xff;
        result.append(String.format("%02X ",b));
        counter++;
        if (counter % 16 == 0) {
          result.append("  ");
          toText(data,result,16);
          result.append("\n");
        }
      }
      int rest=counter % 16;
      if (rest > 0) {
        for (int i=0; i < 17 - rest; i++) {
          result.append("   ");
        }
        toText(data,result,rest);
      }
      return result.toString();
    }
    }
}