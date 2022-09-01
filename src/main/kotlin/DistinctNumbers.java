public class DistinctNumbers{

    public String getDistinct(String s,int n){

        int curr_max = s.charAt(0);
        int max = curr_max;

        while(n<2){
            for (int i=1;i<s.length();i++){

                if(s.charAt(i)!=curr_max){
                    max = Math.max(curr_max,curr_max);
                }
            }
        }


      return s;
    }
}
