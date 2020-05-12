package Day38OOPEncapsulation;

public class TestData {

    /*
    our test datas:
    Name
    ID
     */
    private String Name="Bekir";
    private int ID=897;

    //getters are below
    public String getName(){//only helps to read the  private data
        return Name;
    }
    public int getID(){
      //
        return ID;
    }

    //setters are below

    public void setName(String Name){
        this.Name=Name;
        }

    public void setID(int ID){
        this.ID=ID;
    }


    public static void main(String[] args) {

    }
}
