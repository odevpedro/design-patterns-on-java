
public class Main {
    public static void main(String[] args) {
    var canvas = new Canvas();
        System.out.println(canvas.getCurrentTool());
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();


    //Open close principle - Uma classe deve ser aberta para extensão e fechada para modificação
    //cada tipo de ferramenta diferente executa/implementa os métodos genéricos de Tool a sua maneira

    }
}
