import java.io.*;

class Movie_Input
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        //Take the length of the name and length of the movies from the database.
        //Assuming these are the movies and storing them in arrays
        String movie_name[]={"Chef", "Jumper", "Prestige", "Shawshank Redemption", "Pursuit of Happyness", "The Lucky One","The Game Plan"};
        int l1=movie_name.length;
        int movie_length[]={120,109,142,135,129,129,120};
        int l2=movie_length.length;
        
        if(l1!=l2)
        {
            System.out.println("Fatal Error.");
        }
        else
        {
            System.out.println("Duration of the journey:  ");
            int travel_time=Integer.parseInt(br.readLine()); 
        
            movie_list(movie_name,movie_length,travel_time,l1);
        }       
        
    }
    void movie_list(String [] movie_name, int [] movie_length, int travel_time, int l)throws IOException
    {
        int i;
        System.out.println("Serial No.\t Movie_name\tMovie Duration");
        for(i=0;i<l;i++)
        {
            System.out.println((i+1)+"\t\t"+movie_name[i]+"\t\t"+movie_length[i]);
        }     
        boolean result=sort(movie_name,movie_length,travel_time, l);
        if (result==false)
        {
            System.out.println("Sorry! No two movie durations match the exact duration of your journey.");
        }
        else
        {
            System.out.println("\nYou can watch the movies listed above.");
        }
    }
    
    boolean sort(String [] movie_name, int [] movie_length, int travel_time,int l) throws IOException
    {
        int i,j, x=0;
       // System.out.println("\n \nYou can watch the following movies in the given order:");
        System.out.println("\n \n");
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(movie_length[i]+movie_length[j]==travel_time)
                {
                    System.out.println((x+1)+"."+movie_name[i]+" and "+movie_name[j]);
                    x++;
                    
                }
            }
        }
        if(x>0)
            return true;
        else
            return false;
    }
}
class Movies
{
    public static void main(String args[])throws IOException
    {
        Movie_Input obj=new Movie_Input();
        obj.input();    
    }
}