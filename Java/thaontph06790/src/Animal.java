
/**
 *
 * @author tvmin
 */
public class Animal {

    public String Name;
    public String Color;
    public double Weight;

    public String status() {
        String status;
        if (this.Weight < 2) {
            status = "Gay";
        } else if (this.Weight < 4) {
            status = "Binh thuong";
        } else {
            status = "Beo";
        }
        return status;
    }
}
