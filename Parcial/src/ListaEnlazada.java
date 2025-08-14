public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }
    public void insertarDato (int dato){
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null){
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null){
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
    public void borrarDato(int dato){
        Nodo actual = cabeza;
        if (cabeza.dato == dato){
            cabeza = cabeza.siguiente;
            return;
        }
        while (actual.siguiente != null && actual.siguiente.dato != dato){
            actual = actual.siguiente;
        }
        if (actual.siguiente != null){
            actual.siguiente = actual.siguiente.siguiente;
        }else {
            System.out.println("Dato no encontrado");
        }
    }
    public void modificarDato (int datoT, int datoN) {
        Nodo actual = cabeza;
        if (cabeza.dato == datoT){
            cabeza.dato = datoN;
            return;
        }
        while (actual.siguiente != null && actual.siguiente.dato != datoT){
            actual = actual.siguiente;
        }
        if(actual.siguiente != null){
            actual.siguiente.dato = datoN;
        }else {
            System.out.println("Numero no encontrado");
        }
    }
    public int contarDatos (){
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null){
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }
    public void imprimirLista(){
        Nodo actual = cabeza;
        while (actual != null){
            System.out.print(actual.dato + " -> ");
            actual=actual.siguiente;
        }
        System.out.println("null");
    }

}
