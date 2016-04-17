
package Role;
import Dislocation.Path;

/**
 * Created by Misha on 17.04.2016.
 */
public class Condition {
    private Path Position;
    private boolean send;

    public void setSend(boolean send) {
        this.send = send;
    }

    public boolean isSend() {
        return send;
    }
}
