
public class Main {
    public static void main(String[] args) {

    var history = new BrowserHistory();
    history.push("a");
    history.push("b");
    history.push("c");

    Iterator iterator = history.createIterator();
    while (iterator.hasNext()) {
        var url = iterator.current();
        System.out.println(url);
        iterator.next();
    }

    //Mudar as particularidades internas de um objeto não deveria afetar os seus consumidors
    //Mudanças de qualquer aspecto dessa classe só deve afetar ESSA classe e não outras que estejam usando a mes
    }
}
