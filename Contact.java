
/********************************************
*  Final Project: BeBes Backyard Landscaping*                          
*  Jennifer Lis                             *				
*  Date: 2-15-21                            *			
*********************************************/

/**
 *
 * @author LisJennifer
 */
public class Contact {
    //attributes
    private int ID;
    private String name;
    private String address;

    
    //constructors
    public Contact() {
        ID = 0;
        name = "Unknown";
        address = "Unknown"; 
    }
    
    public Contact(int ID, String name, String address)
    {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }
    
    //behaviors
    @Override
    public String toString() {
        return "Contact{" + "ID=" + ID + ", name=" + name + ", address=" +
            address + '}';
    }

    //getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
