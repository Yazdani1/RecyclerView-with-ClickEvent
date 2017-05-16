package yazdaniscodelab.recyclerview_with_clickevent;

/**
 * Created by Yazdani on 5/16/2017.
 */

public class Data {

    public Data(int img_res,String title,String description,String author,String price){

        setImg_res(img_res);
        setTitle(title);
        setDescription(description);
        setAuthor(author);
        setPrice(price);

    }


    int img_res;
    String title;
    String description;
    String author;
    String price;


    public int getImg_res(){
        return img_res;
    }

    public void setImg_res(int img_res){
        this.img_res=img_res;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getDescription(){
       return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price=price;
    }


}
