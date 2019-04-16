package rocks.zipcode.io.objectorientation;

public class Television {

    private Integer channel;
    private String name;



    public void turnOn() {
    }

    public Television() {
    }

    public TVChannel getChannel() {
        return TVChannel.getByOrdinal(channel);
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public void setChannel(Integer channel) {
//    }
//
//    public TVChannel getChannel() {
//        return null;
//    }
}
