package com.nj86.utils;

public class IPLocation {

    private String country;
    private String area;
    private String ip;
    private String city;
    private String province;
    private String isp;


    public IPLocation() {
        country = area = city = ip= province =  isp = "";
    }

    public synchronized IPLocation getCopy() {
        IPLocation ret = new IPLocation();
        ret.country = country;
        ret.area = area;
        return ret;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        city = "";
        if(country != null){
            String[] array = country.split("省");
            if(array != null && array.length > 1){
                city =  array[1];
            } else {
                city = country;
            }
            if(city.length() > 3){
                city.replace("内蒙古", "");
            }
        }
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getIp() {
        return ip;
    }

    public String getProvince() {
        return province;
    }

    public String getIsp() {
        return isp;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(area.trim().equals("CZ88.NET")){
            this.area="本地网络";
        }else{
            this.area = area;
        }
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"country\":\"")
                .append(country).append('\"');
        sb.append(",\"area\":\"")
                .append(area).append('\"');
        sb.append(",\"ip\":\"")
                .append(ip).append('\"');
        sb.append(",\"city\":\"")
                .append(city).append('\"');
        sb.append(",\"province\":\"")
                .append(province).append('\"');
        sb.append(",\"isp\":\"")
                .append(isp).append('\"');
        sb.append('}');
        return sb.toString();
    }

}
