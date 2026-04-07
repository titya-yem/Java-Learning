public class VideoProcessor {
    private XVideoEncoder encoder;
    private XVideoDatabase database;
    private XEmailService email;

    public VideoProcessor(
            XVideoEncoder encoder,
            XVideoDatabase database,
            XEmailService email) {
        this.encoder = encoder;
        this.database = database;
        this.email = email;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        email.sendEmail(video.getUser());
    }
}

