public class StrReal implements strs{
    @Override
    public String invertStr(String mystr) {
        String answer = "";
        for(int i = mystr.length()- 1; i >= 0; i--){
            answer += mystr.charAt(i);
        }
        return answer;
    }

    @Override
    public int count(String mystr) {
        return mystr.length();
    }

    @Override
    public String oddStr(String mystr) {
        String answer = "";
        for(int i = 1; i < mystr.length(); i += 2){
            answer += mystr.charAt(i);
        }
        return answer;
    }
}
