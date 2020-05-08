package Rephlits;

public class ClassObject_PlaylistEntry {
    String title ;
    String artist;
    int playCount=0;





    public void setTitle(String title,String artist,int playCount){

        this.title=title;
        this.artist=artist;
        this.playCount=playCount;
    }

    public void getTitle(){

        System.out.println(title+artist+playCount);
    }

    public void setArtist(String title,String artist,int playCount){

        this.title=title;
        this.artist=artist;
        this.playCount=playCount;
    }
    public void getArtist(){

        System.out.println(title+artist+playCount);

    }
}
