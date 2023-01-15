
public class Main {
    public static void main(String[] args) {

    var history = new BrowserHistory();
    history.push("a");
    history.push("b");
    history.push("c");
    for (var i = 0; i < history.getUrls().size(); i++){
        var url = history.getUrls().get(i);
        System.out.println(url);
    }

    //Mudar as particularidades internas de um objeto não deveria afetar os seus consumidors
    //Mudanças de qualquer aspecto dessa classe só deve afetar ESSA classe e não outras que estejam usando a mes
    }
}
