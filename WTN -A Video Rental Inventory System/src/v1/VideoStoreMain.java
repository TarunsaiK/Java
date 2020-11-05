package v1;
import java.util.*;
public class VideoStoreMain {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        VideoStore vs=new VideoStore();
        String title="";
        double rating=0.0;
        int flag=0;
        while(flag!=1)
        {
        System.out.println(" 1.Add Video\n 2.Checkout\n 3.Return Video\n 4.Rating\n 5.List of videos checkedout\n");
        int op=sc.nextInt();
        switch(op)
        {
        case 1:
            System.out.println("Enter title and Rating");
            title=sc.next();
            rating=sc.nextDouble();
            vs.addVideo(title,rating);
            break;
        case 2:
            System.out.println("Enter title");
            title=sc.next();
            vs.checkOut(title);
            break;
        case 3:
            System.out.println("Enter title");
            title=sc.next();
            vs.returnVideo(title);
            break;
        case 4:
            System.out.println("Enter Title and Rating");
            title=sc.next();
            rating=sc.nextDouble();
            vs.receiveRating(title, rating);
            break;
        case 5:
            vs.inventoryList();
        default:
            flag=1;
            break;
            
        }
        }
         }

 

}

