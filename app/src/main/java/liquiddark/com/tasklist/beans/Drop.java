package liquiddark.com.tasklist.beans;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mhr on 08-Feb-17.
 */

public class Drop extends RealmObject {


    @PrimaryKey
    private long added; //added time milli
    private String whatText;
    private long when;
    private boolean completed;


    public Drop(String whatText, long added, long when, boolean completed) {
        this.whatText = whatText;
        this.added = added;
        this.when = when;
        this.completed = completed;
    }

    public Drop() {

    }


    public String getWhatText() {
        return whatText;
    }

    public void setWhatText(String whatText) {
        this.whatText = whatText;
    }

    public long getAdded() {
        return added;
    }

    public void setAdded(long added) {
        this.added = added;
    }

    public long getWhen() {
        return when;
    }

    public void setWhen(long when) {
        this.when = when;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
