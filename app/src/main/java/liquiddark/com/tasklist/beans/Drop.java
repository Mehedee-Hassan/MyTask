package liquiddark.com.tasklist.beans;

/**
 * Created by mhr on 08-Feb-17.
 */

public class Drop  {
    private String whatText;
    private long added;
    private long when;

    private boolean completed;

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
