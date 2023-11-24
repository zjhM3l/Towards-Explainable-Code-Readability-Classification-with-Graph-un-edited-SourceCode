class Test {
    public class Example {
    public static boolean cmdReloadLocal ( Plugin self , String plname ) {
      fv . mm . loadModule ( plname ) ;
      for ( int i = 0 ;
      i < fv . getChannelCount ( ) ;
      i ++ ) {
        ChannelInfo chinfo = fv . getChannel ( i ) ;
        chinfo . opmon . reloadPlugin ( plname , chinfo ) ;
      }
      return true ;
    }
        public static List < CobolMatch > parseCobol ( List < String > lines ) {
      List < CobolMatch > output = new ArrayList < CobolMatch > ( ) ;
      String [ ] intify = {
        "level" , "occurs" };
        for ( String row : lines ) {
          Matcher matcher = CobolPatterns . rowPattern . matcher ( row . trim ( ) ) ;
          if ( ! matcher . matches ( ) ) {
            _logger . warn ( "Found unmatched row " + row . trim ( ) ) ;
            continue ;
          }
          Map < String , Integer > map = matcher . groupCount ( ) ;
          for ( int i = 0 ;
          i < intify . length ;
          i ++ ) {
            map . put ( i , Integer . parseInt ( intify [ i ] ) == - 1 ? 0 : Integer . parseInt ( intify [ i ] ) ) ;
          }
          if ( matcher . group ( "pic" ) != null ) {
            matcher . group ( "pic_info" ) = parsePicString ( matcher . group ( "pic" ) ) ;
          }
          output . add ( matcher ) ;
        }
        return output ;
      }
        protected int doLocalRead(WalkContext context, String name) {
        if (!useLocalValuesForLexicalVars()) {
          CAstEntity entity = context.top();
          Set<String> exposed = entity2ExposedNames.get(entity);
          if (exposed != null && exposed.contains(name)) {
            return doLexReadHelper(context, name);
          }
        }
        return context.currentScope().lookup(name).valueNumber();
      }
    }
}