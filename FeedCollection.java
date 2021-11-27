public class FeedCollection {

    public static final int SIZE = 20;
    private Feed[] feedArray = new Feed[SIZE];
    public int getSize() {
        return SIZE;
    }
    public Feed[] getFeedArray() {
        return feedArray;
    }
    public void setFeedArray(Feed[] feedArray) {
        this.feedArray = feedArray;
    }
    public void setFeedNumber(int location, Feed feed) {
        try {
            feed = feedArray[location];
        } catch (Exception e) {
            System.out.println("Sorry,bin is full " );
        }
    }
    public void emptyFeedNumber(int id) {
        feedArray[id].consume();
    }
    public int getNumberOfFullBins() {
        int fullCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (feedArray[i] != null && feedArray[i].isFull()) {
                fullCounter++;
            }
        }
        return fullCounter;
    }
    public Feed getNextFullBin() {
        for (int i = 0; i < SIZE; i++) {
            if (feedArray[i] != null && feedArray[i].isFull()) {
                return feedArray[i];
            }
        }
        return null;
    }


}
