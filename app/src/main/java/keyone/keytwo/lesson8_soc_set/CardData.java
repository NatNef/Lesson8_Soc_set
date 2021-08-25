package keyone.keytwo.lesson8_soc_set;

// бизнес логика, модель

import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class CardData {

    private String title;
    private String description;
    private int picture;
    private boolean Like;

    public CardData(String title, String description, int picture, boolean like) {
        this.title = title;
        this.description = description;
        this.picture = picture;
        this.Like = like;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPicture() {
        return picture;
    }

    public boolean isLike() {
        return Like;
    }
}
