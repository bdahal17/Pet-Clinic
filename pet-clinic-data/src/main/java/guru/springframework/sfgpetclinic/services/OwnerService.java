package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends DataService<Owner, Long> {

    Owner findByLastName(String lastName);

}
