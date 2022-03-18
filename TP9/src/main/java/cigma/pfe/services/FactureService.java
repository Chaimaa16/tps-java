package cigma.pfe.services;

import cigma.pfe.models.Facture;

import java.util.List;

public interface FactureService {
    Facture creates(Facture f);
    List<Facture> reads();
    void deletes(Long id);
    Facture updates(Facture f);
}
