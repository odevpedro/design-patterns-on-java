public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);

    }

    public void restore(EditorState state){
        content = state.getContent();

    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

/*Criamos uma classe cuja responsabilidade é exclusivamente guardar o estado dos campos desejados
*
* Essa solução viola o principio de responsabilidade unica
*
* Originator, Memento, Caretaker*/