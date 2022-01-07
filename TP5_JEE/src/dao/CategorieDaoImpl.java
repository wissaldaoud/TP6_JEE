package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import metier.Categorie;
import util.JpaUtil;

public class CategorieDaoImpl implements ICategorieDao {
private EntityManager entityManager=JpaUtil.getEntityManager("TP5_JEE");
@Override
public Categorie save(Categorie cat ) {
EntityTransaction tx = entityManager.getTransaction();
tx.begin();
entityManager.persist(cat);
tx.commit();
return cat;
}
@Override
public Categorie getCategorie(Long id) {
 return entityManager.find(Categorie.class, id);
}
@Override
public Categorie updateCategorie(Categorie cat) {
EntityTransaction tx = entityManager.getTransaction();
tx.begin();
entityManager.merge(cat);
tx.commit();
return cat;
}
@Override
public void deleteCategorie(Long id) {
Categorie categorie = entityManager.find(Categorie.class, id);
entityManager.getTransaction().begin();
entityManager.remove(categorie);
entityManager.getTransaction().commit();
}
@Override
public List<Categorie> getAllCategories() {
List<Categorie> cats = entityManager.createQuery("select c from Categorie c").getResultList();
return cats;
}
}