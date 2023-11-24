class Test {
    public class Example {
    static public void setLevel(ZZCell c, int level) {
    	ZZCell para = findStruct(c, -1, true);
    	ZZCell str = para.s("d.nile-struct");
    	if(str == null) return;
    	setStrLevel(str, level);
        }
        private Object convert(Object value, String type) {
            if (EnumRuleType.STRING.equals(type)) {
                if (!(value instanceof String)) {
                    return String.valueOf(value);
                }
            } else if (EnumRuleType.DOUBLE.equals(type)) {
                if (!(value instanceof Double)) {
                    if (value instanceof Number) {
                        return NumberUtils.convertNumberToTargetClass((Number) value, Double.class);
                    } else {
                        return NumberUtils.parseNumber(value.toString(), Double.class);
                    }
                }
            } else if (EnumRuleType.INTEGER.equals(type)) {
                if (!(value instanceof Integer)) {
                    if (value instanceof Number) {
                        return NumberUtils.convertNumberToTargetClass((Number) value, Integer.class);
                    } else {
                        return NumberUtils.parseNumber(value.toString(), Integer.class);
                    }
                }
            }
            return value;
        }
        public Observable<Void> rebootAsync(String poolId, String nodeId, ComputeNodeRebootOption nodeRebootOption, ComputeNodeRebootOptions computeNodeRebootOptions) {
            return rebootWithServiceResponseAsync(poolId, nodeId, nodeRebootOption, computeNodeRebootOptions).map(new Func1<ServiceResponseWithHeaders<Void, ComputeNodeRebootHeaders>, Void>() {
                @Override
                public Void call(ServiceResponseWithHeaders<Void, ComputeNodeRebootHeaders> response) {
                    return response.body();
                }
            });
        }
    }
}