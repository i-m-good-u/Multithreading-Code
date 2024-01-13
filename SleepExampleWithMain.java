public class SleepExampleWithMain {
    public static void main(String[] args) {
        for (int index = 0; index < 5; index++) {
            try {
                Thread.sleep(1000);
                System.out.println(index);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }

}
