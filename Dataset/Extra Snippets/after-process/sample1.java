class Test {
    public static void main(String[] args) {
        String msg = "这是一段包含特殊字符的文本：$%@!^&*()_+";
        System.out.println("原始文本：" + msg);

        byte[] data = msg.getBytes("GBK");

        String decodedMsg = new String(data, "GBK");

        System.out.println("转换后的文本：" + decodedMsg);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的姓名：");
        String name = scanner.nextLine();
        System.out.println("你好，" + name + "！");
    }
}


