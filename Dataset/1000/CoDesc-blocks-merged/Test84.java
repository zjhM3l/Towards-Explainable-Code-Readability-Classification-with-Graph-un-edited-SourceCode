class Test {
    public class Example {
    public void add(final Object eKey,final Object element){
      if ((!_elements.containsKey(eKey)) && (getType() != TYPE_UNSYNCHRONIZED_MOV)) {
        _elementOrder.add(eKey);
      }
      _elements.put(eKey,element);
    }
        private static void annotateParams ( Entity self , String word ) {
      Annotation annotation = new Annotation ( ) ;
      annotation . setText ( word ) ;
      annotation . setMeta ( "@" + self . entityMap . get ( word ) ) ;
      annotation . setAlias ( self . entityMap . get ( word ) . replace ( "sys." , "" ) ) ;
      annotation . setUserDefined ( true ) ;
      self . data . add ( annotation ) ;
    }
        public static void save ( TodoList self , TodoList p_todolist ) {
      self . trim ( ) ;
      String current_hash = hashTodoList ( p_todolist ) ;
      String list_todo = ( self . todolist . printTodos ( ) + "\n" ) . toString ( true ) ;
      try {
        String list_archive = ( self . archive . printTodos ( ) + "\n" ) . toString ( true ) ;
      }
      catch ( Throwable e ) {
        list_archive = new String [ 0 ] ;
      }
      self . backupMap . put ( self . timestamp , new TodoList ( list_todo , list_archive , self . label ) ) ;
      int [ ] index = self . getIndex ( ) ;
      index [ 0 ] = ( self . timestamp == 0 ) ? 0 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? - 1 : ( self . timestamp < 0 ) ? 1 : ( self . timestamp > 0 ) ? - 1 : ( self . timestamp < 0 ) ? 1 : ( self . timestamp > 0 ) ? - 1 : ( self . timestamp < 0 ) ? 1 : ( self . timestamp > 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp > 0 ) ? 1 : ( self . timestamp < 0 ) ? - 1 : ( self . timestamp
    }
}