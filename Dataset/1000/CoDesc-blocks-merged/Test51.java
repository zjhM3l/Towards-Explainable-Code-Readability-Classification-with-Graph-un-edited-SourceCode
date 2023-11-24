class Test {
    public class Example {
    public static String asString(Collection<?> collection) {
            if (collection == null) {
                return NULL;
            }
            StringBuilder builder = new StringBuilder();
            builder.append('[');
            boolean first = true;
            for (Object item : collection) {
                if (first) {
                    first = false;
                } else {
                    builder.append(',');
                }
                builder.append(asString(item));
            }
            builder.append(']');
            return builder.toString();
        }
        public static void main(String[] args) throws Exception {
      String string=IOUtils.toString(System.in,StandardCharsets.UTF_8.toString());
      System.out.println(string);
      OcspFetchIntervalSchemaValidator.validate(string);
    }
        public static Predicate<Imp> addFilters(
          Predicate<Imp> baseFilter, boolean banner, boolean video, boolean nativ) {
        int orCount = (banner ? 1 : 0) + (video ? 1 : 0) + (nativ ? 1 : 0);
        if (baseFilter == IMP_NONE || orCount == 0) {
          return baseFilter;
        }
    
        Predicate<Imp> typeFilter = null;
        if (banner) {
          typeFilter = Imp::hasBanner;
        }
        if (video) {
          typeFilter = typeFilter == null ? Imp::hasVideo : typeFilter.or(Imp::hasVideo);
        }
        if (nativ) {
          typeFilter = typeFilter == null ? Imp::hasNative : typeFilter.or(Imp::hasNative);
        }
    
        return baseFilter == IMP_ALL ? typeFilter : baseFilter.and(typeFilter);
      }
    }
}