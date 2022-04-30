package fi.vamk.tka.bird.entity;
import javax.persistence.*;
//{"textid":"CYGOLO","latin":"Cygnus olor","finnish":"Kyhmyjoutsen","swedish":"Kn\u00f6lsvan","english":"Mute Swan"}
    @Entity
public class Bird{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String textid;
    private String latin;
    private String finnish;
    private String swedish;
    private String english;

    //Entiteetti-luokka vastaa tietokannan taulua
    public Bird(){}

    public int getId(){
        return id;
    }

    public void setId(int _id){
        id=_id;
    }

    public String getTextid(){
        return textid;
    }

    public void setTextid(String _textid){
        textid=_textid;
    }

    public String getLatin(){
        return latin;
    }

    public void setLatin(String _textid){
        latin=_textid;
    }

    public String getFinnish(){
        return finnish;
    }

    public void setFinnish(String _textid){
        finnish=_textid;
    }

    public String getSwedish(){
        return swedish;
    }

    public void setSwedish(String _textid){
        swedish=_textid;
    }

    public String getEnglish(){
        return english;
    }

    public void setEnglish(String _textid){
        english=_textid;
    }
}