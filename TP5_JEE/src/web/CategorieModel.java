package web;
import java.util.ArrayList;
import java.util.List;
import metier.Categorie;
public class CategorieModel {
List<Categorie> categories = new ArrayList<>();
public List<Categorie> getCategories() {
return categories;
}
public void setCategories(List<Categorie> categories) {
this.categories = categories;
}
}