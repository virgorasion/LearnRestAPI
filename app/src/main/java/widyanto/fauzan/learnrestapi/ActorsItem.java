package widyanto.fauzan.learnrestapi;

import com.google.gson.annotations.SerializedName;

public class ActorsItem{

	@SerializedName("country")
	private String country;

	@SerializedName("image")
	private String image;

	@SerializedName("children")
	private String children;

	@SerializedName("dob")
	private String dob;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("spouse")
	private String spouse;

	@SerializedName("height")
	private String height;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setChildren(String children){
		this.children = children;
	}

	public String getChildren(){
		return children;
	}

	public void setDob(String dob){
		this.dob = dob;
	}

	public String getDob(){
		return dob;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setSpouse(String spouse){
		this.spouse = spouse;
	}

	public String getSpouse(){
		return spouse;
	}

	public void setHeight(String height){
		this.height = height;
	}

	public String getHeight(){
		return height;
	}
}