class Test {
    public class Example {
    public float decode(long src) {
            if (src == 0)
                return 0.0f;
    
            // Mask out the mantissa, exponent, and sign fields.
    
            long mantissa = (src & mantissa_mask);
            int exponent = (int) (src & exponent_mask) >> mantissa_bits;
            long sign     = (src >> sign_shift);
    
            // Subtract our exponent bias, then add IEEE-754's.
    
            exponent += exponent_min;
            exponent += EXPONENT_BIAS_32;
    
            // Adjust the mantissa.
    
            mantissa <<= (MANTISSA_BITS_32 - mantissa_bits);
    
            // Assemble the pieces.
    
            long result = (sign << SIGN_SHIFT_32) | (exponent << MANTISSA_BITS_32)
                       | (mantissa);
    
            return Float.intBitsToFloat((int)result);
        }
        void toStringParamValueOnly(final StringBuilder buf) {
            if (value == null) {
                buf.append("null");
            } else {
                final Object paramVal = value.get();
                final Class<?> valClass = paramVal.getClass();
                if (valClass.isArray()) {
                    buf.append('[');
                    for (int j = 0, n = Array.getLength(paramVal); j < n; j++) {
                        if (j > 0) {
                            buf.append(", ");
                        }
                        final Object elt = Array.get(paramVal, j);
                        buf.append(elt == null ? "null" : elt.toString());
                    }
                    buf.append(']');
                } else if (paramVal instanceof String) {
                    buf.append('"');
                    buf.append(paramVal.toString().replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r"));
                    buf.append('"');
                } else if (paramVal instanceof Character) {
                    buf.append('\'');
                    buf.append(paramVal.toString().replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r"));
                    buf.append('\'');
                } else {
                    buf.append(paramVal.toString());
                }
            }
        }
        protected static int compareLexicographical(Itemset a, Itemset o) {
        int i1 = a.iter(), i2 = o.iter();
        while(a.iterValid(i1) && o.iterValid(i2)) {
          int v1 = a.iterDim(i1), v2 = o.iterDim(i2);
          if(v1 < v2) {
            return -1;
          }
          if(v2 < v1) {
            return +1;
          }
          i1 = a.iterAdvance(i1);
          i2 = o.iterAdvance(i2);
        }
        return a.iterValid(i1) ? 1 : o.iterValid(i2) ? -1 : 0;
      }
    }
}