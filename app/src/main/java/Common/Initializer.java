package Common;

import com.jashtec.utilfindr.R;
/**
 * Created by Das on 17/10/15.
 */
public class Initializer {
    public static String[] getHealthData() {
        return new String[]{
                "Clinic", "Hospital", "Pharmacy", "Diagnostic Centre", "Pet clinic"
        };
    }

    public static Integer[] getHealthIcons()
    {
        return new Integer[]{
            R.string.icon_clinic, R.string.icon_hospital, R.string.icon_pharmacy, R.string.icon_diagnosis, R.string.icon_petclinic
        };
    }

    public static String[] getFoodData() {
        return new String[]{
                "Groceries", "Bakery", "Restaurant"
        };
    }

    public static String[] getElectronicsData() {
        return new String[]{
                "Browsing centre", "Computers"
        };
    }

    public static String[] getUtilitiesData() {
        return new String[]{
                "Electrician", "Plumber", "Hardwares", "Tailor", "Flower Shop", "Gift Shop", "Stationary", "Photocopy"
        };
    }
}
