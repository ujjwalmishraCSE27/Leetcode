class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String>l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0)
               l.add(i-1,"FizzBuzz");
            else if(i%3==0)
               l.add(i-1,"Fizz");
            else if(i%5==0)
               l.add(i-1,"Buzz");
            else{
                l.add(i-1,String.valueOf(i));
            }
        }
        return l;
    }
}