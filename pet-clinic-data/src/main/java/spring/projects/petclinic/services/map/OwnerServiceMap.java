package spring.projects.petclinic.services.map;

//import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.projects.petclinic.model.Owner;
import spring.projects.petclinic.services.OwnerService;

import java.util.Set;

@Service
//@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save( Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
