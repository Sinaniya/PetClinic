package speing.projects.petclinic.services;

import speing.projects.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

}
