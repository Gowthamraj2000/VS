import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)  {
        String s = "K1:L2";
        int start = s.charAt(1);
        int end = s.charAt(4);
        char startCol = s.charAt(0);
        char endCol = s.charAt(3);
        List<String> list = new ArrayList<String>();
        for(int i=start;i<end;i++){
            for(char a=startCol;a<endCol;a++){
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(a);
                list.add(sb.toString());
                
            }
        }
        System.out.println(list); 
        
    }
}
