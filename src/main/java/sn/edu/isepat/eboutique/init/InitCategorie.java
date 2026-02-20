package sn.edu.isepat.eboutique.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import sn.edu.isepat.eboutique.entities.Categorie;
import sn.edu.isepat.eboutique.repositories.CategorieRepository;

@Component
public class InitCategorie implements CommandLineRunner {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public void run(String... args) throws Exception {
        if(categorieRepository.findByNom("ELECTROMENAGER-Sow-Dianor-Oumou") == null){
            Categorie categorie = new Categorie();
            categorie.setNom("ELECTROMENAGER-Sow-Dianor-Oumou");
            categorieRepository.save(categorie);
        }
    }
}
