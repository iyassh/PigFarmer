public class Feed {
    private static int bins =0;
    private static String feed_name;

    public int getAmount(){
        return bins;
    }
    public String getfeedname(){
        return feed_name;
    }

    public static void Consume(){
        if( bins == 0){
            System.out.println("There are no more bins left for consumption");
        }
        else{
            bins = bins - 1;
        }
    }

    Feed(String feed_name_fn, int bins_b) {
        feed_name = feed_name_fn;
        bins = bins_b;
    }
    public void add(int addbins){
        bins+=addbins;


    }
}
