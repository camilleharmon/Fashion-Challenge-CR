public class Item{

    private String name;
    private String type;
    private int value;
    private String fileName;

    public Item(String n, String t, int v, String fn){

        name = n;
        type = t;
        value = v;
        fileName = fn;
    }

    public String getName(){

        return name; 
    }

    public void setName(String name){

        this.name = name;
    }

    public String getType(){

        return type; 
    }

    public void setType(String type){

        this.type = type;
    }

    public int getValue(){

        return value; 
    }

    public void setValue(int value){

        this.value = value;
    }

    public String getFileName(){

        return fileName; 
    }

    public void setFileName(String fileName){

        this.fileName = fileName;
    }
}