package iterator;

public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public Iterator iterator(String type);

}
