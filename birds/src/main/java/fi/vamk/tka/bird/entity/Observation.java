package fi.vamk.tka.bird.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Observation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private int birdId;

	private String city;
    private String oDate;
    private String email;
    
    public Observation() {
		super();
	}
    
    public int getId(){
        return id;
    }

    public void setId(int _id){
        id=_id;
    }

    public int getBirdId() {
		return birdId;
	}

	public void setBirdId(int birdId) {
		this.birdId = birdId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getoDate() {
		return oDate;
	}

	public void setoDate(String oDate) {
		this.oDate = oDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
