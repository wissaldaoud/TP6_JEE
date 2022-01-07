package web;
import java.util.ArrayList;

import java.util.List;
import metier.Produit;
import javax.persistence.Entity;


public class ProduitModele {
private String motCle;
List<metier.Produit> produits = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<metier.Produit> getProduits() {
return produits;
}
public void setProduits(List<metier.Produit> produits) {
this.produits = produits;
}
}
