class Test {
    public class Example {
    @Override
        public List<T> filter(final List<T> list) throws CouldNotPerformException {
            beforeFilter();
            return ListFilter.super.filter(list);
        }
        public Choice(String text,T value,String detailText){
      this.text=text;
      this.value=value;
      this.detailText=detailText;
    }
        public ResultSequence plus(ResultSequence arg) throws DynamicError {
                    AnyType at = get_single_arg(arg);
                    if( !(at instanceof XSInteger) )
                            DynamicError.throw_type_error();
                    XSInteger val = (XSInteger) at;
    
                    return ResultSequenceFactory.create_new(new XSInteger(int_value() + val.int_value()));
            }
    }
}