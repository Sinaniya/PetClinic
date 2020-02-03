package speing.projects.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract interface AbstractMapService<T,ID> {
    protected Map<ID, T> map=new HashMap<>();

    Set<T> findAll(){

        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
        }
        T save (ID id,T object){
        map.put(id, object);
        }
        void delete(T object){
        map.entrySet(entry->entry.getValue().equals(object));
        }
}
