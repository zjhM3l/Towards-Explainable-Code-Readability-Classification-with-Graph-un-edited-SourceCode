class Test {
    public class Example {
    private Map<Class<?>, Formatter> findFormatMethods()
        {
            final Map<Class<?>, Formatter> formats = new HashMap<Class<?>, Formatter>();
            for (Method method : this.getClass().getMethods())
            {
                Format formatAnnotation = method.getAnnotation(Format.class);
                if (formatAnnotation != null)
                {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 0)
                    {
                        throw new InvalidFormatMethodException(getClass(), method, "Format methods must take at least 1 parameter!");
                    }
                    formats.put(parameterTypes[0], createFormatter(method, parameterTypes, formatAnnotation.value()));
                }
            }
            return formats;
        }
        protected void read(ObjectInputStream s) throws IOException, ClassNotFoundException {
            val header = BaseDataBuffer.readHeader(s);
            data = Nd4j.createBuffer(header.getRight(), length, false);
    
            data.read(s, header.getLeft(), header.getMiddle(), header.getRight());
        }
        public boolean isConnected() {
             IOSession session = getSession();
             if( session == null ) return false;
             return session.isConnected();
        }
    }
}