package cigma.pfe.services;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;

import java.util.List;

public class FactureServiceImpl implements FactureService {
   FactureRepository factor ;
    @Override
    public Facture creates(Facture f) {
        return factor.create(f);
    }

    @Override
    public List<Facture> reads() {
        return factor.read();
    }

    @Override
    public void deletes(Long id) {
        factor.deleter(id);
    }

    @Override
    public Facture updates(Facture f) {
        return factor.update(f);
    }
}
