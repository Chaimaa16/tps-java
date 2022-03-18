package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;

import java.util.List;

public class FactureController {
    FactureService fs;

    public FactureController(FactureService fs) {
        this.fs = fs;
    }

    public FactureService getFs() {
        return fs;
    }

    public void setFs(FactureService fs) {
        this.fs = fs;
    }
    public List<Facture> reads(){
        return fs.reads();
    }
    public Facture creates(Facture f){
        return fs.creates(f);
    }
    public void deletes(long id){
        fs.deletes(id);
    }
    public void updates(Facture f){
        fs.updates(f);
    }
}
