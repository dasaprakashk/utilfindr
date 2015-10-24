package Common;

import com.jashtec.utilfindr.R;

import java.util.ArrayList;

import BusinessObjects.Catalog;

/**
 * Created by Das on 17/10/15.
 */
public class Initializer {
    public static ArrayList<Catalog> getData() {
        ArrayList<Catalog> catalogCollection = new ArrayList<Catalog>();
        Catalog objCatalog = new Catalog(1, "Clinic", R.string.icon_clinic, 1);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(2, "Clinic", R.string.icon_clinic, 1);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(3, "Hospital", R.string.icon_hospital, 1);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(4, "Pharmacy", R.string.icon_pharmacy, 1);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(5, "Diagnostic Centre", R.string.icon_diagnosis, 1);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(6, "Pet clinic", R.string.icon_petclinic, 1);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(7, "Groceries", R.string.icon_grocery, 2);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(8, "Bakery", R.string.icon_bakery, 2);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(9, "Restaurant", R.string.icon_restaurant, 2);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(10, "Browsing centre", R.string.icon_browser, 3);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(11, "Computers", R.string.icon_computer, 3);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(12, "Electrician", R.string.icon_electrician, 4);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(13, "Plumber", R.string.icon_plumber, 4);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(14, "Hardwares", R.string.icon_hardware, 4);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(15, "Tailor", R.string.icon_tailor, 4);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(16, "Flower Shop", R.string.icon_flower, 4);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(17, "Gift Shop", R.string.icon_gift, 4);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(18, "Stationary", R.string.icon_stationary, 4);
        catalogCollection.add(objCatalog);
        objCatalog = new Catalog(19, "Photocopy", R.string.icon_photocopy, 4);
        catalogCollection.add(objCatalog);
        return catalogCollection;
    }

    public enum ContentType
    {
        HEALTH,
        FOOD,
        ELECTRONICS,
        UTILITIES
    }
}
