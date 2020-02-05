package speing.projects.petclinic.services.map;

import speing.projects.petclinic.model.Vet;
import speing.projects.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId()),object;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        return super.delete(object);

    }
}
