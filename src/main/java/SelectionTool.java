public class SelectionTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Selecion icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
