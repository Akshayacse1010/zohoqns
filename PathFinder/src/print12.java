import java.util.ArrayList;

class print12{
    static String lookandsay(int n) {
        //your code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(n-- != 1){
            ArrayList<Integer> temp = new ArrayList<>();
            int c = 1;
            for(int i = 0;i < ans.size(); i++){
                if( i == ans.size() - 1){
                    temp.add(c);
                    temp.add(ans.get(ans.size()-1));
                }
                else if(ans.get(i) == ans.get(i+1)){
                    c++;
                }
                else if(ans.get(i) != ans.get(i+1)){
                    temp.add(c);
                    temp.add(ans.get(i));
                    c = 1;
                }
            }
            ans.clear();
            ans.addAll(temp);
        }
        String s = "";
        for(int i = 0; i < ans.size(); i++){
            s+= String.valueOf(ans.get(i));
        }
        return s;
    }
}