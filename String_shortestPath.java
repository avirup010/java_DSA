public class String_shortestPath {

    public static float shortest_path(String str){
        int y =0,x=0;
        for(int i =0;i<str.length();i++){
            int dir = str.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2= y*y;
        float dist = (float)Math.sqrt(y2+x2);
        return dist;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        String str2 = "NSS";
       System.out.println(shortest_path(str2)); 
        
    }
}
