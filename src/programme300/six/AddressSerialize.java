package programme300.six;

import java.io.Serializable;

public class AddressSerialize implements Serializable {
    private static final long serialVersionId=49131212123L;
    private String state;
    private String province;
    private String city;

    public AddressSerialize(String state, String province, String city) {
        this.state = state;
        this.province = province;
        this.city = city;
    }

    public static long getSerialVersionId() {
        return serialVersionId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("国家:"+state+",");
        stringBuilder.append("省:"+province+",");
        stringBuilder.append("市:"+city);
        return stringBuilder.toString();
    }


}
