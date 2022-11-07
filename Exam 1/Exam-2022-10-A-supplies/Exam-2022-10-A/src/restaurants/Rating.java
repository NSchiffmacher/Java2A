package restaurants;

public class Rating {
    private int quality;
    private String comment;

    public Rating(int quality, String comment){
        if      (quality < 1)   this.quality = 1;
        else if (quality > 4)   this.quality = 4;
        else                    this.quality = quality;

        this.comment = comment;
    }

    public int getQuality(){
        return this.quality; // return quality; marcherait aussi
    }

    public String toString(){
        return this.quality + "/4 : " + this.comment;
    }
}
