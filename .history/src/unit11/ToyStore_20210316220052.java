package unit11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Sortbycount implements Comparator<Toy>
{
    // Used for sorting in descending order of
    // count
    public int compare(Toy a, Toy b)
    {
        return ( b.getCount()-a.getCount() );
    }
}

public class ToyStore {
   private ArrayList<Toy> toyList;
   public ToyStore(){
       toyList=new ArrayList<Toy>();
   }
   public void loadToys(String toys){
       String a[]=toys.split(" ");
       for(int i=0;i<a.length;i++){
           int j;
           for(j=0;j<toyList.size();j++){
               if(toyList.get(j).getName().equalsIgnoreCase(a[i])){
                   toyList.get(j).setCount(toyList.get(j).getCount()+1);
                   break;
               }
           }
           if(j==toyList.size()){
               Toy t1=new Toy();
               t1.setName(a[i]);
               t1.setCount(1);
               toyList.add(t1);
           }
       }
   }
   public Toy getThatToy(String nm){
       for(int i=0;i<toyList.size();i++){
           if(toyList.get(i).getName().equalsIgnoreCase(nm)){
               return toyList.get(i);
           }
       }
       return null;
   }
   public String getMostFrequentToy(){
       String frequent="";
       int max=0;
       for(int i=0;i<toyList.size();i++){
           if(toyList.get(i).getCount()>max){
               max=toyList.get(i).getCount();
           }
       }
      
       if(max!=0){
           for(int i=0;i<toyList.size();i++){
               if(toyList.get(i).getCount()==max){
                   frequent+=toyList.get(i).getName()+"\n";
               }
           }
       }
       return frequent;
   }
   public void sortToysByCount(){
       Collections.sort(toyList,new Sortbycount());
   }
   public String toString(){
       String output="";
       for(int i=0;i<toyList.size()-1;i++){
           output+=toyList.get(i).getName()+" "+toyList.get(i).getCount()+",";
       }
       output+=toyList.get(toyList.size()-1).getName()+" "+toyList.get(toyList.size()-1).getCount();
       return output;
   }

}