
// Question: A distinct string is a string that is present only once in an array.

// Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

// Note that the strings are considered in the order in which they appear in the array.

// Example:
// Input: arr = ["d","b","c","b","c","a"], k = 2
// Output: "a"

class KthDistinct {
    public String kthDistinct(String[] arr, int k) {
        
        Set<String> set= new LinkedHashSet<>();
        Set<String> dupli= new LinkedHashSet<>();
        for(String a: arr)
        {
            if(set.contains(a))
            {set.remove(a);
            dupli.add(a);
            }
            else if(!dupli.contains(a))
               set.add(a);
        }
        
        if(k-1>=set.size()) return "";
        List<String> l = new ArrayList<>(set);
        return l.get(k-1);

    }
}
