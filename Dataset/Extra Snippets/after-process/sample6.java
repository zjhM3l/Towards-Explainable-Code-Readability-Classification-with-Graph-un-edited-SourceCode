class Test {
    public void exampleMethod(int param1, String param2, Map<String, List<Integer>> param3) {
        boolean longNameCondition =
                param1 > 0 && param2.length() > 10 &&
                param3.containsKey("key") && param3.get("key").size() > 0;

        if (longNameCondition) {
            doSomething(param1, param2, param3);
        } else {
            for (String key : param3.keySet()) {
                if (key.equals("key1")) {
                    processKey1(param1, param2, param3);
                } else if (key.equals("key2")) {
                    processKey2(param1, param2, param3);
                } else if (key.equals("key3")) {
                    processKey3(param1, param2, param3);
                } else {
                    throw new IllegalArgumentException("Invalid key: " + key);
                }
            }
        }
    }
}


