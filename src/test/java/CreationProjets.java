/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bello
 */
import com.bootcamp.AppConstants;
import com.bootcamp.crud.ProjetCRUD;
import com.bootcamp.enums.EtatProjet;
import com.bootcamp.jpa.entities.Projet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Properties;
import javax.persistence.Persistence;
import org.testng.annotations.Test;

public class CreationProjets {

    @Test
    public void generateTables() {
        Persistence.generateSchema(AppConstants.PERSISTENCE_UNIT, new Properties());
    }

    @Test
    public void createProjets() throws SQLException {
        int l = 77;

        for (int i = 0; i < l; i++) {
            Projet projet = this.personnaliserProjet("Projet n°"+(i+1), "Référence n°"+(i+1));
            ProjetCRUD.create(projet);
        }
    }

    public Projet personnaliserProjet(String nom, String ref) {
        Timestamp maintenant = new Timestamp(System.currentTimeMillis());
        Projet p1 = new Projet();
        p1.setBudgetPrevisionnel(0);
        p1.setCoutReel(0);
        p1.setDateDeDebutPrevisionnelle(maintenant);
        p1.setDateDeDebutReelle(maintenant);
        p1.setDateDeFinPrevisionnelle(maintenant);
        p1.setDateDeFinReelle(maintenant);
        p1.setEtat(EtatProjet.pre_etude);
        p1.setNom(nom);
        p1.setPhaseActuelle("Attente de financement");
        p1.setReference(ref);
        return p1;
    }
}
