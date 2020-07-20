public class Newtech
{
    private String country;

    private  String[] courses;

    private  String lastName;

    private  String admissionDate;

    private  String address;

    private  String city;

    private  String mobile;

    private  String description;

    private  String firstName;



    private  String programme;

    private  String age;

    private  String email;



    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getCountry()
    {
        return country;
    }

    public String[] getCourses ()
    {
        return courses;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getAdmissionDate ()
    {
        return admissionDate;
    }

    public void setAdmissionDate (String admissionDate)
    {
        this.admissionDate = admissionDate;
    }



    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getMobile ()
    {
        return mobile;
    }

    public void setMobile (String mobile)
    {
        this.mobile = mobile;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getFirstName(String mmm)
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }



    public String getProgramme()
    {
        return programme;
    }

    public void setProgramme (String programme)
    {
        this.programme = programme;
    }

    public String getAge ()
    {
        return age;
    }

    public void setAge (String age)
    {
        this.age = age;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", courses = "+courses+", lastName = "+lastName+", admissionDate = "+admissionDate+", address = "+address+", city = "+city+", mobile = "+mobile+", description = "+description+", firstName = "+firstName+",  programme = "+programme+", age = "+age+", email = "+email+"]";
    }
}
			
			