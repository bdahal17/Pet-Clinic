package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.DataService;

public class VetMapService extends AbstractMapService<Vet, Long> implements DataService<Vet, Long> {
    @Override
    public Iterable<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(),obj);
    }

    @Override
    public void delete(Vet obj) {

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
