package org.iesfm.listas;

import java.util.List;

public class ListExercises {
    //un metodo que dada una lista de strings devuelva el primer elemento si existe
    public String firstElement(List<String> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    //un metodo que dada una lista de string devuelva el ultimo elemento si existe
    public String lastElement(List<String> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            int lastIndex = list.size() - 1;
            return list.get(lastIndex);
        }
    }

    //un metodo que dada una lista de string y un string lo inserte en la primera posicion
    public List<String> insertFirstPosition(List<String> list, String name){
        list.add(0,name);

        return list;
    }
    //un mwetodo que dada una lista de string, una posicion y un string sustituya el valor en la posicion
    public List<String> sustitutePosition(List<String> list, String name, int position){
        list.set(position, name);

        return list;
    }
}
