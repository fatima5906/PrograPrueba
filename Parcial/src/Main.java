public class Main {
    public static void main (String [] args ){
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarDato(4);
        lista.insertarDato(7);
        lista.insertarDato(6);
        lista.insertarDato(3);
        lista.imprimirLista();
        lista.borrarDato(7);
        lista.imprimirLista();
        lista.modificarDato(4,9);
        lista.imprimirLista();
        System.out.println(lista.contarDatos());

    }
}
