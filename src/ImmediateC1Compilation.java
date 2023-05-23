import jdk.test.whitebox.WhiteBox;

public class ImmediateC1Compilation {

    private static final WhiteBox wb = WhiteBox.getWhiteBox();

    public static void main(String[] args) throws NoSuchMethodException {
        wb.enqueueMethodForCompilation(
                ImmediateC1Compilation.class.getDeclaredMethod("hello", String.class), 1);

        System.out.println(hello("Petr"));
    }

    private static String hello(String name) {
        return "Hello " + name;
    }
}
