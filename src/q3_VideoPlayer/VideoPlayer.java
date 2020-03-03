package q3_VideoPlayer;

public class VideoPlayer {

    private String contentUri;
    private float playHead;
    private float playbackRate;
    private int playDirection;

    public VideoPlayer() {
        // get VideoView using findViewById
        // make MediaController
        // set video content URI
        playHead = 0;
        playbackRate = 1;
        playDirection = 1;
        contentUri = "empty";
    }

    public void setContentUri(String u){ contentUri = u; }
    public void setPlayDirection(int d){ playDirection = d/Math.abs(d); }
    public void setPlayHead(int p){ playHead = p; }

    public void forward() {
        isForwared = true;
        // if rewind is not enabled, only then forward
        if (!isRewind) {
        }
        if (COUNT > index) {
            index++;
        } else {
            index = 1;
        }
        play();
    }

    public void Rewind() {
        if (isForwared) {
            // if video has been forwared then reduce index by 1 to the same video
            index--;
        }
        isRewind = true;
        play();
        isForwared = false;
    }

    public void UnRewind() {
        isRewind = false;
    }

}