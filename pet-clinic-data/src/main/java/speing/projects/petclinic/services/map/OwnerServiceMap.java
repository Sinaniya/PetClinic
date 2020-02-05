package speing.projects.petclinic.services.map;

import speing.projects.petclinic.model.Owner;
import speing.projects.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {


    @Override
    default void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    default Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    default Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    default Owner save( Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    default void delete(Owner object) {
super.delete(object);
    }
}
