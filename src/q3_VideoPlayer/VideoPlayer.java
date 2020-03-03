package q3_VideoPlayer;

public class VideoPlayer {

    private String contentUri;
    private float playHead;
    private float playbackRate;

    public VideoPlayer() {
        // get VideoView using findViewById
        // make MediaController
        // set video content URI
        playHead = 0;
        playbackRate = 1;
        contentUri = "empty";
    }

    public void setContentUri(String u){ 
        contentUri = u; 
        System.out.println("Media loaded: "+contentUri);
    }
    public void setPlayRate(float r){ playbackRate = r; }
    public void setPlayHead(int p){ playHead = p; }

    public void Play(){
        if(playbackRate == 0) setPlayRate(1);
        int videoLength = 10;
    
        // run the playback on a parallel thread to gain playback control

        while(playHead>=0 && playHead<=videoLength && playbackRate!=0){
            for(int i=0; i<playHead; i++){
                System.out.print("E");
            }
            for(int i=(int)playHead; i<videoLength; i++){
                System.out.print("-");
            }
            System.out.println("");
            playHead += playbackRate;
        }
        setPlayRate(1);
        // close video player
    }

    public void Pause(){
        playbackRate = 0;
        System.out.println("Playback Rate: Paused");
    }

    public void Forward() {
        playbackRate ++;
        System.out.println("Playback Rate: "+playbackRate);
    }

    public void Rewind() {
        playbackRate = playbackRate-2;
        System.out.println("Playback Rate: "+playbackRate);
    }

    public static void TestVideoPlayer(){
        VideoPlayer v = new VideoPlayer();
        v.setContentUri("folder/funnyvideo.mp4");
        v.setPlayHead(0);
        v.Play();

        v.setContentUri("folder/boringvideo.mp4");
        v.setPlayHead(0);
        v.Forward();
        v.Play();

        v.setContentUri("folder/boringvideo.mp4");
        v.setPlayHead(10);
        v.Rewind();
        v.Play();
    }
}