class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> st = new HashMap<>();

        for (int i = 0; i < knowledge.size(); i++) {
            st.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        int f = -1;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                f = i;
            }
            else if (s.charAt(i) == ')') {

                String temp = s.substring(f + 1, i);

                if (st.containsKey(temp)) {
                    sb.append(st.get(temp));
                }
                else {
                    sb.append("?");
                }

                f = -1;
            }
            else if (f == -1) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}