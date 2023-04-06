package ma.uiass.eia.pds.metier;

import ma.uiass.eia.pds.persistance.BatimentRepository;
import ma.uiass.eia.pds.persistance.BatimentRepositoryImpl;

public class BatimentServiceImpl implements BatimentService {
    BatimentRepository batimentRepository=new BatimentRepositoryImpl();

    @Override
    public void addBatiment(String nomBatiment) {
        batimentRepository.saveBatiment(nomBatiment);
    }



}
