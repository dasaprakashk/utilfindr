package BusinessObjects;

/**
 * Created by Das on 03/11/15.
 */
public class DoctorSpeciality {
    private int id;
    private String name;

    public DoctorSpeciality(String name)
    {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
