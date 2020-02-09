package spring.projects.petclinic.services;

import spring.projects.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

}
