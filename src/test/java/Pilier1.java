/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.bootcamp.crud.CategorieCRUD;
import com.bootcamp.jpa.entities.Axe;
import com.bootcamp.jpa.entities.Pilier;
import com.bootcamp.jpa.entities.Secteur;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;

/**
 *
 * @author Bello
 */
public class Pilier1 {
    
    @Test
    public Pilier1() throws SQLException {
        //Creation et instantation du pilier n°1
        Timestamp maintenant = new Timestamp(System.currentTimeMillis());
        
        List<Integer> projets1 = new ArrayList<Integer>();
        projets1.add(1); projets1.add(2); projets1.add(3); projets1.add(4);
        projets1.add(5); projets1.add(6); projets1.add(7); projets1.add(8); projets1.add(9);
        
        List<Integer> projets2 = new ArrayList<Integer>();
        projets2.add(10); projets2.add(11); projets2.add(12); projets2.add(13);
        projets2.add(14); projets2.add(15); projets2.add(16); projets2.add(17); projets2.add(18);
        
        List<Integer> projets3 = new ArrayList<Integer>();
        projets3.add(19); projets3.add(20); projets3.add(21); projets3.add(22);
        projets3.add(23); projets3.add(24); projets3.add(25); projets3.add(26); projets3.add(27);
        
        List<Integer> projets4 = new ArrayList<Integer>();
        projets4.add(28); projets4.add(29); projets4.add(30); projets4.add(31);
        projets4.add(31); projets4.add(32); projets4.add(33); projets4.add(34); projets4.add(35);
        
        List<Integer> projets5 = new ArrayList<Integer>();
        projets5.add(36); projets5.add(37); projets5.add(38); projets5.add(39);
        projets5.add(40); projets5.add(41); projets5.add(42); projets5.add(43); projets5.add(44);
        
        List<Integer> projets6 = new ArrayList<Integer>();
        projets6.add(45); projets6.add(46); projets6.add(47); projets6.add(48);
        projets6.add(49); projets6.add(50); projets6.add(51); projets6.add(52); projets6.add(53);
        
        List<Integer> projets7 = new ArrayList<Integer>();
        projets7.add(54); projets7.add(55); projets7.add(56); projets7.add(57);
        projets7.add(58); projets7.add(59); projets7.add(60); projets7.add(61); projets7.add(62);
        
        List<Integer> projets8 = new ArrayList<Integer>();
        projets8.add(63); projets8.add(64); projets8.add(65); projets8.add(66);
        projets8.add(67); projets8.add(68); projets8.add(69); projets8.add(70); projets8.add(71);
        
        List<Integer> projets9 = new ArrayList<Integer>();
        projets9.add(72); projets9.add(73); projets9.add(74); projets9.add(75);
        projets9.add(76); projets9.add(77);
        
        
        Pilier pilier = new Pilier();
        pilier.setName("Consolider la démocratie, l'État de droit et la bonne gouvernance");
        pilier.setDescription("La stabilité démocratique et institutionnelle du Bénin est reconnue sur la scène internationale.");
        pilier.setCreateAt(maintenant);
        pilier.setUpdateAt(maintenant);

        Pilier pilier2 = new Pilier();
        pilier2.setName("Engager la transformation structurelle de l'économie");
        pilier2.setDescription("Ce pilier est au cœur du Programme « Bénin Révélé ».");
        pilier2.setCreateAt(maintenant);
        pilier2.setUpdateAt(maintenant);

        Pilier pilier3 = new Pilier();
        pilier3.setName("Améliorer les conditions de vie des populations");
        pilier3.setDescription("L’absence de protection sociale mine les ressources nancières des Béninois, notamment les plus démunis.");
        pilier3.setCreateAt(maintenant);
        pilier3.setUpdateAt(maintenant);

        //Creation et instantation de l'axe n°1
        Axe axe1 = new Axe();
        axe1.setName("Renforcement des bases de la démocratie et de l’état de droit");
        axe1.setDescription("Cela passera notamment par une révision de la Constitution.");
        axe1.setFocus("Cet axe stratégique insistera sur la mise en place d’instruments juridiques");
        axe1.setPilier(pilier);
        axe1.setCreateAt(maintenant);
        axe1.setUpdateAt(maintenant);

        //Creation et instantation de l'axe n°2
        Axe axe2 = new Axe();
        axe2.setName("Amélioration de la gouvernance");
        axe2.setDescription("Cela inclura, entre autres, l’informatisation et la dématérialisation de l’administration (smart gouv), ainsi que la fusion de la gendarmerie et de la police nationale.");
        axe2.setFocus("Le réseau diplomatique béninois sera modernisé et mobilisé pour la réalisation du Programme « Bénin Révélé ».");
        axe2.setPilier(pilier);
        axe2.setCreateAt(maintenant);
        axe2.setUpdateAt(maintenant);

        //Creation et instantation de l'axe n°3
        Axe axe3 = new Axe();
        axe3.setName("Assainissement du cadre macroéconomique et maintien de la stabilité");
        axe3.setDescription("Cela se traduira notamment par l’adoption d’un cadre réglementaire uni et pour les opérations de partenariats public-privé.");
        axe3.setFocus("Le Gouvernement prendra un ensemble de mesures visant à améliorer les performances du Bénin sur l’indice Doing Business.");
        axe3.setPilier(pilier2);
        axe3.setCreateAt(maintenant);
        axe3.setUpdateAt(maintenant);

        //Creation et instantation de l'axe n°2
        Axe axe4 = new Axe();
        axe4.setName("Amélioration de la croissance économique");
        axe4.setDescription("La relance économique s’appuiera sur des secteurs stratégiques qui sont aujourd ́hui sous-valorisés, malgré un potentiel solide.");
        axe4.setFocus("Économie numérique\n"
                + "Transports\n"
                + "Artisanat");
        axe4.setPilier(pilier2);
        axe4.setCreateAt(maintenant);
        axe4.setUpdateAt(maintenant);

        //Creation et instantation de l'axe n°2
        Axe axe5 = new Axe();
        axe5.setName("Amélioration des performances de l’éducation");
        axe5.setDescription("Le système éducatif sera reconstruit et modernisé par l’élaboration d’une nouvelle gouvernance et l’amélioration de la qualité de l’enseignement.");
        axe5.setFocus("Objectif");
        axe5.setPilier(pilier2);
        axe5.setCreateAt(maintenant);
        axe5.setUpdateAt(maintenant);

        //Creation et instantation de l'axe n°2
        Axe axe6 = new Axe();
        axe6.setName("Renforcement des services sociaux de base et protection sociale");
        axe6.setDescription("Cela inclut la mise en place dans toutes les localités d’infrastructures et équipements pour la santé, l’accès à l’eau et à l’électricité d’appui à l’emploi.");
        axe6.setFocus("Objectif stratégique");
        axe6.setCreateAt(maintenant);
        axe6.setUpdateAt(maintenant);
        axe6.setPilier(pilier3);

        //Creation et instantation de l'axe n°2
        Axe axe7 = new Axe();
        axe7.setName("Développement équilibré et durable de l’espace national");
        axe7.setDescription("");
        axe7.setFocus("");
        axe7.setCreateAt(maintenant);
        axe7.setUpdateAt(maintenant);
        axe7.setPilier(pilier3);

        Secteur s1 = new Secteur();
        s1.setNom("Agriculture");
        s1.setDescription("Tout pour l'agriculture");
        s1.setObjectif("Moderniser le domaine de l'agriculture");
        s1.setCreateAt(maintenant);
        s1.setUpdateAt(maintenant);
        s1.setAxe(axe4);
        s1.setProjets(projets1);
        
        Secteur s2 = new Secteur();
        s2.setNom("Numérique");
        s2.setDescription("Tout pour le umérique");
        s2.setObjectif("Moderniser le domaine de le umérique");
        s2.setCreateAt(maintenant);
        s2.setUpdateAt(maintenant);
        s2.setAxe(axe4);
        s2.setProjets(projets2);

        Secteur s3 = new Secteur();
        s3.setNom("Tourisme");
        s3.setDescription("Tout pour le tourisme");
        s3.setObjectif("Moderniser le domaine du tourisme");
        s3.setCreateAt(maintenant);
        s3.setUpdateAt(maintenant);
        s3.setAxe(axe4);
        s3.setProjets(projets3);

        Secteur s4 = new Secteur();
        s4.setNom("Infrastructure");
        s4.setDescription("Tout pour l'infrastructure");
        s4.setObjectif("Moderniser le domaine de l'infrastructure");
        s4.setCreateAt(maintenant);
        s4.setUpdateAt(maintenant);
        s4.setAxe(axe4);
        s4.setProjets(projets4);

        Secteur s5 = new Secteur();
        s5.setNom("CIIS");
        s5.setDescription("Seme City");
        s5.setObjectif("Un creuset pour le savaoir");
        s5.setCreateAt(maintenant);
        s5.setUpdateAt(maintenant);
        s5.setAxe(axe5);
        s5.setProjets(projets5);

        Secteur s6 = new Secteur();
        s6.setNom("Eau");
        s6.setDescription("Accès à l'eau potable pour tous");
        s6.setObjectif("Accès à l'eau potable pour tous");
        s6.setCreateAt(maintenant);
        s6.setUpdateAt(maintenant);
        s6.setAxe(axe1);
        s6.setProjets(projets6);

        Secteur s7 = new Secteur();
        s7.setNom("Protection sociale");
        s7.setDescription("Tout pour la sécurité sociale");
        s7.setObjectif("Améliorer la Vie sociale");
        s7.setCreateAt(maintenant);
        s7.setUpdateAt(maintenant);
        s7.setAxe(axe6);
        s7.setProjets(projets7);

        Secteur s8 = new Secteur();
        s8.setNom("Electricité");
        s8.setDescription("Tout pour l'électricité");
        s8.setObjectif("Moderniser le domaine de la fourniture de l'électricité");
        s8.setCreateAt(maintenant);
        s8.setUpdateAt(maintenant);
        s8.setAxe(axe4);
        s8.setProjets(projets8);

        Secteur s9 = new Secteur();
        s9.setNom("Cadre de vie");
        s9.setDescription("Amélioration du cadre de vie");
        s9.setObjectif("Amélioration du cadre de vie");
        s9.setCreateAt(maintenant);
        s9.setUpdateAt(maintenant);
        s9.setAxe(axe6);
        s9.setProjets(projets9);
        
        CategorieCRUD.create(pilier);
        CategorieCRUD.create(pilier2);
        CategorieCRUD.create(pilier3);
        CategorieCRUD.createAxe(axe1);
        CategorieCRUD.createAxe(axe2);
        CategorieCRUD.createAxe(axe3);
        CategorieCRUD.createAxe(axe4);
        CategorieCRUD.createAxe(axe5);
        CategorieCRUD.createAxe(axe6);
        CategorieCRUD.createAxe(axe7);
        CategorieCRUD.createSecteur(s1);
        CategorieCRUD.createSecteur(s2);
        CategorieCRUD.createSecteur(s3);
        CategorieCRUD.createSecteur(s4);
        CategorieCRUD.createSecteur(s5);
        CategorieCRUD.createSecteur(s6);
        CategorieCRUD.createSecteur(s7);
        CategorieCRUD.createSecteur(s8);
        CategorieCRUD.createSecteur(s9);
    }
}
