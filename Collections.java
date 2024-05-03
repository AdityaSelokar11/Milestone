//HashMap
// You are using Java
//HashMap 

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>map=new HashMap<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String arr[]=sc.nextLine().split(", ");
            String a=arr[0];
            int b=Integer.parseInt(arr[1]);
            map.put(a,b);
            
        }
        String search=sc.nextLine();
        
        if(map.containsKey(search)){
            System.out.println(search+" is present in the list");
        }
        else{
            
            System.out.println(search+" is not present in the list");
        }
        map.forEach((k,v)->System.out.println(k+"-"+v));
        String remove=sc.nextLine();
        if(map.containsKey(remove)){
            map.remove(remove);
            
            System.out.println(remove+"is removed from  the list");
        }
        else{
            
            System.out.println(remove+" does not exists in  the list");
        }
        System.out.println("Updated List");
        map.forEach((k,v)->System.out.println(k+"-"+v));
    }
}




//ArrayList

// You are using Java
import java.util.*;
class Main{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String>list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            String a=sc.nextLine();
            list.add(a);
            
            
        }
        String search=sc.nextLine();
        if(list.contains(search)){
            System.out.println(search+" is present in the list");
        }
        else{
            
            System.out.println(search+" is not present in the list");
        }
        String remove= sc.nextLine();
        if(list.contains(remove)){
            list.remove(remove);
            System.out.print(remove+" is removed from the list");
        }
        else{
            
            System.out.print(remove+" does not exist in  the list");
        }
        list.forEach((k)->System.out.println(k));
    }
}

//HashSet

// You are using Java
import java.util.*;
class Main{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        HashSet<String>set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            String a=sc.nextLine();
            set.add(a);
            
            
        }
        String search=sc.nextLine();
        if(set.contains(search)){
            System.out.println(search+" is present in the list");
        }
        else{
            
            System.out.println(search+" is not present in the list");
        }
        String remove= sc.nextLine();
        if(set.contains(remove)){
            set.remove(remove);
            System.out.print(remove+" is removed from the list");
        }
        else{
            
            System.out.print(remove+" does not exist in  the list");
        }
        set.forEach((k)->System.out.println(k));
    }
}
