package pojos.petstore;


public class TagsItem{
    private String name;
    private Integer id;

    public TagsItem() {
    }

    public TagsItem(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    @Override
    public String toString(){
        return
                "TagsItem{" +
                        "name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}
