package util;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Entity;

public class JpaUtil {
private static EntityManagerFactory factory;
private static EntityManager entityManager;
public static EntityManager getEntityManager(String persistUnit) 
 {
if (entityManager==null)
{
factory = 
Persistence.createEntityManagerFactory(persistUnit);
 entityManager = factory.createEntityManager();
}
return entityManager;
}
}