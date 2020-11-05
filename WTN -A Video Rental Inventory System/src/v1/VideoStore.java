package v1;
public class VideoStore {
    
    Video v[]=new Video[10];
    int i=0;
    public void addVideo(String title,double rating)
    {
        v[i]=new Video(title,false,rating);
        i++;
        
    }
    public void checkOut(String title)
    {
        for (int j=0;j<i;j++)
        {
            if (v[j].getTitle().equals(title))
            {
                v[j].beingCheckedOut(v[j]);
            }
        }
    }
    
    public void returnVideo(String title)
    {
        for (int j=0;j<i;j++)
        {
            if (v[j].getTitle().equals(title))
            {
                v[j].beingReturned(v[j]);

 

            }
        }
    }
    
    public void receiveRating(String title,double rating)
    {
        for (int j=0;j<i;j++)
        {
            if (v[j].getTitle().equals(title))
            {
                v[j].receiveRating(v[j], rating);
            }
        }
    }
    
    public void inventoryList()
    {
        for (int j=0;j<i;j++)
        {
            if (v[j].isCheckedout())
            {
                System.out.println(v[j].getTitle()+" "+v[j].getRating());
                System.out.println("");
            }
        }
    }
    
}