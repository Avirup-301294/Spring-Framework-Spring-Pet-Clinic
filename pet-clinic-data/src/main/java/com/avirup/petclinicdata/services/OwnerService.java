package com.avirup.petclinicdata.services;

import com.avirup.petclinicdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
       Owner findByLastName(String lastName);
}
