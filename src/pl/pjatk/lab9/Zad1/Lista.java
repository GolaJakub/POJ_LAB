package pl.pjatk.lab9.Zad1;

public class Lista <E>{
    private E[] lista;

    public Lista(int rozmiar){
        lista = (E[]) new Object[rozmiar];
    } //[Ala, Kot, Pies]

    public boolean dodaj(E element){
        for (int i=0; i<lista.length; i++){
            if (lista[i]==null){
                lista[i] = element;
                return true;
            }
        }
        return false;
    }

    public boolean czyZawiera(E element){
        for (int i=0; i<lista.length; i++){
            if (lista[i]!=null && lista[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public int zwrocIndeks(E element){
        for (int i=0; i<lista.length; i++){
            if (lista[i]!=null && lista[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public int zwrocOstatniIndeks(E element){
        for (int i=lista.length-1; i>=0; i--){
            if (lista[i]!=null && lista[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public E zwrocElement(int indeks){
        try {
            return lista[indeks];
        }catch (ArrayIndexOutOfBoundsException e){
            return null;
        }
    }

    public boolean podmienElement(int indeks, E element){
        try {
            lista[indeks]=element;
            return true;
        }catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (E e : lista) {
            if (e != null) {
                buffer.append(e + ",");
            }
        }
        if (buffer.length()>1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }
}
