public class Feed {
    private boolean isFull;
    private double weight;
    private static int bins =0;
    private static String feed_name;

    public int getAmount(){
        return bins;
    }
    public String getfeedname(){
        return feed_name;
    }
    public void setNameFeed(String feed_name) {
        this.feed_name = feed_name;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public void consume() {
        isFull = false;
    }

    Feed(String FeedName_p) {
        feed_name = FeedName_p;
    }

}
