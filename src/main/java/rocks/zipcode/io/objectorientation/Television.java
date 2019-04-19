package rocks.zipcode.io.objectorientation;

public class Television {

  //  private Integer channel;
    private String name;
    private  boolean on;
    private TVChannel channel;



    public void turnOn() {
        on =true;

    }

    public Television() {
    }

    public TVChannel getChannel()
    {
        return channel;
    }

    public void setChannel(Integer channelNumber) {
        if (on) {

            channel = TVChannel.getByOrdinal(channelNumber);
        } else {
            throw new IllegalStateException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
