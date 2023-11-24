class Test {
    public class Example {
    public static void extractKeywordsFromSentences ( WordCoOccursDictionary self , List < CoreMap > sentences ) {
      List < CoreLabel > phraseList = self . generatePhraseList ( sentences ) ;
      self . buildFrequencyDist ( phraseList ) ;
      self . buildWordCoOccurGraph ( phraseList ) ;
      self . buildRankList ( phraseList ) ;
    }
        public boolean removeIgnored(Class c, String displayName) {
          HashSet        list;
          
          // retrieve list
          if (m_Ignored.contains(c))
             list = (HashSet) m_Ignored.get(c);
          else
             list = new HashSet();
          
          return list.remove(displayName);
       }
        public ConversionXmlProvider(InputStream conversionXml,String conversionXmlPath,IFormat format) throws XmlParsingException {
      this.conversion=XmlParser.parse(conversionXml,conversionXmlPath,new String[]{CONVERSION_XSD},CONVERSION_PACKAGE,ConversionType.class);
      this.formatType=conversion.getFormats().getMap().get(format.getName());
      if (this.formatType == null) {
        throw new ConversionException(String.format("'%s' doesn't contain configuration for '%s' format.",conversionXmlPath,format.getName()));
      }
    }
    }
}