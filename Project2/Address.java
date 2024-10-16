package Project2;

public class Address {
    int aId;
    String cityName;
    String stateName;


    @Override
    public String toString() {
        return "Address{" +
                "aId=" + aId +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                '}';
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public Address(int aId, String cityName, String stateName) {
        this.aId = aId;
        this.cityName = cityName;
        this.stateName = stateName;
    }


}
