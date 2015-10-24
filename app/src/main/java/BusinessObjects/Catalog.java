package BusinessObjects;

/**
 * Created by Das on 24/10/15.
 */
public class Catalog {

    public Catalog()
    {

    }

    public Catalog(int id, String text, int icon, int groupId)
    {
        this.id = id;
        this.text = text;
        this.icon = icon;
        this.groupId = groupId;
    }

    //Members
    private int id;
    private String text;
    private int icon;
    private int groupId;

    //Properties
    public int getId() {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public int getIcon(){
        return this.icon;
    }

    public void setIcon(int icon){
        this.icon = icon;
    }

    public int getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(int groupId){
        this.groupId = groupId;
    }
}
