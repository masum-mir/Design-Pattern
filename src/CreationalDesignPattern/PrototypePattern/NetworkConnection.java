package CreationalDesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public NetworkConnection() {

    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadData() {
        this.data = "load data";   // it will take 2 minit.
        domains.add("www.abc.com");
        domains.add("www.efg.com");
        domains.add("www.ijk.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

//    @Override
//    public NetworkConnection clone() {
//        try {
//            NetworkConnection clone = (NetworkConnection) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    @Override
    public NetworkConnection clone() {
        //logic for cloneing
        try {
            NetworkConnection connection = new NetworkConnection();
            connection.setIp(this.getIp());
            connection.setData(this.getData());

            for(String str: this.getDomains()) {
                connection.getDomains().add(str);
            }

            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
