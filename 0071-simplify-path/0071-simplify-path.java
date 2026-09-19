class Solution {
    public String simplifyPath(String path) {
        String[] a = path.split("/");
        Stack<String> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (a[i].equals(".") || a[i].equals("")) {
                continue;
            } else {
                s.push(a[i]);
            }
        }
        String[] arr = new String[s.size()];
        int count = s.size() - 1;
        while (!s.isEmpty()) {
            arr[count] = s.pop();
            count--;
        }
        if (arr.length == 0) {
            return "/";
        }
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            res.append("/").append(arr[i]);
        }

        return res.toString();

    }
}