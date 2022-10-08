public class Demo {
    Demo(int i){
        System.out.println("create Demo... " + i);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Demo demo = new Demo(i);
            System.out.println(demo.getClass().hashCode());
        }
    }
}
