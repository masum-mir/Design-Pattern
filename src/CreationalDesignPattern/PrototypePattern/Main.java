package CreationalDesignPattern.PrototypePattern;

public class Main {
    public static void main(String[] args) {


        NetworkConnection connection = new NetworkConnection();
        connection.setIp("192.168.111.01");
        connection.loadData();

        System.out.println(connection);

        // remove 0 index /// Shallow copy
//        connection.getDomains().remove(0);

        // new object
        NetworkConnection con = null,con2 = null;

        try {
            con = connection.clone();
            con2 = connection.clone();

            // deep copy
            connection.getDomains().remove(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(connection);
        System.out.println(con);
        System.out.println(con2);

    }
}
