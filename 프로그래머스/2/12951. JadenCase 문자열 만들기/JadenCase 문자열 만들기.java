class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ",-1);
        for(int i=0; i<arr.length; i++) {
            String word = arr[i];
            if (word.length() == 0) {
                sb.append("");
            } else {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
            }
            if(i != arr.length-1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}