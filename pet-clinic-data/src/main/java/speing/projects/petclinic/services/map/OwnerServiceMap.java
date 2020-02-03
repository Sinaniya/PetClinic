package speing.projects.petclinic.services.map;

import speing.projects.petclinic.model.Owner;
import speing.projects.petclinic.services.CrudService;

import java.util.Set;

public interface OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {
    @Override
    default Owner save(Owner object) {
        return null;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default Set<Owner> findAll() {
        return null;
    }

    @Override
    default Owner findById(Long aLong) {
        return null;
    }

    @Override
    default Owner save(Long aLong, Owner object) {
        return null;
    }

    @Override
    default void delete(Owner object) {

    }
}
